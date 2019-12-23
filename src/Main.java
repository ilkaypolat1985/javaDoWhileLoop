public class Main {

    public static void main(String[] args) {
        System.out.println("******************************");
        int i = 1;
        do{
            System.out.println(i++);
        }while (i < 10);

        System.out.println();
        System.out.println("******************************");
        i = 1;
        do{
            System.out.println(i);
            i += 2;
        }while (i < 10);

        System.out.println();
        System.out.println("******************************");
        i = 2;
        do{
            System.out.println(i);
            i += 2;
        }while (i < 10);
    }
}
