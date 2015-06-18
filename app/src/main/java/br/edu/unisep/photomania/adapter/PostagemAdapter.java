package br.edu.unisep.photomania.adapter;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import br.edu.unisep.photomania.R;

/**
 * Created by Willian on 17/06/2015.
 */
public class PostagemAdapter extends CursorAdapter {

    private LayoutInflater inflater;

    public PostagemAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);

        this.inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View item = inflater.inflate(R.layout.item_perfil, null);
        return item;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView lblNome = (TextView) view.findViewById(R.id.lblNomeUsuario);
        ImageView imgPostagem = (ImageView) view.findViewById(R.id.imgPostagem);

        String nome = cursor.getString(cursor.getColumnIndex("nome"));
        lblNome.setText(nome);
        String imagem = cursor.getString(cursor.getColumnIndex("caminho_foto"));
        imgPostagem.setImageURI(Uri.parse(imagem));
    }
}
