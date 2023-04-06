package FamiliTree.Comporators;

import FamiliTree.Human;

import java.util.Comparator;

public class ComporatorByGender implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
