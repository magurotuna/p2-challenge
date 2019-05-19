public class Main {
    public static void main(String[] args) {
        Queue<Integer> q0 = new ImmutableQueue<>();
        System.out.println(q0.isEmpty());
        System.out.println(q0.head());

        Queue<Integer> q1 = q0.enQueue(99);
        Queue<Integer> q2 = q1.enQueue(1000);
        System.out.println(q2.head());

        Queue<Integer> q3 = q2.deQueue().deQueue();
        System.out.println(q3.isEmpty());

        Queue<Integer> q4 = q3.enQueue(1).enQueue(2).enQueue(3).enQueue(4).enQueue(5).deQueue().deQueue();
        System.out.println(q4.head());
    }
}
