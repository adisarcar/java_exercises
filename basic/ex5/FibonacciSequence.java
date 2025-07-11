package basic.ex5;/*  */

public class FibonacciSequence {
    public static void main (String[]args) {/*  */
        int i=0; /*  */
        int j=1; /*  */
        System.out.println(i); /*  */
        System.out.println(j); /*  */
        while (i<50 && j<50) {
            i=i+j;
            if (i>=50)
                break;
            System.out.println(i);
            j=i+j;
            System.out.println(j);/*  */ }
    }/*  */
}/*  */