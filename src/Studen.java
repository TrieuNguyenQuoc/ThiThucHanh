public abstract class Studen {
    private String id ;
    private String name;
    private String age;
    private String sex;
    private String dc;
    private String ave;

    public String getId ( ) {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAge ( ) {
        return age;
    }

    public void setAge (String age) {
        this.age = age;
    }

    public String getSex ( ) {
        return sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }

    public String getDc ( ) {
        return dc;
    }

    public void setDc (String dc) {
        this.dc = dc;
    }

    public String getAve ( ) {
        return ave;
    }

    public void setAve (String ave) {
        this.ave = ave;
    }

    public abstract int compareTo (Men o);

    public double Women ( ) {
        return 0;
    }
}
