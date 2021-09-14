public class App {
        public static void main(String[] args) throws Throwable {}  //okay
}

/*
public class App {
    public static void main(String[] args) throws String {}
}

compilation error - expected Throwable, found String
 */

/*
catch:

public class App {
    public static void main(String[] args) {
        try {
        } catch (Throwable t) {}
    }
}

can be used
*/

/*
public class App {
    public static void main(String[] args) {
        try {
        } catch (String s) {}
    }
}

compilation error - expected Throwable, found String
 */

/*
throw (Error - child of Throwable):
public class App {
    public static void main(String[] args) {
        throw new Error();
    }
}

can be used
 */

/*
public class App {
    public static void main(String[] args) {
        throw new String("Hello!");
    }
}

compilation error - expected Throwable, found String
 */

/*
throw:
public class App {
    public static void main(String[] args) {
        throw null;
    }
}

throw requires a non-null argument otherwise causes a
RUNTIME ERROR: Exception in thread "main" java.lang.NullPointerException
*/

/*
throw can be used:

public class App {
    public static void main(String[] args) {
        Error ref = new Error(); // creating an object
        throw ref;               // throwing it
    }
}
>> RUNTIME ERROR: Exception in thread "main" java.lang.Error

 */

/*
throw incorrect - causes StackOverflowError

public class App {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}
 */