public class Tamagochi_V2 {
int x=0;
int y=0;
int food=1;

public void move (String richtung) {
    if (food<1) {
        System.out.println("Bitte füttere mich!");
    } else if (richtung.equals("Links")) {
        x=x--;

    } else if (richtung.equals("Rechts")) {
        x=x++;

    } else if (richtung.equals("Oben")) {
        y=y++;

    } else if (richtung.equals("Unten")) {
        y=y--;

    }
    food=food--;
    System.out.println(food + " Ich habe noch so viel Energie!");
    System.out.println(x+ " an Position x");
    System.out.println(y+ " an Position y");
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

