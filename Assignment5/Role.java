package Assignment5;

import java.lang.annotation.*;

@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

@Role("Admin")
@Role("User")
class Employee {}

