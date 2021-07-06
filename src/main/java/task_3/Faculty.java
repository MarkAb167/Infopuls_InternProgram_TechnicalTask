package task_3;

import java.util.List;

public class Faculty {

  private String name;
  private final int id;
  private final List<Department> departmentList;

  public Faculty(String name, int id, List<Department> departmentList) {
    this.name = name;
    this.id = id;
    this.departmentList = departmentList;
  }

  public void addDepartment(Department department){
    departmentList.add(department);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }


  public List<Department> getDepartmentList() {
    return departmentList;
  }

  @Override
  public String toString() {
    return "Faculty{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", departmentList=" + departmentList +
            '}';
  }
}
