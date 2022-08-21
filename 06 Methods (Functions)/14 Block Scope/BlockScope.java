
public class BlockScope {

    public static void main(String[] args) {

        String anyStringVariable = "Any";
        System.out.println(anyStringVariable);

        {
            System.out.println(anyStringVariable);
            /*
                Here we can use anyStringVariable finely,
                As from the line of declaration till the end of method 
                i.e. till } closing curly brace of same method we can use anyStringVariable,
                Although anyStringVariable inside nested block { } still we can use it 
                from the line of declaration till end of the } curly brace of main() method in which it is defined
                
                This is Also a Method Scope of Variable.
            */

            int anyIntVariable = 5;

            System.out.println(anyIntVariable);
            /*
                Here we can use anyIntVariable finely,
                As from the line of declaration till the end of method 
                i.e. till } closing curly brace of same method we can use anyIntVariable.
                
                This is a Block Scope of Variable.
            */
        }
        
         /*
            System.out.println(anyIntVariable);

            Compiler will say anyIntVariable cannot be resolved to a variable.
            As anyIntVariable it is not define yet in this method openly.
            anyIntVariable is defined in { } block only & can be used in that scope only 
            We cannot be use anyIntVariable out of Block Scope.
        */


        for (int i = 0; i < args.length; i++) {

        }

        /*
            System.out.println(i);

            Compiler will say variable i cannot be resolved to a variable.

            i can be used within the for(...){ } Block Scope of for loop only
        */
    }
}
