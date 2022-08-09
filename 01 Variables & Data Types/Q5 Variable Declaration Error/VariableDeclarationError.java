/*
    Question 5 : (Advanced)
    Will the following statementgive any error in Java ?
    
    int $ = 24;
*/

/*
    Rules for Naming Convention in Java :
    1) Variable names are case sensitive
    2) Identifier can be of unlimited length 
       (can consist of A-Z | a-z | 0-9 | underscore _ | dollar sign $)
    3) Always must begin with letter,
       Can be begin with $ (but we should avoid to use it) & _ (till java 8 & usually it is not used) as well
       But as io java 9 & onwards just a single underscore _ is keyword hence must not be used to begin identifier
       Subsequent characters may be letters, digits, dollar signs, or underscore characters
    4) Use full words instead of abbreviations
       Ex. int price; instead of int p;
    5) For one word use lowercase
       Ex. int price; instead of int p;

       For more words user lower camel case
       Ex. String firstName; instead of anything

       For constants use all uppercase and if more words are there use underscore _ between words
       Ex. static final float PIE = 3.14;
           Static final float EARTH_GRAVITY = 9.807f;
    6) Blank/White spaces cannot be used in variable names
    7) Java keywords cannot be used as variable names

    hint : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html#:~:text=Variable%20names%20are%20case%2Dsensitive,the%20underscore%20character%20%22%20_%20%22.
*/

public class VariableDeclarationError {
    
    public static void main(String[] args) {
        
        int $ = 24;
        /*
            As per one of the rule of variable naming convention in java,
            Variable name i.e. identifier can start with $ symbol
            (Although it is recommended to start identifier with letter only)

            Hence above statement doesn't give any error.
        */

        System.out.println($);
    }
}
