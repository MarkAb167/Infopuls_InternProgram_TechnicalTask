package task_3;

import task_3.Group;
import task_3.Teacher;

import java.util.List;

public class Department {
  private String name;
  private final int id;
  private List<Teacher> teachersList;
  private List<Group> groupsList;

  public Department(String name, int id, List<Teacher> teachersList, List<Group> groupsList) {
    this.name = name;
    this.id = id;
    this.teachersList = teachersList;
    this.groupsList = groupsList;
  }

  public void changeCurator(Group group, Teacher teacher){
    group.setCurator(teacher);
  }

  public void addGroup(Group group){
    groupsList.add(group);
  }
  public void addTeacher(Teacher teacher){
    teachersList.add(teacher);
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

  public List<Teacher> getTeachersList() {
    return teachersList;
  }

  public void setTeachersList(List<Teacher> teachersList) {
    this.teachersList = teachersList;
  }

  public List<Group> getGroupsList() {
    return groupsList;
  }

  public void setGroupsList(List<Group> groupsList) {
    this.groupsList = groupsList;
  }

  @Override
  public String toString() {
    return "Department{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", teachersList=" + teachersList +
            ", groupsList=" + groupsList +
            '}';
  }
}
