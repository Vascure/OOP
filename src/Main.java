public class Main {
    public static void main(String[] args) {
//        String name= "Maxi";
//        int alter= 20;
//        char geschlecht = 'w';
//
//        String name2="Max";
//        int alter2=22;
//        char geschlecht2='m';

        Teilnehmer t1= new Teilnehmer();
        t1.name="Jaqueline";
        t1.alter=14;
        t1.geschlecht='w';

        System.out.println("Die Person "+t1.name+" ist "+ t1.alter + " Jahre alt.");

        Teilnehmer t2=new Teilnehmer();
        t2.name="Quentin";
        t2.alter=25;
        t2.geschlecht='m';
        System.out.println("Die Person "+t2.name+" ist "+ t2.alter + " Jahre alt.");

    t1.hatFrageGestellt();
    t1.hatFrageGestellt();
        System.out.println("Die Person "+ t1.name+" hat"+ t1.fragenCounter+" Fragen gestellt");
        System.out.println("Die Person "+ t2.name+" hat"+ t2.fragenCounter+" Fragen gestellt");
    }
}
