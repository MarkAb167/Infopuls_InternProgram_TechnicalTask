package task_3.Student;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger SERIAL_ID = new AtomicInteger(0);

    private int id;

    private String name;

    private String surname;

    private double averageScore;


    public Student(String name, String surname, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.averageScore = averageScore;
        this.id = SERIAL_ID.incrementAndGet();
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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
