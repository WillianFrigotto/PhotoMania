package br.edu.unisep.photomania.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Willian on 21/05/2015.
 */
public class ComentarioVO implements Serializable {

    private Integer id;

    private Date dtComentario;

    private UsuarioVO usuario;

    private PostagemVO postagem;

    private String comentario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtComentario() {
        return dtComentario;
    }

    public void setDtComentario(Date dtComentario) {
        this.dtComentario = dtComentario;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
