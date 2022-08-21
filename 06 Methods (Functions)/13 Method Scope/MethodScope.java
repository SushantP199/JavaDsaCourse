
public class MethodScope {

    public static void anyMethod() {
        
        String anyStringVariable = "Any";
        System.out.println(anyStringVariable);
        /*
            Here we can use anyStringVariable finely,
            As from the line of declaration till the end of method 
            i.e. till } closing curly brace of same method we can use anyStringVariable.
            i.e. anyStringVariable can be used within this method only

            This a Method Scope of Variable.
        */
    }
    
    public static void main(String[] args) {

        /*
            System.out.println(anyIntVariable);

            Compiler will say anyIntVariable cannot be resolved to a variable.
            As anyIntVariable it is not define yet in this method itself.
        */

        int anyIntVariable = 5;

        System.out.println(anyIntVariable);
        /*
            Here we can use anyIntVariable finely,
            As from the line of declaration till the end of method 
            i.e. till } closing curly brace of same method we can use anyIntVariable.

            This is a Method Scope of Variable.
        */

        anyMethod();

        /*
            System.out.println(anyStringVariable);

            Compiler will say anyStringVariable cannot be resolved to a variable.
            As anyStringVariable it is not define yet in this method itself.
            It is defined in anyMethod() method only.
            We cannot be use anyStringVariable out of method scope.
            i.e. anyStringVariable can be used within anyMethod() method only
        */
    }
}
