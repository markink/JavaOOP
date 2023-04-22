package FamiliTree;

import FamiliTree.Comporators.ComporatorByAge;
import FamiliTree.Comporators.ComporatorByGender;
import FamiliTree.Comporators.ComporatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends Human> implements Serializable, Iterable<T>{
    private List<T> humans;


    public FamilyTree() {
        this.humans = new ArrayList<>();
    }

    public FamilyTree(List <T> humans) {
        this.humans = humans;
    }

    public StringBuilder HumanList() {
        StringBuilder stringBuilder = new StringBuilder();

        int index = 1;
        for (T human : humans) {
            stringBuilder.append(index + " " + human + "\n");
            index++;
        }
        return stringBuilder;
    }


    public Object addHuman(T human) {
        if (humans != null) {
            humans.add(human);
        }
        return human;
    }

    public void addParents (int child, int parent1, int parent2){

        if (humans.get(parent1-1).getGender().equals(humans.get(parent2-1).getGender())){
            System.out.println("Error");
        } else {
            if (humans.get(parent1-1).getAge() >= humans.get(child-1).getAge() && humans.get(parent2-1).getAge() >= humans.get(child-1).getAge()){
                humans.get(child-1).setMother(humans.get(parent1-1));
                humans.get(child-1).setFather(humans.get(parent2-1));
            }else {
                System.out.println("Детям не может быть меньше лет, чем родителям");
            }
        }
    }

    public void addChild (int parent, int child) {
        List <Human> list = humans.get(parent-1).getChildren();
        list.add(humans.get(child-1));
        humans.get(parent-1).setChildren(list);
    }

    public List<T> getHumans(){
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

    public Iterator<T> iterator(){
        return new HumanIterator(humans);
    }




}
