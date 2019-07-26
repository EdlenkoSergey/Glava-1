public class Glava10 {
    class StaticSuper{
        static {
            System.out.println("Родительский статичный блок");
        }
        StaticSuper() {
            //Нет скобок, а это коструктор
            System.out.println("Родительский конструктор");
        }
    }

    public class StaticTest extends StaticSuper {
        static int rand;
        static {
            rand + (int) (Math.random() * 6);
            System.out.println("СТатический блок" + rand);
        }
        StaticTests() {
            System.out.println("Конструктор");
        }

        public static void main(String[] args) {
            System.out.println("Внутри main");
            StaticTest st =new StaticTest();
        }
    }
}
