public class Plane {
  private boolean cargo;

  /**
   * Constructs a Plane object with specific cargo status
   * @param c Cargo? (T/F)
   */
  public Plane(boolean c) {
    this.cargo = c;
  }

  /**
   * Empty constructor for Plane
   */
  public Plane() {
    this.cargo = false;
  }

  /**
   * Getter method for cargo instance variable
   * @return cargo
   */
  public boolean hasCargo() {
    return this.cargo;
  }
}