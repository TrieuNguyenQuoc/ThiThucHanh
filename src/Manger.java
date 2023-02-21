import java.util.List;
import java.util.Scanner;

public class Manger {
    ReadEndWrite readEndWrite = new ReadEndWrite();
    public List <Studen>studens;
    public Manger(List<Studen>studens){
        this.studens = readEndWrite.readDataFromFile();
    }
    public Scanner scanner = new Scanner(System.in);
    double totalScore;
    double avetotalScore = 0;
    double avetotalScore1 = 0;

for(Studen studen : studens) {
        Object Studen;
        if (Studen instanceof Women) {
            avetotalScore += ((Women) studens).Women();
        }
        if (studens instanceof Studen) {
            avetotalScore1 += ((Women) studens).Women();
        }
    }
    totalScore  = (avetotalScore+avetotalScore1) / studens.size(); // số lượng ptu trong mảng
        return totalScore;
}
}
