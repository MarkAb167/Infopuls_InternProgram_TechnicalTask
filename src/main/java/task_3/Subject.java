package task_3;

import java.util.concurrent.atomic.AtomicInteger;

public class Subject {
    private static final AtomicInteger ID = new AtomicInteger(0);

    private final String name;

    private int id;

    public Subject( String name) {
        this.id = ID.incrementAndGet();
        this.name = name;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id && name.equals(subject.name);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
