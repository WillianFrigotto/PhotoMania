package br.edu.unisep.photomania.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Willian on 14/06/2015.
 */
public class CurtidasHelper extends SQLiteOpenHelper {

    public CurtidasHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table curtidas (" +
                " _id integer primary key, " +
                " id_usuario integer, " +
                " id_postagem integer, " +
                "FOREIGN KEY(id_usuario) REFERENCES usuario(_id)" +
                "FOREIGN KEY(id_postagem) REFERENCES postagem(_id)";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
