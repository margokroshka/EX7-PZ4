package Ex6;

public class NewRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if( i % 10 == 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
