package lampada;

class Lampada {
    public String comodo;
    public boolean estaLigada;

    public Lampada(String comodo, boolean estaLigada){
        this.comodo = comodo;
        this.estaLigada = estaLigada;
    }

    public void ligar(){
        estaLigada = true;
    }

    public void desligar(){
        estaLigada = false;
    }

    public void observar(){
        if(estaLigada){
            System.out.println("A lâmpada do cômodo " + comodo + "");
        } else{
            System.out.println("A lâmpada do cômodo " + comodo + " está DESLIGADA");
        }
    }
}
