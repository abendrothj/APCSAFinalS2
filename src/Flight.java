public class Flight extends Plane {
  private int fNum;

  /**
   * Creates a Flight object
   * @param fNum Flight number
   */
  public Flight(int fNum) {
    super();
    this.fNum = fNum;
  }

  /**
   * Creates a Flight object specifying cargo
   * @param fNum Flight number
   * @param car Cargo boolean
   */
  public Flight(int fNum, boolean car) {
    super(car);
    this.fNum = fNum;
  }

  /**
   * Returns the flight number of object
   * @return fNum
   */
  public int getFNum() {
    return this.fNum;
  }
}