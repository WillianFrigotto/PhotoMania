package br.edu.unisep.photomania;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.edu.unisep.photomania.model.PostagemDAO;
import br.edu.unisep.photomania.model.UsuarioDAO;
import br.edu.unisep.photomania.vo.PostagemVO;
import br.edu.unisep.photomania.vo.UsuarioVO;

/**
 * Created by Willian on 19/06/2015.
 */
public class PostagemActivity extends Activity {
    private EditText txtDescricao;
    private Button btnPostar;

    UsuarioVO usuario = new UsuarioVO();
    PostagemVO postagem = new PostagemVO();

    private Uri uriFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_menu_postar_foto);

        Intent intent = getIntent();

        txtDescricao = (EditText) findViewById(R.id.descricao_foto);
        btnPostar = (Button) findViewById(R.id.btn_postar_foto);
    }

    public void salvarPostagem(View v) {
        postagem.setUsuario(usuario);
        postagem.setDescricao(txtDescricao.getText().toString());

        PostagemDAO dao = new PostagemDAO(this);
        dao.salvar(postagem);

        Intent intente = new Intent(this, LoginActivity.class);
        startActivity(intente);
    }

    public void novaPostagem(View v) {

        File dirImagens = getDiretorioImagens();

        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");

        String timestamp = df.format(new Date());

        String nomeArquivo = dirImagens.getPath() + File.separator + "foto_" + timestamp + ".jpg";
        File arqFoto = new File(nomeArquivo);
        uriFoto = Uri.fromFile(arqFoto);

        postagem.setCaminhoPostagem(nomeArquivo);

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
