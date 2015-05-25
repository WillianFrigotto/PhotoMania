package br.edu.unisep.photomania.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Willian on 21/05/2015.
 */
public class PostagemVO implements Serializable {

    private Integer id;

    private String caminhoPostagem;

    private Date dtPostagem;

    private UsuarioVO usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaminhoPostagem() {
        return caminhoPostagem;
    }

    public void setCaminhoPostagem(String caminhoPostagem) {
        this.caminhoPostagem = caminhoPostagem;
    }

    public Date getDtPostagem() {
        return dtPostagem;
    }

    public void setDtPostagem(Date dtPostagem) {
        this.dtPostagem = dtPostagem;
    }

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }
}
