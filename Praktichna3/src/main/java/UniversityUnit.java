package model;

public abstract class UniversityUnit {
    protected String name;
    protected Human head;

    public UniversityUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() { return name; }
    public Human getHead() { return head; }

    @Override
    public String toString() {
        return name + " (Head: " + head + ")";
    }
}
