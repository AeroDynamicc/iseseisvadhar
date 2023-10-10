import java.util.Scanner; //see laseb kasutada scanner käsku

public class juubel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //kasutaja sisendi lugemiseks on samuti vaja scannerit
        System.out.print("Sisesta oma synniaasta: "); //prindib välja teksti, küsides meilt sünniaastat
        int synniaasta = scanner.nextInt(); // kasutaja poolt sisestatud aasta number salvestatakse muutujasse 'synniaasta'

        boolean OnJuubeliAasta = ((synniaasta % 100 == 0 && synniaasta % 400 == 0)) || (synniaasta % 100 != 0 && synniaasta % 4 == 0); //siin toimub arvutus, otsitakse jääke, boolean, ehk kas muutuja on tõene või väär
        if (OnJuubeliAasta) //kui muutuja on tõeline, vastab see juubeliaastale, kui vastus on väär, vastab see mitte juubeliaastale.

        System.out.println(synniaasta + " on juubeliaasta!"); //prindib kasutaja poolt sisestatud numbri koos jutumärkides oleva tekstiga välja.
    else //kui...
        System.out.println(synniaasta + " ei ole juubeliaasta."); //prindib samuti kasutajalt numbri oleva tekstiga välja
        }
    }

