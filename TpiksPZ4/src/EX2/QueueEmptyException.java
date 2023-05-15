package EX2;

public class QueueEmptyException  extends Exception{
    public QueueEmptyException() {
        super("Queue is empty");
    }
}
