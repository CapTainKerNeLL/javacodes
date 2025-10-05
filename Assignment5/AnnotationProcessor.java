package Assignment5;

import java.lang.reflect.*;

public class AnnotationProcessor {
    public static void main(String[] args) {
        Class<MyClass> obj = MyClass.class;
        
        if (obj.isAnnotationPresent(Info.class)) {
            Info info = obj.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
        }
    }
}

