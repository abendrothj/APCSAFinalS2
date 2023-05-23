import java.util.ArrayList;

public class ATC {
  private static ArrayList<Flight> flights = new ArrayList();

  /**
   * Creates a Flight object and adds it to the ArrayList flights using the param
   * @param f flight to add
   */
  public static void addFlight(Flight f) { flights.add(f); }

  /**
   * Determines the pilot's landing status, and either approves their landing or denies it
   * if not in records, while specifying which sector to land in based on cargo.
   * @param fn Flight number to queue
   * @return Status of landing request
   */
  public static String queue(int fn) {
    Flight p = new Flight(fn);
    for(Flight test : flights) {
      if(test.getFNum() == p.getFNum() && !test.hasCargo()) {
        return "Landing request approved. You may land in sector 1, good sir.";
      }
      else if(test.getFNum() == p.getFNum() && test.hasCargo()) {
        return "Landing request approved. You may land in sector 2, good sir.";
      }
    } return "Landing request denied. Wrong airport. Bad pilot.";
  }
}