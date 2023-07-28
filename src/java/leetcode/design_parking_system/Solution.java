/*
 * @lc app=leetcode id=1603 lang=java
 *
 * [1603] Design Parking System
 */
import java.util.Arrays;
// @lc code=start
class ParkingSystem {
  private int big = 0;
  private int medium = 0;
  private int small = 0;

  public static void main(String[] args) {
    ParkingSystem ps = new ParkingSystem(1, 1, 0);
    boolean[] results = new boolean[4];
    results[0] = ps.addCar(1);
    results[1] = ps.addCar(2);
    results[2] = ps.addCar(3);
    results[3] = ps.addCar(1);
    System.out.println(Arrays.toString(results));
  }
  public ParkingSystem(int big, int medium, int small) {
    this.big = big;
    this.medium = medium;
    this.small = small;
  }
  public boolean addCar(int carType) {
    switch (carType) {
    case 1: {
      if (this.big > 0) {
        this.big--;
        return true;
      }
      return false;
    }
    case 2: {
      if (this.medium > 0) {
        this.medium--;
        return true;
      }
      return false;
    }
    case 3: {
      if (this.small > 0) {
        this.small--;
        return true;
      }
      return false;
    }
    default:
      return false;
    }
  }
}
// @lc code=end
