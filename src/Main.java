public class Main {

    static void Prostye(int a) {
        int count = 0;
        boolean s = true;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 1)
            System.out.print(a + " ");


    }

    public static void main(String[] args) {
        System.out.println("mY doc");
        for (int i = 2; i < 100; i++) {
            Prostye(i);
        }

    }
}





