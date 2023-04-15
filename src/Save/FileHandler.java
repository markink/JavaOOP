package Save;

import FamiliTree.Human;

import java.io.*;

public class FileHandler implements SaveAs {

    private String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void write(Serializable obj) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    @Override
    public void write(Human human) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(human);
        objectOutputStream.close();
    }

    @Override
    public Object read() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Object obj = objectInputStream.readObject();
        objectInputStream.close();
        return obj;
    }
}
