package Queue.Task01;

public class HotPotato {
    public static String hotPotato(String[] players, int k) {
        LinkedListQueue queue = new LinkedListQueue();
        for (int i = 0; i < players.length; i++) {
            queue.enqueue(players[i]);
        }
        int size = players.length;
        while (size > 1) {
            for (int i = 0; i < k; i++) {
                queue.enqueue(queue.dequeue());

            }
            size--;
            queue.dequeue();
        }
        return (String) queue.peek();
    }

    public static void main(String[] args) {

        System.out.println(".......Test Case #1.......");
        String[] players1 = { "Ali", "Ben", "Cia", "Dan", "Eli", "Faye" };
        int k1 = 3;
        String winner1 = hotPotato(players1, k1);
        System.out.println("Winner: " + winner1);

        System.out.println(".......Test Case #2.......");
        String[] players2 = { "Ali", "Rafi", "Sara", "Nina" };
        int k2 = 2;
        String winner2 = hotPotato(players2, k2);
        System.out.println("Winner: " + winner2);
    }
}
