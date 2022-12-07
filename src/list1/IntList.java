package list1;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** L is not allowed to change*/
    public static IntList incrList(IntList L, int x) {
        if (L == null) return L;
        return new IntList(L.first + x, incrList(L.rest, x));
    }

    public static IntList dincrList(IntList L, int x) {
        while(L != null) {
            L.first += x;
            L = L.rest;
        }
        return L;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        L = new IntList(3, L);
        L = new IntList(2, L);

        System.out.println(L.size());
        IntList test = incrList(L, 5);
        System.out.println(test.size());
        System.out.println(L.get(1));
        System.out.println(test.get(1));
    }
}
