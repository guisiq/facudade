package aula04;

public class Elevador {
    private boolean     portaAberta = false;
    private int         andar ;
    final private int   maximoPesoas;
    private int pesoasDentro ;
    //#region sets e geterrs
    public boolean isPortaAberta() {
        return portaAberta;
    }
    public void tst(){
        return;
    }
    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }
    public int getAndar() {
        return andar;
    }
//#region
    public void setAndar(int andar) {
        this.portaAberta = true;
        this.andar = -andar;
    }
    
    public int getPesoasDentro() {
        return pesoasDentro;
    }
    
    public void setPesoasDentro(int pesoasDentro) {
        if (pesoasDentro <= maximoPesoas) {
            this.pesoasDentro = pesoasDentro;
        }else{
            System.err.println("o elevador na suporta essa quantidade de pesoas" );
        }
    }
//#endregion
    public Elevador(int maximoPesoas) {
        this.maximoPesoas = maximoPesoas;
    }

    @Override
    public String toString() {
        return "Elevador [andar=" + andar + ", maximoPesoas=" + maximoPesoas + ", pesoasDentro=" + pesoasDentro
                + ", portaAberta=" + portaAberta + "]";
    }

    //#endregion
    public void somarPesoasdentro(int p){
        if ((pesoasDentro+p) <= maximoPesoas) {

            
            this.pesoasDentro = pesoasDentro;
        }else{
            System.err.println("o elevador nao pode conporta mais pesoas " );
        }
    }
    
}

