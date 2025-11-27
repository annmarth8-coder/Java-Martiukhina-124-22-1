package model;

import java.util.Objects;

// Зміна: head = Student замість Human
public abstract class UniversityUnit {
    protected String name;
    protected Student head;

    public UniversityUnit(String name, Student head) {
        this.name = name;
        this.head = head;
    }

    public String getName() { return name; }
    public Student getHead() { return head; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityUnit)) return false;
        UniversityUnit that = (UniversityUnit) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }

    @Override
    public String toString() {
        return name + " (Head: " + head + ")";
    }
}
