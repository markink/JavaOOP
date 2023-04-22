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
        System.out.println("Введите имя");
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
        System.out.println("Введите возраст");
        age = Integer.parseInt(scan());

        presenter.addHuman(name, gender, age);
    }

    public void addParents(){
        System.out.println("Введите человека, которому необходимо добавить родителей");
        int value1 = Integer.parseInt(scan());
        System.out.println("Введите родителя один");
        int value2 = Integer.parseInt(scan());
        System.out.println("Введите родителя два");
        int value3 = Integer.parseInt(scan());
        presenter.addParents(value1, value2, value3);
    }

    public void addChild(){
        System.out.println("Введите родителя один");
        int value1 = Integer.parseInt(scan());
        System.out.println("Введите родителя два");
        int value2 = Integer.parseInt(scan());

        presenter.addChild(value1, value2);
    }

    public void getHumanList(){
        System.out.println(presenter.getHumanList());
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


    public void sort(){
        System.out.println("Для сортировки по имени введите 1\n" +
                "По половому признаку 2\n" +
                "По возрасту 3\n" +
                "Если хотите выйти введите 0");
        int value = Integer.parseInt(scan());
        if (value == 1) {
            presenter.sortByName();
        } else if (value == 2) {
            presenter.sortByGender();
        } else if (value == 3) {
            presenter.sortByAge();
        } else if (value == 0) {
            menu.printMenu();
        } else {
            System.out.println("Inccorect value");
            sort();
        }
    }
}
