public class Men extends Studen {
    private double maths;
    private double physics;
    private double chemistry;

    public String Men (String id, String name, String age, String sex, String dc, String ave){
        Men(id, name, age, sex, dc, ave);
        this.maths = maths;
        this.physics = physics;
        this.chemistry = physics;
        return id ;
    }

    public double getMaths ( ) {
        return maths;
    }

    public void setMaths (double maths) {
        this.maths = maths;
    }

    public double getPhysics ( ) {
        return physics;
    }

    public void setPhysics (double physics) {
        this.physics = physics;
    }

    public double getChemistry ( ) {
        return chemistry;
    }

    public void setChemistry (double chemistry) {
        this.chemistry = chemistry;
    }
    @Override
    public String toString(){
        return "Học Sinh Nam:[ " +
                "Mã Học Sinh:" + getId()+
                "Tên Học Sinh:" + getName()+
                "Tuổi Học sinh:" + getAge()+
                "Giớ tính:" + getSex()+
                "Địa chỉ:"+ getDc()+
                "Điểm trung bình:" +getAve()+
                "Điểm toán:" + getMaths()+
                "Điểm lý:" + getPhysics()+
                "Điểm hóa:" + getChemistry()+
                 ']' + "\n";
    }
    @Override
    public int compareTo (Men o){
        return (int) (getChemistry()+getPhysics()+getMaths());
    }
}
