package Ex3;

public class Function {
    public static void main(String[] args) {
        java.util.function.Function<Integer, String> function = i -> {
            String result = "Ноль";
            if (i > 0) {
                result = "Положительное число";
            } else if (i<0) {
                result = "Отрицательное число";
            }
          return result;
        };
        System.out.println(function.apply(-6));
        System.out.println(function.apply(6));
        System.out.println(function.apply(0));
    }
}