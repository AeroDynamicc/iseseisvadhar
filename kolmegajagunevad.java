public class kolmegajagunevad {
    public static void main(String[] args){
        leiaKolmegaJagunevadArvud(); //kutsume meetodi, mis leiab kolmega jagunevaid arve


        }
        public static void leiaKolmegaJagunevadArvud() { //alammeetod
        for(int i=3;i<=100;i+=3){ //for käivitab selle koodi korduvalt mitu korda, ning toimuvad sulgudes olevad arvustused
        
        System.out.println("Kolmega jagunevad arvud on: " +i); //prindib välja teksti, kuhu lisatakse "i", mis tähistab numbrit.
        }
    }  
}

