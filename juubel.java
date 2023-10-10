import java.util.Scanner; //see laseb kasutada scanner käsku

public class juubel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //kasutaja sisendi lugemiseks on samuti vaja scannerit
        System.out.print("Sisesta oma synniaasta: "); //prindib välja teksti, küsides meilt sünniaastat
        int synniaasta = scanner.nextInt(); // kasutaja poolt sisestatud aasta number salvestatakse muutujasse 'synniaasta'

        boolean OnJuubeliAasta = kasOnJuubeliAasta(synniaasta); //boolean võtab kasutaja poolt kirjutatud numbri (aasta) ning see salvestatakse "OnJuubeliAasta" muutujasse

        if (OnJuubeliAasta) //kui muutuja on tõeline, vastab see juubeliaastale, kui vastus on väär, vastab see mitte juubeliaastale.

        System.out.println(synniaasta + " on juubeliaasta!"); //prindib kasutaja poolt sisestatud numbri koos jutumärkides oleva tekstiga välja.
    else //kui...
        System.out.println(synniaasta + " ei ole juubeliaasta."); //prindib samuti kasutajalt numbri oleva tekstiga välja
        }
        //alammeetod, kontrollib kas aasta on juubeliaasta
        public static boolean kasOnJuubeliAasta(int aasta) { //kontrollib booleani kaudu, kas juubeliaasta on tõene või väär, ehk kas on juubeliaasta või mitte
            return ((aasta % 100 == 0 && aasta % 400 == 0)) || (aasta % 100 != 0 && aasta % 4 == 0); //return teavitab, milline väärtus tuleb tagastada ning lõpetab meetodi täitmise
        }

        }
    

