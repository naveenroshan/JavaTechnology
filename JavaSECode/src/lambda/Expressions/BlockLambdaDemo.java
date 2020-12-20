package lambda.Expressions;
/**
*
* @author Naveen
*/

//this class implements the functional interface NumericFunc
public class BlockLambdaDemo {

    public static void main(String[] args) {
        // This block lambda computes the factorial of an int value.
        NumericFunc factorial;
        factorial = (n) -> {
                            int result = 1;
                            for (int i = 1; i <= n; i++)
                            result = i * result;
                            return result;
                           };
        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 5 is " + factorial.func(5));
    }
}
