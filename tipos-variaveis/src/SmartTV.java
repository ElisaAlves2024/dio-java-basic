public class SmartTV {
    boolean ligada=false;
    int canal=10;
    int volume=25;
    
    
    public void ligar () {
       ligada=true;
    }
    public void desligar () {
        ligada=false;
    }

    public void aumentarVolume () {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
 
    public void diminuirVolume () {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal () {
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }
 
    public void diminuirCanal () {
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }
   
   
    public void mudarCanal (int novoCanal) {
        canal= novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }
}
