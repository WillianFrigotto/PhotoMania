package br.edu.unisep.photomania.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.Date;

import br.edu.unisep.photomania.vo.AvaliacaoVO;
import br.edu.unisep.photomania.vo.DicaVO;

/**
 * Created by Willian on 18/06/2015.
 */
public class AvaliacaoDAO {
    private PostagemHelper helper;

    public AvaliacaoDAO(Context ctx) {
        this.helper = new PostagemHelper(ctx, "avaliacao", null, 1);
    }

    public void salvar(AvaliacaoVO avaliacao) {
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("avaliacao", avaliacao.getAvaliacao());
        valores.put("id_usuario", avaliacao.getUsuario().getId());
        valores.put("id_postagem", avaliacao.getPostagem().getId());

        Date hoje = new Date();
        valores.put("dt_avaliacaoc", hoje.getTime());

        db.insert("avaliacao", null, valores);
        db.close();
    }

    public Cursor listar() {

        SQLiteDatabase db = helper.getReadableDatabase();

        String[] colunas = {"_id",
                "id_usuario",
                "id_postagem",
                "avaliacao",
                "dt_avaliacao"};

        Cursor crs = db.query("avaliacao", colunas, null,
                null, null, null, "dt_avaliacao");
        return crs;
    }
}
