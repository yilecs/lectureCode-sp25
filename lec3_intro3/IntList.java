package lec3_intro3;

/* An infinitely long list of integers. */
public class IntList {
    public int first;    // first number in the list
    public IntList rest; // rest of the list

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** return the number of items in the list. */
    public int size() {
        if (this.rest == null) {
            // professor what row am I in?
            return 1;
        }
        return 1 + this.rest.size();
    }

    // get the size of the list with iteration
    public int iterativeSize() {
        int totalSize = 0;
        IntList p = this;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        System.out.println(L.get(1));
    }
}