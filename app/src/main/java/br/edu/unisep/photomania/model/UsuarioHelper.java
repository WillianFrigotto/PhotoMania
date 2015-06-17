package br.edu.unisep.photomania.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Willian on 13/06/2015.
 */
public class UsuarioHelper extends SQLiteOpenHelper {

    public UsuarioHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table usuario (" +
                " _id integer primary key, " +
                " nome text, " +
                " email text, " +
                " senha text, " +
                " dt_nascimento integer, " +
                "caminho_foto text" +
                " )";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
