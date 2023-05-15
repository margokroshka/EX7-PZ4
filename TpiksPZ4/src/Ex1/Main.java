package Ex1;

public class Main {
    public static void main(String[] args) {
        Num<Integer, Double> a =new Num<>(11, 12.088);
        System.out.println(a.sumChisla());
        Integer[] i={12, 34, 3};
        Double[] d={12.242, 33.0001, 3.666};
        Num<Integer, Double> A =new Num<>(i, d);
        A.equalsMassiv();
        A.min_max();
    }
}
