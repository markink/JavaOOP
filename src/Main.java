//Реализовать, с учетом ооп подхода, приложение.
//Для проведения исследований с генеалогическим древом.
//Идея: описать некоторое количество компонент, например:
//модель человека и дерева
//Под “проведением исследования” можно понимать например получение всех детей выбранного человека.

import java.util.List;

public class Main {

    public static void fillTree(FamilyTree familyTree) {
        familyTree.addHuman(new Human("Василий", 63, Gender.Male));
        familyTree.addHuman(new Human("Екатерина", 59, Gender.Female));
        familyTree.addHuman(new Human("Евгений", 74, Gender.Male));
        familyTree.addHuman(new Human("Изольда", 71, Gender.Female));
        familyTree.addHuman(new Human("Пётр", 40, Gender.Male));
        familyTree.addHuman(new Human("Юлия", 38, Gender.Female));
        familyTree.addHuman(new Human("Игорь", 39, Gender.Male));
        familyTree.addHuman(new Human("Олег", 40, Gender.Male));
        familyTree.addHuman(new Human("Евгения", 41, Gender.Female));
        familyTree.addHuman(new Human("Алиса", 43, Gender.Female));
        familyTree.addHuman(new Human("Эльвира", 20, Gender.Female));
        familyTree.addHuman(new Human("Альбина", 23, Gender.Female));
        familyTree.addHuman(new Human("Игнат", 21, Gender.Male));
        familyTree.addHuman(new Human("Марк", 21, Gender.Male));
        familyTree.addHuman(new Human("Семён", 22, Gender.Male));
        familyTree.addHuman(new Human("Зинаида", 23, Gender.Female));
        familyTree.addHuman(new Human("Петр", 21, Gender.Male));
        familyTree.addHuman(new Human("Жанна", 22, Gender.Female));
        familyTree.addHuman(new Human("Ростислав", 23, Gender.Male));
    }


    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        fillTree(familyTree);
        familyTree.printHuman();
        familyTree.addParents(8, 1, 2);
        familyTree.printHuman();
        familyTree.printHuman(1);
        familyTree.printParents(8);


    }
}