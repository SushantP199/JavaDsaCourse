
public class Logical {

    public static void main(String[] args) {
        
        // logical and &&
        System.out.println((2 > 1) && (3 > 2));
        System.out.println((3 != 2) && (2 < 1));
        System.out.println((2 < 1) && (3 > 2));
        System.out.println((2 == 1) && (3 < 2));

        // logical or ||
        System.out.println((2 > 1) || (3 > 2));
        System.out.println((3 != 2) || (2 < 1));
        System.out.println((2 < 1) || (3 > 2));
        System.out.println((2 == 1) || (3 < 2));

        // logical not !
        System.out.println(!(3 > 2));
        System.out.println(!(1 == 2));
    }
}
