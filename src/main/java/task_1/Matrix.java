package task_1;

import sun.awt.SunToolkit;

public class Matrix {
  final Double[][] elements;

  public Matrix(int num) {
    elements = new Double[num][num];
  }

  public void readMatrixBySquare() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < elements.length; i++) {
      for (int j = 0; j < elements[i].length; j++) {
        if (j == 0) {
          builder.append("|" + "<<").append(elements[i][j]).append(">>");
        } else if (j == elements[i].length - 1) {
          builder.append("<<").append(elements[i][j]).append(">>").append("|").append("\n");
        } else {
          builder.append("<<").append(elements[i][j]).append(">>");
        }
      }
    }
    System.out.println(builder);
  }

  public Double getMatrixMaxBoundWithInfinity(){
    Double maxBound = elements[0][0];
    for (int i = 0; i <elements.length; i++) {
      for (int j = 0; j < elements[i].length; j++) {
        if (elements[i][j] > maxBound){
          maxBound = elements[i][j];
        }
      }
    }
    return maxBound;
  }

  public Double getMatrixMaxBoundWithOutInfinity(){
    Double maxBound = elements[0][0];
    for (int i = 0; i <elements.length; i++) {
      for (int j = 0; j < elements[i].length; j++) {
        if (elements[i][j] > maxBound){
          if (elements[i][j].isInfinite()){
            continue;
          }
          maxBound = elements[i][j];
        }
      }
    }
    return maxBound;
  }
}
