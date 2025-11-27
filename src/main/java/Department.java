package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department extends UniversityUnit {
    private List<Group> groups = new ArrayList<>();

    public Department(String name, Student head) { super(name, head); }

    public void addGroup(Group group) { groups.add(group); }
    public List<Group> getGroups() { return groups; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        if (!super.equals(o)) return false;
        Department that = (Department) o;
        return Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), groups); }

    @Override
    public String toString() {
        return super.toString() + " groups=" + groups;
    }
}
