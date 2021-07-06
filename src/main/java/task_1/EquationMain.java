package task_1;

public class EquationMain {

  public static void main(String[] args) {
    int num = 10;

    Matrix matrix = new Matrix(num);
    Equation equation = new Equation(-1.49, 23.4);

    for (int i = 0; i < matrix.elements.length; i++) {
      for (int j = 0; j < matrix.elements[i].length; j++) {
       matrix.elements[i][j] = equation.calculate(i,j);
      }
    }


  }


}
