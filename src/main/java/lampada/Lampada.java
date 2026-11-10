package lampada;

class Lampada {
    private String comodo;
    private boolean estaLigada;

    public Lampada(String comodo, boolean estaLigada){
        this.comodo = comodo;
        this.estaLigada = estaLigada;
    }

    public String getComodo() {return comodo;}
    public void setComodo(String comodo) {this.comodo = comodo;}

    public boolean isEstaLigada() {return estaLigada;}
    public void setEstaLigada(boolean estaLigada) {this.estaLigada = estaLigada;}

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