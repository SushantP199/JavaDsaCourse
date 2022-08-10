
public class ElseIfStatements {
    
    public static void main(String[] args) {
        
        int age = 15;

        // if else ladder (else if statements)
        if (age >= 18){
            System.out.println("adult: drive, vote");
        } else if ( age > 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }
        /*
            By writing else if statements (if else ladder) 
            we save compilers computational time 
            as this avoids extra check mark on 
            individual if statements or if else statements
        */
    }
}
