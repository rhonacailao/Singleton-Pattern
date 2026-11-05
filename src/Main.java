public class Main {

    public static void main(String[] args) {
        HelpDesk hd1 = new HelpDesk("Help Desk 1");
        HelpDesk hd2 = new HelpDesk("Help Desk 2");
        HelpDesk hd3 = new HelpDesk("Help Desk 3");

        hd1.servingNext();
        hd2.servingNext();
        hd3.servingNext();

        System.out.println("\nOnline Monitoring System");
        System.out.println("Current queue number: " + QueueSystem.getInstance().getQueueNumber());

        System.out.println("\nHelp Desk Reset");
        QueueSystem.getInstance().resetQueueNumber(101);

        System.out.println();
        hd1.servingNext();
        hd2.servingNext();
        hd3.servingNext();
    }
}