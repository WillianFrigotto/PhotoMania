package br.edu.unisep.photomania.vo;

import java.io.Serializable;

/**
 * Created by Willian Ludvig 21/05/2015.
 */
public class CurtirVO implements Serializable {

    private Integer id;

    private UsuarioVO usuario;

    private PostagemVO postagem;

    private Integer curtida;

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

    public Integer getCurtida() {
        return curtida;
    }

    public void setCurtida(Integer curtida) {
        this.curtida = curtida;
    }
}
