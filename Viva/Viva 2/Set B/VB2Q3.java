import java.util.Scanner;

public class VB2Q3 {

    public static boolean isLuckyTicket(String ticket) {

            String[] array = ticket.split("");
            int sumFirstHalf = 0, sumSecondHalf = 0;

            for (int i = 0; i < array.length / 2; i++) {
                sumFirstHalf += Integer.valueOf(array[i]);
            }

            for (int i = array.length / 2; i < array.length; i++) {
                sumSecondHalf += Integer.valueOf(array[i]);
            }

            return (sumFirstHalf == sumSecondHalf) ? (true) : (false);
    }

    public static boolean isTicketValid(String ticket) {

        if (ticket.length() % 2 != 0) {
            return false;
        } else {
            try {
                Integer.parseInt(ticket);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.print("Enter ticket number: ");
        Scanner input = new Scanner(System.in);
        String ticketNumber = input.next();

        if (isTicketValid(ticketNumber)) {
            System.out.println((isLuckyTicket(ticketNumber)) ? ("Lucky") : ("Unlucky"));
        } else {
            System.out.println("Invalid ticket number");
        }
    }
}
