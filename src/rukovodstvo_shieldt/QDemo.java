package rukovodstvo_shieldt;

class Queue {
    private int q[];
    private int putloc, getloc;

    Queue(int size) {
        q = new int[size];
        putloc = getloc = 0;
    }

    void put(int ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    int get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (int) 0;
        }
        return q[getloc++];
    }
}

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int ch;
        int i;

        System.out.println("Использование очереди bigQ для сохраненифя алфавита");
        for (i = 0; i < 26; i++)
            bigQ.put((int) ('A' + i));
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (int) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошмибок");
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (int) ('Z' - i));
            smallQ.put((int) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.print("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (int) 0) System.out.print(ch);
        }
    }
}
