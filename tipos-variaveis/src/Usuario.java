public class Usuario {
    public static void main (String[] args) throws Exception {


        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume ();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        System.out.println("Volume atual: " + smartTv.volume);

        
        smartTv.mudarCanal (3);
        System.out.println("Canal atual: " + smartTv.canal);

    }
    
}
