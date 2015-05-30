package br.edu.unisep.photomania.model;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Willian on 28/05/2015.
 */
public class PhotoManiaOpenHelper extends SQLiteOpenHelper{


    @Override
    public void onCreate(SQLiteDatabase db) {
        this.createUsuario(db);
        this.createSeguidor(db);
        this.createDicas(db);
        this.createPostagem(db);
        this.createSeguidor(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
