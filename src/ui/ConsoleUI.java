package ui;

import FamiliTree.Gender;
import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
        work = true;
        menu = new Menu(this);
    }

    private String scan(){
        return scanner.nextLine();
    }
    @Override
    public void start() {
        while (work) {
            hello();
            int choice = Integer.parseInt(scan());
            menu.execute(choice);
        }
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void hello(){
        System.out.println(menu.printMenu());
    }

    public void addHuman(){
        String name;
        int age;
        Gender gender = null;

        name = scan();
        while (gender == null) {
            System.out.println("Введите пол 'm' - межской, 'f' - женский");
            String value = scan();
            if (value.equals("m")){
                gender = Gender.Male;
            } else if (value.equals("f")) {
                gender = Gender.Female;
            } else {
                System.out.println("Повторите ввод заново, такого пола не существует");
            }

        }
        age = Integer.parseInt(scan());

        presenter.addHuman(name, gender, age);
    }

    public void getHumanList(){
        presenter.getHumanList();
    }

    public void saveTree() {
        presenter.saveTree();
    }

    public void loadTree(){
        presenter.loadTree();
    }

    public void stopConsole(){
        work = false;
    }
}
