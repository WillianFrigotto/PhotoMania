package br.edu.unisep.photomania;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;

import br.edu.unisep.photomania.adapter.PostagemAdapter;
import br.edu.unisep.photomania.model.PostagemDAO;

/**
 * Created by Willian on 17/06/2015.
 */
public class TimeLineActivity extends ListActivity {

    private PostagemDAO dao;
    private Cursor crsPostagem;

    private PostagemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telapadrao);

        dao = new PostagemDAO(this);
        crsPostagem = dao.listar();

        adapter = new PostagemAdapter(this, crsPostagem, 0);
        setListAdapter(adapter);
    }
}
