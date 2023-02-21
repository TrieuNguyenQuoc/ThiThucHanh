import java.io.*;
import java.util.List;

public class ReadEndWrite {

    public  void writeToFile(List<Studen> studens) {
        try {
            FileOutputStream fos = new FileOutputStream("thi.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studens);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Studen> readDataFromFile ( ){
        List<Studen> Studen = new ArrayList();
        try{

            FileInputStream fis = new FileInputStream("thi.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Studen = (List<Studen>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Studen;
    }
}
