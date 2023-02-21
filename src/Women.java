//package modle;

public class Women extends Studen {

      public void Intern(String id, String name, int age, String sex, String dc, String ave) {
            Intern(id, name, age, sex, dc, ave);
      }



      @Override
      public String toString() {
            return "Học sinh nữ: [ " +
                    "Mã học sinh: " + getId() +
                    "Tên học sinh: " + getName() +
                    "Tuổi học sinh: " + getAge() +
                    "Giới tính học sinh: " + getSex() +
                    "Địa chỉ: " + getDc() +
                    "Điểm trung bình: " + getAve()+
                    ']' + "\n";
      }

      @Override
      public int compareTo (Men o) {
            return 0;
      }
}
