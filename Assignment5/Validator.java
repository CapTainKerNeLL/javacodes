package Assignment5;

class User {
    @MinLength(5)
    String username = "Tom"; 
}

public class Validator {
    public static void main(String[] args) throws Exception {
        User user = new User();
        for (Field field : User.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(MinLength.class)) {
                MinLength ml = field.getAnnotation(MinLength.class);
                field.setAccessible(true);
                String value = (String) field.get(user);
                if (value.length() < ml.value()) {
                    System.out.println("Validation Failed: " + field.getName());
                }
            }
        }
    }
}
