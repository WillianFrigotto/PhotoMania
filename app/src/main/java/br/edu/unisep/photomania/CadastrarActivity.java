package br.edu.unisep.photomania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.edu.unisep.photomania.model.UsuarioDAO;
import br.edu.unisep.photomania.vo.UsuarioVO;

/**
 * Created by Willian on 31/05/2015.
 */
public class CadastrarActivity extends Activity{
    private EditText txtNome;
    private EditText txtEmail;
    private EditText txtSenha;

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
        UsuarioVO usuario = new UsuarioVO();

        usuario.setNome(txtNome.getText().toString());
        usuario.setEmail(txtEmail.getText().toString());
        usuario.setSenha(txtSenha.getText().toString());

     //   DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       // String data = txtData.getText().toString();



        UsuarioDAO dao = new UsuarioDAO(this);
        dao.salvar(usuario);

        Intent intente = new Intent(this, LoginActivity.class);
        startActivity(intente);
    }

}
