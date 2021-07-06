package task_3;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Group {
  private static final AtomicInteger CODE = new AtomicInteger(0);
  private int id;

  private final String name;

  SpecializationCode specializationCode;

  private final List<Student> studentsList;

  private Teacher curator;

  private final List<Subject> subjectsList;

  public Group(
      String name,
      List<Student> studentsList,
      Teacher curator,
      List<Subject> subjects,
      SpecializationCode code) {
    this.name = name;
    this.studentsList = studentsList;
    this.curator = curator;
    this.subjectsList = subjects;
    this.specializationCode = code;
    this.id = CODE.incrementAndGet();
  }

  public String getDecriptionofSpecializationCode() {
    return specializationCode.getDescription();
  }

  public void setSpecializationCode(SpecializationCode code) {
    this.specializationCode = code;
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

        Student foundStudent = group.getStudentsList().stream()
            .filter(student -> student.getId() == serialNum)
            .findAny()
            .orElseThrow(null);
    if (foundStudent != null) {
      addStudent(foundStudent);
    }
  }

  public void relocateStudentToAnotherGroup(int serialNum, Group group) {
    Student foundStudent =
        studentsList.stream()
            .filter(student -> student.getId() == serialNum)
            .findAny()
            .orElse(null);
    if (foundStudent != null){
      group.addStudent(foundStudent);
    }

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public List<Student> getStudentsList() {
    return studentsList;
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
