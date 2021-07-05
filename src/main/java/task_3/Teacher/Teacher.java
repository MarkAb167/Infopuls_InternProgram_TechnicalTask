package task_3.Teacher;

import task_3.Subject.Subject;

import java.util.List;

public class Teacher {
    private String name;
    private String surname;
    private List<Subject> subjectsList;

    public Teacher(String name, String surname, List<Subject> subjectsList) {
        this.name = name;
        this.surname = surname;
        this.subjectsList = subjectsList;
    }
    public void addSubject(Subject subject){
        subjectsList.add(subject);

    }
    public void rmSubject(Subject subject){
        subjectsList.remove(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subjectsList=" + subjectsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name) && surname.equals(teacher.surname);
    }

}
