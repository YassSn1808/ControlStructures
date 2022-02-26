public class SwitchStatement {
    public static void main(String[] args) {

        int dayOfWeek = 7;
        /*
        0-este luni
        1-marti
        2-miercuri
        3-joi
        4-vineri
        5-sambata
        6-duminica
         */
        switch(dayOfWeek) {
            case 0:
                System.out.println("Luni");
                System.out.println("Inceput de saptamana!");
                break;
            case 1:
                System.out.println("Marti");
                break;
            case 2:
                System.out.println("Miercuri");
                break;
            case 3:
                System.out.println("Joi");
                break;
            case 4:
                System.out.println("Vineri");
                System.out.println("Prima zi de weekend!!");
                break;
            case 5:
                System.out.println("sambata");
                break;
            case 6:
                System.out.println("Duminica");
            break;
            default:
                System.out.println("Ce zi e asta?!");

        }
    }
}
