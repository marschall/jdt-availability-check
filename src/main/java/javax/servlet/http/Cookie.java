package javax.servlet.http;

import java.io.Serializable;

public class Cookie implements Cloneable, Serializable {

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("not cloneable");
        }
    }

}
