package br.edu.unisep.photomania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.edu.unisep.photomania.model.UsuarioDAO;
import br.edu.unisep.photomania.vo.UsuarioVO;

/**
 * Created by Willian on 31/05/2015.
 */
public class LoginActivity extends Activity {

    private TextView txtEmail;
    private TextView txtSenha;
    private Button btnLogar;


    private UsuarioVO usuario = new UsuarioVO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtSenha = (TextView) findViewById(R.id.txtSenha);
        btnLogar = (Button) findViewById(R.id.btn_logar);
    }

    public void entrar(View v) {

        usuario.setEmail(txtEmail.getText().toString());
        usuario.setSenha(txtSenha.getText().toString());

        UsuarioDAO dao = new UsuarioDAO(this);
        Integer retorno = dao.login(usuario.getEmail(), usuario.getSenha());

        if (retorno == 1) {
            Intent intente = new Intent(this, CadastrarActivity.class);
            startActivity(intente);
        } else {
            Intent intente = new Intent(this, LoginActivity.class);
            startActivity(intente);
        }
    }

}
