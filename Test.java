public class Test {
    public static void main(String[] args) {
        Person p;
        Student s=new Student("ahmed",30,123);
        p=s;//widening cast
        System.out.println(p);
        Person p2=new Person("asad",25);
        Student s2;
        if (p2 instanceof Student){
        s2=(Student) p2; //narrowing cast
        System.out.println(s2);}

    }
}
