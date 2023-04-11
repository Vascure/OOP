import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Tamagochi t = new Tamagochi();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Futterstand an: ");
        t.Futterstand = scanner.nextInt();

        t.x = 6;
        t.y = 4;

        while (t.Futterstand > 0) {
            if (t.x != 0) {
                t.move("links");

            }
            if (t.y != 0) {
                t.move("unten");

            }
        }


    }

}
