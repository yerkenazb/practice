package mindtek.streams;

import java.util.List;

public class Parent {

    private String name;
    private Character gender;
    private List<String> children;

    public Parent(String name, Character gender, List<String> children) {
        this.name = name;
        this.gender = gender;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", children=" + children +
                '}';
    }
}
