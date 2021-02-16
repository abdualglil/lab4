public class GenaricAreeye<T> {
    T arr[];
    int num=0;
    public GenaricAreeye() {
        arr=(T[]) new Object[2];
    }
    public void add(T element){
        if (num<=arr.length){
            arr[num++]=element;
        }
    }
    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        GenaricAreeye<Integer> a=new GenaricAreeye<>();
        a.add(125);
        a.add(35);
        a.print();
        GenaricAreeye<String> a1=new GenaricAreeye<>();
        a1.add("abdu");
        a1.add("ali");
        a1.print();
        Student s1=new Student("abdu",25,123);
        Student s2=new Student("hasan",30,336);
        GenaricAreeye<Student> a2=new GenaricAreeye<>();
        a2.add(s1);
        a2.add(s2);
        a2.print();
    }
}
