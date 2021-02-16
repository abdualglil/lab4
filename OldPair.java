public class OldPair {
    Object ferist;
    Object secand;

    public OldPair(Object ferist, Object secand) {
        this.ferist = ferist;
        this.secand = secand;
    }

    public Object getFerist() {
        return ferist;
    }

    public void setFerist(Object ferist) {
        this.ferist = ferist;
    }

    public Object getSecand() {
        return secand;
    }

    public void setSecand(Object secand) {
        this.secand = secand;
    }

    @Override
    public String toString() {
        return "OldPair{" +
                "ferist=" + ferist +
                ", secand=" + secand +
                '}';
    }

    public static void main(String[] args) {
    //    Student s1=new Student("name",20,1235);
    //    Student s2=new Student("abdu",25,336);
        OldPair book=new OldPair("book1",111);
        String x=(String) book.getFerist();
        int id=(int)book.getSecand();
     //   OldPair b=new OldPair("ben",30.5);
      //  OldPair f=new OldPair(s1,s2);
        System.out.println(x+" , "+id);
    }
}
