package br.edu.unisep.photomania.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.edu.unisep.photomania.vo.UsuarioVO;

/**
 * Created by Willian on 14/06/2015.
 */
public class UsuarioDAO {
    private UsuarioHelper helper;

    public UsuarioDAO(Context context) {
        this.helper = new UsuarioHelper(context, "USUARIO", null, 1);
    }

    public void salvar(UsuarioVO usuario) {

        // possibilita a aplicação gravar no banco
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome", usuario.getNome());
        valores.put("email", usuario.getEmail());
        valores.put("senha", usuario.getSenha());
        valores.put("dt_nascimento", String.valueOf(usuario.getDtNascimento()));
        valores.put("caminho_foto", usuario.getCaminhoFoto());

        db.insert("usuario", null, valores);
        db.close();
    }

    public Cursor listar() {

        // Comunicação somente leitura com o banco.
        SQLiteDatabase db = helper.getReadableDatabase();

        String[] colunas = {"_id",
                "nome",
                "email",
                "senha",
                "dt_nascimento",
                "caminho_foto"};

        Cursor crs = db.query("usuario", colunas, null, null, null, null, null);
        return crs;
    }
}
