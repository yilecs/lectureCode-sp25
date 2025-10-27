package lec4_lists2.addLastAndSizeExercise;

public class SLList {
    private class IntNode {
        public int item;    // first number in the list
        public IntNode next; // rest of the list

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    public int getFirst() {
        return first.item;
    }

    public void addLast(int x) {
        IntNode p = first;
        while (p != null && p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }
    public int size() {
        return size;
    }
}
