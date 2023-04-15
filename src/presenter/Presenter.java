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

    public void loadTree(){
        service.load();
    }

    public void saveTree() {
        service.save();
    }

    public void getHumanList() {
        service.printTree();
    }
}
