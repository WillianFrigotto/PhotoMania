package br.edu.unisep.photomania.vo;

import java.io.Serializable;

/**
 * Created by Willian on 21/05/2015.
 */
public class SeguidorVO implements Serializable {

    private Integer id;

    private UsuarioVO usuario;

    private UsuarioVO seguido;

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

    public UsuarioVO getSeguido() {
        return seguido;
    }

    public void setSeguido(UsuarioVO seguido) {
        this.seguido = seguido;
    }
}
