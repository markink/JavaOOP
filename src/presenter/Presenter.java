package presenter;

import FamiliTree.Gender;
import FamiliTree.Service;
import ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(String name, Gender gender, int age) {
        service.addHuman(name, gender, age);
    }

    public void addParents(int child, int parent1, int parent2){
        service.addParents(child, parent1, parent2);
    }

    public void addChild(int parent1, int parent2){
        service.addChild(parent1, parent2);
    }

    public void loadTree(){
        service.load();
    }

    public void saveTree() {
        service.save();
    }

    public StringBuilder getHumanList() {
        return service.FamilyTree();
    }

    public void sortByName() {
        service.sortByName();
    }

    public void sortByGender() {
        service.sortByGender();
    }

    public void sortByAge() {
        service.sortByAge();
    }
}
