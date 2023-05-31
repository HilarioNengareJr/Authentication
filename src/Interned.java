import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) // ACCESSIBLE during runtime
public @interface Interned {
    String value() default  "Hello World"; // String element with a default value

}
