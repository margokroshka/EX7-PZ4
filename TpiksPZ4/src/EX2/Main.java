package EX2;

public class Main {
    public static void main(String[] args) {
        Pers_Queue<Integer> q = new Pers_Queue<>(5);
        q.set(1);
        try {
            System.out.print(q.get(4));
        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }
    }
}
