public class Pair<A,B> {
    A first;
    B scond;

    public Pair(A first, B scond) {
        this.first = first;
        this.scond = scond;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getScond() {
        return scond;
    }

    public void setScond(B scond) {
        this.scond = scond;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", scond=" + scond +
                '}';
    }

    public static void main(String[] args) {
        Pair<String ,Integer> book=new Pair<>("bookk",123);
        String x=book.getFirst();
        int x2=book.getScond();
        System.out.println(x+"  "+x2);
    }
}
