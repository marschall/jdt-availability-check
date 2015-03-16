package com.github.marschall.jdtavailabilitycheck;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;

import javax.print.Doc;
import javax.servlet.http.Cookie;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventFactory;
import javax.xml.transform.TransformerFactory;

import sun.misc.Unsafe;

public class ClassLoaderBean {


  public boolean isCheckPossible() {
    Method isRegistered = getIsRegisteredMethod();
    return isRegistered != null
        && isRegistered.getReturnType() == Boolean.TYPE
        && Modifier.isStatic(isRegistered.getModifiers());
  }

  public boolean isApplicationClassLoaderThreadContextClassLoader() {
    return this.getApplicationClassLoader() == this.getThreadContextClassLoader();
  }

  public boolean isApiClassLoadedFromApplication() {
    return Cookie.class.getClassLoader() == ClassLoaderBean.class.getClassLoader();
  }

  public boolean isSeXmlClassLoadedFromApplication() {
    return XMLEventFactory.class.getClassLoader() == ClassLoaderBean.class.getClassLoader();
  }

  public boolean isSeClassLoadedFromApplication() {
    return Doc.class.getClassLoader() == ClassLoaderBean.class.getClassLoader();
  }

  public boolean isSeNonApiClassLoadedFromApplication() {
    return Unsafe.class.getClassLoader() == ClassLoaderBean.class.getClassLoader();
  }

  public String getThreadContextClassLoaderName() {
    return getThreadContextClassLoader().getClass().getName();
  }

  public boolean isThreadContextClassLoaderParallelCapable() {
    return isParallelCapable(getThreadContextClassLoader());
  }
  
  public String getParentClassLoaderName() {
    return getParentClassLoader().getClass().getName();
  }
  
  public boolean isParentClassLoaderParallelCapable() {
    return isParallelCapable(getParentClassLoader());
  }
  
  public String getParentUrls() {
    ClassLoader parentClassLoader = this.getParentClassLoader();
    if (parentClassLoader instanceof URLClassLoader) {
      URLClassLoader parent = (URLClassLoader) parentClassLoader;
      StringBuilder buffer = new StringBuilder();
      buffer.append("<ul>");
      for (URL url : parent.getURLs()) {
        buffer.append("<li>");
        buffer.append(url.toString());
        buffer.append("</li>");
      }
      buffer.append("</ul>");
      return buffer.toString();
    } else {
      return "";
    }
  }

  public String getApplicationClassLoaderName() {
    return getApplicationClassLoader().getClass().getName();
  }

  public boolean isApplicationClassLoaderParallelCapable() {
    return isParallelCapable(getApplicationClassLoader());
  }

  private ClassLoader getThreadContextClassLoader() {
    return Thread.currentThread().getContextClassLoader();
  }
  
  private ClassLoader getParentClassLoader() {
    return getApplicationClassLoader().getParent();
  }

  private ClassLoader getApplicationClassLoader() {
    return ClassLoaderBean.class.getClassLoader();
  }

  private boolean isParallelCapable(ClassLoader classLoader) {
    Method isRegisteredMethod = getIsRegisteredMethod();
    if (isRegisteredMethod == null) {
      return false;
    }
    try {
      Object result = isRegisteredMethod.invoke(null, classLoader.getClass());
      return (Boolean) result;
    } catch (ReflectiveOperationException e) {
      return false;
    }
  }


  public String getDocumentBuilderFactory() {
    return DocumentBuilderFactory.newInstance().getClass().getName();
  }

  public String getTransformerFactory() {
    return TransformerFactory.newInstance().getClass().getName();
  }

  public String getClassUrl() {
    // .getProtocol()
    // vfs:/content/jdt-availability-check.war/WEB-INF/classes/com/github/marschall/jdtavailabilitycheck/ClassLoaderBean.class
    // file:/Users/marschall/Hacking/Tomcat/apache-tomcat-8.0.15/webapps/jdt-availability-check/WEB-INF/classes/com/github/marschall/jdtavailabilitycheck/ClassLoaderBean.class
    String resourceName = ClassLoaderBean.class.getName().replace('.', '/') + ".class";
    return getApplicationClassLoader().getResource(resourceName).toString();
  }


  private Method getIsRegisteredMethod() {
    for (Class<?> clazz : ClassLoader.class.getDeclaredClasses()) {
      if (clazz.getName().equals("java.lang.ClassLoader$ParallelLoaders")) {
        try {
          Method isRegistered = clazz.getDeclaredMethod("isRegistered", Class.class);
          isRegistered.setAccessible(true);
          return isRegistered;
        } catch (NoSuchMethodException e) {
          return null;
        }
      }
    }
    return null;
  }

}
