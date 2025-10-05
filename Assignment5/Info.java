package Assignment5;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {
    String author();
    String version() default "1.0";
}

@Info(author = "Joydeep", version = "2.0")
class MyClass {}
