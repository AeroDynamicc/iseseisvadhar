import java.util.Scanner; //imporditud scanni klass java.util paketist

public class taisarvulised {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in); //kasutaja sisendi lugemiseks loome scanneri
        System.out.println("Sisesta esimene number: "); //väljastab teksti esimese nr-i sisestamiseks
        int a = scanner.nextInt(); //kasutaja poolt sisestatud number salvestatakse muutujasse 'a'
        System.out.println("Sisesta teine number: "); //väljastab teksti teise nr-i sisestamiseks
        int b = scanner.nextInt(); //kasutaja poolt sisestatud number salvestatakse muutujasse 'b'

        //alammeetodi kutsumine
        liitmine(a, b);
        lahutamine(a, b);
        korrutamine(a, b);
        jagamine(a, b);
        jaak(a, b);
        
        }
        //alammeetod ise
        //liitmine
        public static void liitmine(int a, int b) { //liidab kaks kasutaja poolt sisestatud taisarvu
        System.out.println(a + " + " + b + " = " + (a+b) ); //siin toimub liitmine, väljastades tehte näiteid

        }
        //lahutamine
        public static void lahutamine(int a, int b) { //lahutab kaks kasutaja poolt sisestatud taisarvu
        System.out.println(a + " - " + b + " = " + (a-b) ); //siin toimub lahutamine, väljastades tehte näiteid

        }   
        //korrutamine
        public static void korrutamine(int a, int b) { //korrutab kaks kasutaja poolt sisestatud taisarvu
        System.out.println(a + " * " + b + " = " + (a*b) ); //siin toimub korrutamine, väljastades tehte näiteid

        }
        //jagamine
        public static void jagamine(int a, int b) { //jagab kaks kasutaja poolt sisestatud taisarvu
        System.out.println(a + " / " + b + " = " + (a/b) ); //siin toimub jagamine, väljastades tehte näiteid

        }
        //jääk
        public static void jaak(int a, int b) { //toob valja jäägi kasutaja poolt sisestatud täisarvuna
        System.out.println(a + " % " + b + " = " + (a%b) ); //siin toimub jäägi otsimine, väljastades tehte näiteid
    }
}
