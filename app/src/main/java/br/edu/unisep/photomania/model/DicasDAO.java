package br.edu.unisep.photomania.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.Date;

import br.edu.unisep.photomania.vo.DicaVO;
import br.edu.unisep.photomania.vo.PostagemVO;

/**
 * Created by Willian on 18/06/2015.
 */
public class DicasDAO {
    private PostagemHelper helper;

    public DicasDAO(Context ctx) {
        this.helper = new PostagemHelper(ctx, "dicas", null, 1);
    }

    public void salvar(DicaVO dica) {
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("dica", dica.getDica());
        valores.put("id_usuario", dica.getUsuario().getId());
        valores.put("id_usuario", dica.getUsuario().getId());

        Date hoje = new Date();
        valores.put("dt_postagem", hoje.getTime());

        db.insert("postagem", null, valores);
        db.close();
    }

    public Cursor listar() {

        SQLiteDatabase db = helper.getReadableDatabase();

        String[] colunas = {"_id",
                "caminho_postagem",
                "dt_postagem",
                "id_usuario"};

        Cursor crs = db.query("postagem", colunas, null,
                null, null, null, "dt_postagem");
        return crs;
    }
}
