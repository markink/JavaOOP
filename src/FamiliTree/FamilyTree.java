package FamiliTree;

import FamiliTree.Comporators.ComporatorByAge;
import FamiliTree.Comporators.ComporatorByGender;
import FamiliTree.Comporators.ComporatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable{
    private List<Human> humans;


    public FamilyTree() {
        this.humans = new ArrayList<>();
    }

    public FamilyTree(List <Human> humans) {
        this.humans = humans;
    }

    public void printHuman() {
        int index = 0;
        for (Human human : humans) {
            System.out.println(index + " " + human);
            index++;
        }
    }

    public void printHuman(int value) {
        System.out.println(humans.get(value));
    }

    public Serializable printParents(int value){
        System.out.printf("Родители %s являются %s и %s", humans.get(value).getName(), humans.get(value).getFather().getName(), humans.get(value).getMother().getName());

        return null;
    }

    public Object addHuman(Human human) {
        if (humans != null) {
            humans.add(human);
        }
        return human;
    }

    public void addParents (int child, int parent1, int parent2){

        if (humans.get(parent1).getGender().equals(humans.get(parent2).getGender())){
            System.out.println("Error");
        } else {
            if (humans.get(parent1).getAge() >= humans.get(child).getAge() && humans.get(parent2).getAge() >= humans.get(child).getAge()){
                humans.get(child).setMother(humans.get(parent1));
                humans.get(child).setFather(humans.get(parent2));
            }else {
                System.out.println("Детям не может быть меньше лет, чем родителям");
            }
        }
    }

    public void addChild (int parent, int child) {
        List <Human> list = humans.get(parent).getChildren();
        list.add(humans.get(child));
        humans.get(parent).setChildren(list);
    }

    public List<Human> getHumans(){
        return humans;
    }

    public void sortByAge(){
        humans.sort(new ComporatorByAge());
    }

    public void sortByName(){
        humans.sort(new ComporatorByName());
    }

    public void sortByGender(){
        humans.sort(new ComporatorByGender());
    }


}
