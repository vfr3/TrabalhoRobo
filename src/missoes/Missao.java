package missoes;
import robos.Robo;
import enums.TipoMissao;
import enums.StatusMissao;
import enums.NivelRisco;

public class Missao {
    private int id;
    private String descricao;
    private TipoMissao tipo; //CLASSE ENUM TipoMissao**
    private Robo roboResponsavel;
    private AreaOperacao area; //Classe AreaOperacao
    private NivelRisco prioridade; //Classe enum nivelRisco
    private StatusMissao status; // ENUM StatusMissao
    
}
