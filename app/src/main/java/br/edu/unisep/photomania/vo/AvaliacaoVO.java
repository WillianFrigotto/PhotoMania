package br.edu.unisep.photomania.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Willian on 21/05/2015.
 */
public class AvaliacaoVO implements Serializable {

    private Integer id;

    private UsuarioVO usuario;

    private PostagemVO postagem;

    private Integer avaliacao;

    private Date dt_avaliacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }

    public PostagemVO getPostagem() {
        return postagem;
    }

    public void setPostagem(PostagemVO postagem) {
        this.postagem = postagem;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Date getDt_avaliacao() {
        return dt_avaliacao;
    }

    public void setDt_avaliacao(Date dt_avaliacao) {
        this.dt_avaliacao = dt_avaliacao;
    }

}
