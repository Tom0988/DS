package list2;

public class SLList {
    private IntNode last;
    private int size;
    private final IntNode sentinel;

    public SLList() {
        sentinel = new IntNode(-1, null);
        last = sentinel;
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(-1, null);
        sentinel.next = new IntNode(x, null);
        last = sentinel.next;
        size = 1;
    }

    /** add x to the front of the list*/
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public void addLast(int x) {
        IntNode p = last;
        p.next = new IntNode(x, null);
        size++;
        last = last.next;
    }

    /** return the first item in the list*/
    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }


    public static void main(String[] args) {
        SLList L1 = new SLList(10);
        L1.addFirst(12);
        L1.addFirst(11);
        L1.addFirst(10);
        L1.addLast(5);
        SLList L2 = new SLList(10);

        System.out.println(L1.size());
    }
}
