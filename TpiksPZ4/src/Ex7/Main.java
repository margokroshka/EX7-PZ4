package Ex7;

public class Main {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            sb.append('a');
            MyThread[] threads = new MyThread[]{
                    new MyThread(sb),
                    new MyThread(sb),
                    new MyThread(sb)
            };
            for (MyThread thread : threads) {
                thread.start();
            }
        }
}
