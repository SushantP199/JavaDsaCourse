import java.rmi.dgc.VMID;
import java.util.*;

class ArrayOperations {

    public static void main(String[] args) {
        
        /*
            1) Creating an Array
        */

        int[] marks = new int[50];
        // marks = {1, 2, 3, 4}; error : only allowed in declaration time & initialization at same time
        /* 
            above array named marks creates static (size of array cannot be changed in futher use)
            array of size 50 i.e. 50 memory blocks of each of int size allocated

            as no values are given to that 50 blocks they will hold default values of given data type
            i.e. 0 here as data type is int
        */ 

        int[] numbers = {1, 2, 3};
        /* 
            above array named numbers initialized with 3 set of values 1, 2 & 3

            hence numbers is static array of size 3 and integer type
        */

        int moreNumbers[]  = {4, 5, 6, 7, 8};
        /*
            another syntax to declare array where pair of square brackets are used after 
            variable name instead data type

            i.e. after data type mentioned till assignement operator in anywhere 
            before or after variable name compiler detects pair of square brackets
            then compiler undertand variable as a type of (datatype) array 
            or as a array data structure of given data type

            And 

            above array named moreNumbers initialized with 5 set of values 4, 5, 6, 7 & 8

            hence moreNumbers is static array of size 5 and integer type
        */

        String []fruits = {"apple", "mango", "orange"};
        /* 
            above array named fruits initialized with 3 set of values "apple", "mango" & "orange"

            hence fruits is static array of size 3 and string type
        */


        /*
            2) Input values in a Array
        */

        Scanner scanner = new Scanner(System.in);

        // like for regular int varaible => int marks = scanner.nextInt();
        marks[0] = scanner.nextInt(); // marks in physics
        marks[1] = scanner.nextInt(); // marks in chemistry
        marks[2] = scanner.nextInt(); // marks in maths
        scanner.close();

        /*
            3) Output values in a Array
        */

        // like for regular int varaible => System.out.println(marks);
        System.out.println("marks in physics = " + marks[0]);
        System.out.println("marks in chemistry = " + marks[1]);
        System.out.println("marks in maths = " + marks[2]);


        /*
            4) Update values in a Array
        */

        // like for regular int varaible => marks = 45;

        marks[2] = marks[2] + 3; // marks[2] = 100;
        System.out.println("marks in maths = " + marks[2]);

        
        /*
            Note : array name with index mentioned in pair of square brackets together
            denotes a single memory block as similar as regular variable
            denotes hence in above we see marks[index] (similar as marks single variable)
            used for input, output and update as we do same for regular variable marks
        */


        /*
            Some more things or operations using arrays
        */

        float percentageOfThreeSubjects = (marks[0] + marks[1] + marks[2]) / 3f;
        System.out.println(percentageOfThreeSubjects);

        System.out.println("Lenth of Array marks = " + marks.length);


        /*
            Why index of an array stars from 0 in java
            
            hints: 
            https://log2base2.com/c-questions/array/why-array-index-start-with-0.html
            https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/arrays_memory_management/topic
        */

        System.out.print("marks = " + marks);
    }
}