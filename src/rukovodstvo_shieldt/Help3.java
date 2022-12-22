package rukovodstvo_shieldt;

public class Help3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;

        for (; ; ) {
            do {
                System.out.println("Справка");
                System.out.println("  1. if");
                System.out.println("  2. switch");
                System.out.println("  3. for");
                System.out.println("  4. while");
                System.out.println("  5. do-while\n");
                System.out.println("  6. break");
                System.out.println("  7. continue\n;");
                System.out.print("Выберите: (q - выход) : ");


                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1' -> {
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) инструкция;");
                    System.out.println("else инстукция;");
                }
                case '2' -> {
                    System.out.println("Инструкция switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("  case константа:");
                    System.out.println("   последователньость инструкций");
                    System.out.println("   break;");
                    System.out.println("  // ...");
                    System.out.println("}");
                }
                case '3' -> {
                    System.out.println("Цикл for:\n");
                    System.out.print("for (инициализация; условие; итерация)");
                    System.out.println("  инструкция");
                }
                case '4' -> {
                    System.out.println("Цикл while:\n");
                    System.out.println("while (условие) инструкция;");
                }
                case '5' -> {
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println("  инструкция;");
                    System.out.println("} while (условие);");
                }
                case '6' -> {
                    System.out.println("Инструкция break:\n");
                    System.out.println("break; или break метка;");
                }
                case '7' -> {
                    System.out.println("Инструкция continue:\n");
                    System.out.println("continue; или continue метка;");
                }
            }
            System.out.println();
        }
    }
}


