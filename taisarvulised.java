import java.util.Scanner; //imporditud scanni klass java.util paketist

public class taisarvulised {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in); //kasutaja sisendi lugemiseks loome scanneri
        System.out.println("Sisesta esimene number: "); //väljastab teksti esimese nr-i sisestamiseks
        int a = scanner.nextInt(); //kasutaja poolt sisestatud number salvestatakse muutujasse 'a'
        System.out.println("Sisesta teine number: "); //väljastab teksti teise nr-i sisestamiseks
        int b = scanner.nextInt(); //kasutaja poolt sisestatud number salvestatakse muutujasse 'b'

        //liitmine
        System.out.println(a + " + " + b + " = " + (a+b) ); //siin toimub liitmine, väljastades tehte näiteid

        //lahutamine
        System.out.println(a + " - " + b + " = " + (a-b) ); //siin toimub lahutamine, väljastades tehte näiteid

        //korrutamine
        System.out.println(a + " * " + b + " = " + (a*b) ); //siin toimub korrutamine, väljastades tehte näiteid

        //jagamine
        System.out.println(a + " / " + b + " = " + (a/b) ); //siin toimub jagamine, väljastades tehte näiteid

        //jääk
        System.out.println(a + " % " + b + " = " + (a%b) ); //siin toimub jäägi otsimine, väljastades tehte näiteid
    }
}