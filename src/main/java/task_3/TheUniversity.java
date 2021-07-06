package task_3;

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


  public List<Faculty> getFacultyList() {
    return facultyList;
  }


  public List<Subject> getSubjectsList() {
    return subjectsList;
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
