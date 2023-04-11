import java.util.Scanner;

public class Main_V2 {
    public static void main(String[] args) {
        Tamagochi_V2 t = new Tamagochi_V2();
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Futtermenge an:");

        t.x = 6;
        t.y = 4;
        t.food = input.nextInt();

        for (int i=0;i<t.food;i++) {
            if (t.getX()!=0); {
                t.move("Links");
            }
            if (t.getY()!=0); {
                t.move("Unten");
            }

        }
    }
}
