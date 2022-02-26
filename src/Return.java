public class Return {
    public static void main (String [] args){
        int sum = 0 ;
        int a = 6;
        int b = 18;

        sum= sum(a , b);
        System.out.println("Sum is: " + sum);
        doPrint(sum);
        int c = 17;
        int d = 30;
         sum = sum (c , d);
        System.out.println("Sum is " + sum);
        doPrint(sum);
    }

    public static int sum(int operandOne , int operandTwo){
        System.out.println("Calculating sum of " + operandOne + "and" + operandTwo);
        return operandOne+operandTwo;
    }
    public static void doPrint(int sum) {
        if(sum < 30){
            return;
        }
        System.out.println("This sum is awesome");
    }
}
