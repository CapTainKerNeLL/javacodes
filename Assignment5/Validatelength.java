package Assignment5;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValidateLength {
    int min() default 1;
    int max() default 255;
}

