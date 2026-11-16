package missoes;

import enums.TipoTerreno;
import enums.NivelRisco;

public class AreaOperacao {
    private int id;
    private String nome;
    private String localizacao;
    private TipoTerreno tipoTerreno;
    private String descricao;
    private NivelRisco nivelRisco;

    public AreaOperacao(int id, String nome, String localizacao, TipoTerreno tipoTerreno, NivelRisco nivelRisco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.localizacao =localizacao;
        this.tipoTerreno = tipoTerreno;
        this.nivelRisco = nivelRisco;
        this.descricao = descricao;
    }
}
