import java.io.IOException;
import java.io.Serializable;

public interface SaveAs {
    void write(Serializable obj) throws IOException;

    void write(Object human) throws IOException;

    Object read() throws IOException, ClassNotFoundException;

}
