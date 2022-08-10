/* 
    Check if a student will pass or fail
    
    marks >=33 : PASS
    marks < 33 : Fail
*/

import java.util.*;

public class StudentWillPassOrFail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you marks : ");
        int marks = scanner.nextInt();
        scanner.close();

        String result = (marks >= 33) ? "PASS" : "FAIL";

        System.out.println("Student Will " + result);
    }

}
