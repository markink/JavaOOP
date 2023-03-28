import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int age;
    private Gender gender;
    private Human father;
    private Human mother;
    private List<String> children;


    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.children = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Имя " + name +
                ", возраст " + age +
                ", пол " + gender +
                ", дети " + children +
                '}';
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }


    public void setMother(Human mother) {
        this.mother = mother;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public int getAge() {
        return age;
    }

    public Human getMother() {
        return mother;
    }
}

