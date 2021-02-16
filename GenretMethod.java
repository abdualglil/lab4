public class GenretMethod {
    public static <T> void print(T a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] w={1,2,3,4,5,6};
        String[] x={"ali","hasan","mohamed"};
        print(w);
        print(x);
    }
}
