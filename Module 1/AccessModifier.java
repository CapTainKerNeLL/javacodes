class Example {
    public int a = 10;     
    protected int b = 20;  
    int c = 30;           
    private int d = 40;    

    public void show() {
        System.out.println("Private d = " + d);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Example e = new Example();
        System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.c);
        e.show();
    }
}
