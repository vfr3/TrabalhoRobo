package robos;

//Pode executar missoes de reconhecimento e localizaçao de pessoas
public class Drone extends Robo {
    private double alturaMaxima;
   
    public Drone(int id, String nome) {
        super(id, nome);
        this.alturaMaxima = 350.0;
    }
    @Override
    public void executarMissao() {
        //Lógica de executar missao aqui.
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    public double getAlturaMaxima(){
        return alturaMaxima;
    }    
}
