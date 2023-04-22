package FamiliTree;

import FamiliTree.Comporators.ComporatorByAge;
import FamiliTree.Comporators.ComporatorByName;
import Save.FileHandler;

import java.io.IOException;
import java.util.Comparator;

public class Service <T extends Human>{

    private FamilyTree<T> tree;
    private FileHandler handler;

    public Service(FamilyTree<T> tree) {
        this.tree = tree;
    }

    public FamilyTree<T> getTree() {
        return tree;
    }

    public void setTree(FamilyTree<T> tree) {
        this.tree = tree;
    }

    public FileHandler getHandler() {
        return handler;
    }

    public void setHandler(FileHandler handler) {
        this.handler = handler;
    }

    public void addHuman(String name, Gender gender, int age) {
        tree.addHuman((T) new Human(name, age, gender));
    }

    public void addParents(int child, int parent1, int parent2) {
        tree.addParents(child, parent1, parent2);
    }

    public void addChild(int parent1, int parent2){
        tree.addChild(parent1, parent2);
    }

    public StringBuilder FamilyTree() {
        return tree.HumanList();
    }

    public void save(){
        if (handler != null && tree != null) {
            try {
                handler.write(tree);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void load() {
        if (handler != null) {
            try {
                tree = (FamilyTree<T>) handler.read();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void sortByName () {
        tree.getHumans().sort((Comparator<? super T>) new ComporatorByName());
    }
    public void sortByAge () {
        tree.getHumans().sort((Comparator<? super T>) new ComporatorByAge());
    }
    public void sortByGender () {
        tree.getHumans().sort((Comparator<? super T>) new ComporatorByAge());
    }

}
