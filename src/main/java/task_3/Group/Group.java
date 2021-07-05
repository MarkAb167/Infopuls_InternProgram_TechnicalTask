package task_3.Group;

import task_3.Student.Student;
import task_3.Subject.Subject;
import task_3.Teacher.Teacher;

import java.util.List;

public class Group {
  private static int CODE;

  private final String name;

  private final List<Student> studentsList;

  private Teacher curator;

  private final List<Subject> subjectsList;

  public Group(String name, List<Student> studentsList, Teacher curator, List<Subject> subjects) {
    this.name = name;
    this.studentsList = studentsList;
    this.curator = curator;
    this.subjectsList = subjects;
    CODE++;
  }

  public void addSubject(Subject subject) {
    subjectsList.add(subject);
  }

  public void rmSubject(Subject subject) {
    subjectsList.remove(subject);
  }

  public void addStudent(Student student) {
    studentsList.add(student);
  }

  public void getStudentFromAnotherGroup(int serialNum, Group group) {
    addStudent(
        group.getStudentsList().stream()
            .filter(student -> student.getSerialId() == serialNum)
            .findAny()
            .orElse(null));
  }

  public void relocateStudentToAnotherGroup(int serialNum, Group group) {
    group.addStudent(
        studentsList.stream()
            .filter(student -> student.getSerialId() == serialNum)
            .findAny()
            .orElse(null));
  }

  public static int getSpecializationCode() {
    return SPECIALIZATION_CODE;
  }

  public static void setSpecializationCode(int specializationCode) {
    SPECIALIZATION_CODE = specializationCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudentsList() {
    return studentsList;
  }

  public void setStudentsList(List<Student> studentsList) {
    this.studentsList = studentsList;
  }

  public Teacher getCurator() {
    return curator;
  }

  public void setCurator(Teacher curator) {
    this.curator = curator;
  }

  public List<Subject> getSubjectsList() {
    return subjectsList;
  }

  public void setSubjectsList(List<Subject> subjectsList) {
    this.subjectsList = subjectsList;
  }

  @Override
  public String toString() {
    return "Group{"
        + "name='"
        + name
        + '\''
        + ", studentsList="
        + studentsList
        + ", curator="
        + curator
        + ", subjectsList="
        + subjectsList
        + '}';
  }
}
