import java.util.Arrays;

public class Ops {
    int a[]={1,2,3,4,5,6};
    public void remov(int a[],int index){
        if (index>=0 && index<a.length){
            int i=index;
            while (i<a.length-1){
                a[i]=a[i+1];
                i++;
            }
            a[i]=0;
        }
    }

    public static void main(String[] args) {
        Ops o=new Ops();
        System.out.println(Arrays.toString(o.a));
        o.remov(o.a,2);
        System.out.println(Arrays.toString(o.a));
    }
}