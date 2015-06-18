package br.edu.unisep.photomania.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Willian on 21/05/2015.
 */
public class DicaVO implements Serializable {

    private Integer id;

    private UsuarioVO usuario;

    private String dica;

    private Date dtDica;

    private Integer categoria;

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

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public Date getDtDica() {
        return dtDica;
    }

    public void setDtDica(Date dtDica) {
        this.dtDica = dtDica;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
