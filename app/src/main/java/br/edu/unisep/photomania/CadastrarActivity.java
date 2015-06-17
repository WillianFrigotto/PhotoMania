package br.edu.unisep.photomania;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.edu.unisep.photomania.model.UsuarioDAO;
import br.edu.unisep.photomania.vo.UsuarioVO;

/**
 * Created by Willian on 31/05/2015.
 */
public class CadastrarActivity extends Activity {
    private EditText txtNome;
    private EditText txtEmail;
    private EditText txtSenha;

    UsuarioVO usuario = new UsuarioVO();

    private Uri uriFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar);

        Intent intent = getIntent();

        txtNome = (EditText) findViewById(R.id.txtEmail);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
    }

    public void salvar(View v) {

        usuario.setNome(txtNome.getText().toString());
        usuario.setEmail(txtEmail.getText().toString());
        usuario.setSenha(txtSenha.getText().toString());

        UsuarioDAO dao = new UsuarioDAO(this);
        dao.salvar(usuario);

        Intent intente = new Intent(this, LoginActivity.class);
        startActivity(intente);
    }

    public void novaFoto(View v) {

        File dirImagens = getDiretorioImagens();

        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");

        String timestamp = df.format(new Date());

        String nomeArquivo = dirImagens.getPath() + File.separator + "foto_" + timestamp + ".jpg";
        File arqFoto = new File(nomeArquivo);
        uriFoto = Uri.fromFile(arqFoto);

        usuario.setCaminhoFoto(nomeArquivo);

        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        i.putExtra(MediaStore.EXTRA_OUTPUT, uriFoto);

        startActivity(i);
    }

    private File getDiretorioImagens() {

        File dirImagens = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "PhotoMania");
        if (!dirImagens.exists()) {
            dirImagens.mkdirs();
        }
        return dirImagens;
    }
}
