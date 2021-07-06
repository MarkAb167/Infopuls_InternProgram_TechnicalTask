package task_1;

public class Equation {
  private final double c;
  private final double d;

  public Equation(double c, double d) {
    this.c = c;
    this.d = d;
  }

  public double calculate(int i, int j) {
    return Math.sqrt(Math.abs(Math.sin(Math.sin(c)) - (4 * Math.log(Math.log(d)) / Math.pow(i, j))));
  }

}
