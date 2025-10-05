package Assignment5;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Tags {
    String[] value();
}

@Tags({"Java", "Backend", "Spring"})
class Project {}

