public class WhileDoWhile {
    public static void main(String[] args) {

        int counter = 0;


        /*
        While(expresia este adevarata/conditia de oprire) {
            //blocul de cod
        }
         */

        while(counter < 25){
            System.out.println("WHILE - counter-ul are valoarea:" + counter);
            counter ++;

        }
        System.out.println("------------------------------");
        /*
        do{
        //blocul de cod
        } while (conditia sau expresia este adevarata/conditia de oprire);
         */
        counter = 0;
        do {
            System.out.println("DoWHILE - counter-ul are valoarea: " + counter);
            counter++;
        }while(counter < 25);
    }
}
