package lec3_intro3.exercises;
import lec3_intro3.IntList;

public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        //TODO fill in code
        return null;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        // TODO fill in code
        return null;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting.
        // System.out.println(L.get(1));
        IntList listPlus3 = dincrList(L, 3);
        for (IntList p = listPlus3; p != null; p = p.rest) {
            System.out.print(p.first + ", ");
        }
        System.out.println();

        incrList(L, 4);
        for (IntList p = L; p != null; p = p.rest) {
            System.out.println(p.first + ", ");
        }
        System.out.println();
    }
}
