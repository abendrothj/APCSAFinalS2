import java.util.Scanner;

public class Main {
    /**
     * Initializes the list of allowed flight numbers to land and passes them to the Air Traffic Control Tower.
     */
    private static Flight[][] test = {
            {new Flight(1012), new Flight(1122, true), new Flight(1212)},
            {new Flight(1112, true), new Flight(4442), new Flight(1201, true)},
            {new Flight(9292), new Flight(7474, true), new Flight(4949)}
    };

    /**
     * Asks the pilot their flight number, and returns their landing status.
     * @param args
     */
    public static void main(String[] args) {
        for (Flight[] flights : test) {
            for (Flight flight : flights) {
                ATC.addFlight(flight);
            }
        }
        Scanner in = new Scanner(System.in);
        System.out.println("What's your flight number pilot?");
        int inputFN = in.nextInt();
        System.out.println(ATC.queue(inputFN));
    }
}
