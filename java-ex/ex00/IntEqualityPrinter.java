public class IntEqualityPrinter {
    // write code here
    public static void printEqual(int a, int b,int c ){
        if (a < 0 || b < 0 || c < 0)
            System.out.println("Invalid Value");
        if ( a != b && b != c)
            System.out.println("All Number are different");
        if ( a == b && b == c)
            System.out.println("All Number are equal");
	else 
            System.out.println("Neither all are equal or different");
    }
}
