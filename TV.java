public class TV {
    
      //atributos
      private String  canal = "canal atual";
      private int volume = 10;
      private int numeroTV = 395638;
      private boolean ligada = false;
      private boolean desligar;
      
     

    public void desligar() {
        if (ligada) {
            ligada = false;
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
        }
    }  
    public int getVolume() {
        return volume;
    }

    public boolean isLigada() {
        return ligada;
        }
    
    public void ligar() {
        if (!ligada) {
            ligada = true;
    
        }
    }

}