import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
       int a=2, b=4, c;
       c = a&b;
       System.out.println("a and b"+ c);
       c = a|b;
       System.out.println("a or b = "+ c);
       c = a^b;
       System.out.println("a ex or b ="+ c);
       c = ~a;
       System.out.println("not a ="+ c);
       c = a << 2;
       System.out.println("a geser kiri = "+c);
       c = a>>2;
       System.out.println("a geser kanan = "+ c);
        
    }
    
}
