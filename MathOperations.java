
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[] args){
    
        int a=10;
        int b=20;
        
        //Arithemetic operator
        
        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        
        System.out.println ("Sum = "+sum);
        System.out.println ("Difference = "+sub);
        System.out.println ("Product = "+mul);
        System.out.println ("Division = "+div);
        
        //unary operator
        
        System.out.println (a++);
        System.out.println (++a);
        
        //assignment
        
        int p= 10;
        int q= 20;
        int r= a+b;
        
        //relational operator
        
        int x=3;
        int y=3;
        
        System.out.println (x == y);
        
        //logical operator
        
        System.out.println(a>b && a != b);
        
        //ternary operator
        
        String isValid = (a>b) ? "A is greater than B" : "B is greater than A";
        System.out.println(isValid);
    }
}