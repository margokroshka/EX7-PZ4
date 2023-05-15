package Ex6;

public class Main {
    public static void main(String[] msi){
            NewThread newThread = new NewThread();
            newThread.start();
        NewRunnable thread = new NewRunnable();
        for (int i = 0; i < 3; i++) {
            new Thread(thread).start();
        }
    }
}
