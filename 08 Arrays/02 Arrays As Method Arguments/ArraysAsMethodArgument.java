/*
    Is java Pass-by-value, if we pass reference type as argument to o method paramter?

    hints: 
    https://www.cs.virginia.edu/~jh2jf/courses/cs2110/java-pass-by-value.html#:~:text=Java%20is%20officially%20always%20pass,the%20reference%20for%20reference%20types
    https://www.digitalocean.com/community/tutorials/java-is-pass-by-value-and-not-pass-by-reference
    https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/classes-and-structs/passing-parameters
    https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/classes-and-structs/passing-value-type-parameters
    https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/classes-and-structs/passing-reference-type-parameters
*/

public class ArraysAsMethodArgument {

    public static void updateMarks (int[] marks, int totalMarks) {

        marks[0] = marks[0] + 1;
        marks[1] = marks[1] + 1;
        marks[2] = marks[2] + 1;
        totalMarks = marks[0] + marks[1] + marks[2];

        marks = new int[] {55, 67, 45};
        /*
            Way to use array initializer syntax for already declared array
            We use new int[] and then {} curly braces with values
            DO NOT NEVER EVER write size of array in [] square brackets with this syntax
        */
        /*
            memory allocated for array new int[] {55, 67, 45} (i.e. local array marks)
            will be freed as it will no longer referenced by any variable in stack to this particular
            exact array 

            more hint: https://www.geeksforgeeks.org/garbage-collection-java/#:~:text=But%20in%20Java%2C%20the%20programmer,memory%20by%20destroying%20unreachable%20objects.
        */


        System.out.println("\nIn method call: updateMarks(marks);");
        System.out.println("marks[0] = " + marks[0] + ", marks[1] = " + marks[1] + ", marks[2] = " + marks[2]);
        System.out.println("marks = " + marks);
        System.out.println("totalMarks = " + totalMarks);
    }
    
     public static void main(String[] args) {
        
        int marks[] = {69, 99, 79};
        int totalMarks = marks[0] + marks[1] + marks[2];

        System.out.println("\nBefore method call: updateMarks(marks);");
        System.out.println("marks[0] = " + marks[0] + ", marks[1] = " + marks[1] + ", marks[2] = " + marks[2]);
        System.out.println("marks = " + marks);
        System.out.println("totalMarks = " + totalMarks);

        updateMarks(marks, totalMarks);

        System.out.println("\nAfter method call: updateMarks(marks);");
        System.out.println("marks[0] = " + marks[0] + ", marks[1] = " + marks[1] + ", marks[2] = " + marks[2]);
        System.out.println("marks = " + marks);
        System.out.println("totalMarks = " + totalMarks);
    }
}
