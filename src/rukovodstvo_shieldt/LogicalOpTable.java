package rukovodstvo_shieldt;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;
        int p1;
        int q1;
        System.out.println("P\tQ\tAND\tOr\tXOR\tNOT");

        p = true; q = true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p));

        p = true; q = false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p));

        p = false; q = true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p));

        p = false; q = false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p));
    }
}
