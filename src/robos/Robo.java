package robos;
import interfaces.Comunicavel;
import enums.StatusRobo;
public abstract class Robo  implements Comunicavel{
    private int id;
    private String nome;
    private double nivelBateria;
    private StatusRobo status; // ***CLASSE ENUM***
    private int missoesRealizadas;

    /*
    **Métodos a se fazer: verificarDisponibilidade(), consultarBateria(), recarregar(),
    exibirResumo(), executarMissao();**
    */

    public Robo(int id, String nome) {
        setNome(nome);
        setId(id);
        this.nivelBateria = 100.0;
        this.status = StatusRobo.DISPONIVEL; // ***CLASSE ENUM***
        this.missoesRealizadas = 0;
    }

    //Métodos da classe interface Comunicavel
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Robô: "+ getNome()+ " Mensagem enviada: "+mensagem);
    }
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Robô: "+ getNome()+ " Mensagem recebida: "+mensagem);
    }

    public StatusRobo verificarDisbonibilidade() {
        return getStatus();
    }
    public void consultarBateria(Robo robo) { // REVISAR **
        System.out.println("Nivel da bateria do Robo: "+ robo.getNivelBateria()+"%");
    }
    public void recarregar() {
       setNivelBateria(100);
    }
    public abstract void executarMissao();

    /*Getter and Setter 
            V
    */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id <= 0) {
            throw new IllegalArgumentException("Id não pode ser 0 ou menor!");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }
    public void setNivelBateria(double nivelBateria) {
        if(nivelBateria < 0.0 || nivelBateria > 100.0) {
            throw new IllegalArgumentException("A bateria deve estar sempre entre 0.0 e 100.0");
        }
        this.nivelBateria = nivelBateria;
    }

    public int getMissoesRealizadas() {
        return missoesRealizadas;
    }
    public void setMissoesRealizadas(int missoesRealizadas) {
        if(missoesRealizadas < 0 ) {
            throw new IllegalArgumentException("Missões realizadas não pode ser menor que 0");
        }
        this.missoesRealizadas = missoesRealizadas;
    }

    public StatusRobo getStatus() {
        return status;
    }
    public void setStatus(StatusRobo status) {
        if(status == null) {
            throw new IllegalArgumentException("Status não pode estar vazio");
        }
        this.status = status;
    }


}
