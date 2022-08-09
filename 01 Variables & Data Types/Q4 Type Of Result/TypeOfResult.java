/*
    Question 4 :
    What will be the type of result in the following Java code ?
    
    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;

    result = (f * b) + (i % c) - (d * s);
*/

public class TypeOfResult {
    
    public static void main(String[] args) {
        
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        var result = (f * b) + (i % c) - (d * s);
        /*
            Ans : type of result is Double
            As one big size data type double is exists in above expression
            hence other types will promoted to double by Type Promotion (loosely Type Conversion)
            and return double type data or value only. 
        */

        System.out.println(result);
    }
}
