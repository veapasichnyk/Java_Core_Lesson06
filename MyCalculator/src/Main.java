import com.lgs.lab.interface2.MyCalculator;

public class Main {
    public static void main ( String arg []) {
        MyCalculator result = new MyCalculator ( 23, 57);
        System.out.println ("a + b = " + result.Add ());
        System.out.println ( "a * b = " + result.Multiply ());
        System.out.println ("a - b = " + result.Subtract () );
        System.out.println ("b/a = " + result.Divide () );

    }
}
