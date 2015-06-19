package br.edu.unisep.photomania.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Willian on 13/06/2015.
 */
public class PostagemHelper extends SQLiteOpenHelper {

    public PostagemHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table postagem (" +
                " _id integer primary key, " +
                " caminho_postagem text, " +
                " dt_postagem integer, " +
                "id_usuario INTEGER NOT NULL," +
                "FOREIGN KEY(id_usuario) REFERENCES usuario(_id))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
