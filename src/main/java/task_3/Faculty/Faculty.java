package task_3.Faculty;

import task_3.Department.Department;

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

  public void setId(int id) {
    this.id = id;
  }

  public List<Department> getDepartmentList() {
    return departmentList;
  }

  public void setDepartmentList(List<Department> departmentList) {
    this.departmentList = departmentList;
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
