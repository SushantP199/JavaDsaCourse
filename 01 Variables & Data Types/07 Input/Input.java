import java.util.*;

public class Input {

    public static void main(String args[]){

        /*
            Scanner(System.in)

            System.in - an object of InputStream which receives the data in the form of bytes from the keyboard.
            Scanner() - task of reading and decoding the bytes into characters is done
        */ 
        Scanner scanner = new Scanner(System.in);
                   
        /*
            Whenever we called scanner.next()

            scanner object - contains converted character data (as first get byte data by System.in Stream from keyboard inputs, then converted into characters by Scanner())
            next() method - call of this method on scanner object returns next token or word (next string till the space)

            hint : https://www.tutorialspoint.com/java/util/scanner_close.htm ScannerDemo class 
        */
        // String input = scanner.next();
        // System.out.println(input);

        // nextLine() method - returns complete next line (till end of the line including space i.e. \n)
        // String name = scanner.nextLine();
        // System.out.println(name);

        // int number = scanner.nextInt();
        // System.out.println(number);

        // float price = scanner.nextFloat();
        // System.out.println(price);

        // byte apples = scanner.nextByte();
        // System.out.println(apples);

        // short cameras = scanner.nextShort();
        // System.out.println(cameras);

        // long population = scanner.nextLong();
        // System.out.println(population);

        // double liters = scanner.nextDouble();
        // System.out.println(liters);

        /*
            Keyboard entered values case ignored for false or true words only 
            like input canbe FalSe, tRUE 
            but input never out of true or false
            
            because nextBoolean(),
            first boolPattern()  - check pattern of scanner object content string 
                                   if it is out of true|false mismatch error will be returned
            
            second next()        - token is returned for faLSE -> "faLSE" returned 
                                   token is returned for tRUE -> "tRUE" returned
            
            third parseBoolean() - will return "true".equalsIgnoreCase("faLSE")
                                   will return "true".equalsIgnoreCase("tRUE")

            finally value assigned to variable is - isLoggedIn = false;
                                                  - isLoggedIn = true;
        */ 
        boolean isLoggedIn = scanner.nextBoolean(); 
        System.out.println(isLoggedIn);

        // char character = scanner.next().charAt(0);
        // System.out.println(character);

        scanner.close();
    }
}

/*
    why java uses 2 byte for char ?

    Java support more than 18 international languages so java take 2 byte for characters, 
    because for 18 international language 1 byte of memory is not sufficient for storing all characters 
    and symbols present in 18 languages
*/