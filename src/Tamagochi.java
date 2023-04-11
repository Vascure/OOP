public class Tamagochi {

    int x;
    int y;
    int Futterstand;


    public void move(String richtung) {
        {
            if (Futterstand < 1) {
                System.out.println("Zu wenig Futter");

            }
                switch (richtung) {
                    case "oben":
                        y++;
                        break;
                    case "unten":
                        y--;
                        break;
                    case "links":
                        x--;
                        break;
                    case "rechts":
                        x++;
                        break;
                }

                System.out.println(Futterstand + " so viel Energie habe ich noch");
                System.out.println(x+ " Position an x-Achse");
                System.out.println(y+ " Position an y Achse");
            Futterstand = Futterstand - 1;

        }
    }
}



