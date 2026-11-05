public class QueueSystem {
    private static volatile QueueSystem instance;
    private int queueNum;

    private QueueSystem(){
        this.queueNum = 1;
    }

    public static QueueSystem getInstance(){
        if (instance == null){
            synchronized (QueueSystem.class){
                if (instance == null){
                    instance = new QueueSystem();
                }
            }
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        return queueNum++;
    }

    public synchronized int getQueueNumber() {
        return queueNum;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        queueNum = newQueueNumber;
        System.out.println("Queue reset to: " + newQueueNumber);
    }
}

class HelpDesk{
    private final String hdNum;

    public HelpDesk(String hdNum) {
        this.hdNum = hdNum;
    }

    public void servingNext() {
        int queueNum = QueueSystem.getInstance().getNextQueueNumber();
        System.out.println(hdNum + " is currently serving: " + queueNum);
    }
}


