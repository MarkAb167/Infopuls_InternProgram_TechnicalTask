package task_3.TheUniversity;

import task_3.Faculty.Faculty;
import task_3.Subject.Subject;

import java.util.List;

public class TheUniversity {
  private final String name;
  private final List<Faculty> facultyList;
  private final List<Subject> subjectsList;

  public TheUniversity(String name, List<Faculty> facultyList, List<Subject> subjectsList) {
    this.name = name;
    this.facultyList = facultyList;
    this.subjectsList = subjectsList;
  }

  public void addFaculty(Faculty faculty) {
    facultyList.add(faculty);
  }

  public void addSuject(Subject subject) {
    subjectsList.add(subject);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Faculty> getFacultyList() {
    return facultyList;
  }

  public void setFacultyList(List<Faculty> facultyList) {
    this.facultyList = facultyList;
  }

  public List<Subject> getSubjectsList() {
    return subjectsList;
  }

  public void setSubjectsList(List<Subject> subjectsList) {
    this.subjectsList = subjectsList;
  }

  @Override
  public String toString() {
    return "TheUniversity{"
        + "name='"
        + name
        + '\''
        + ", facultyList="
        + facultyList
        + ", subjectsList="
        + subjectsList
        + '}';
  }
}
