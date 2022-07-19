public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //
            System.out.print("Outer For loop i = " + i);
            {
                System.out.println();
                for (int j = 1; j <= 5; j++) {
                    {
                        System.out.println(j);
                    }
                }
            }
        }
    }
}