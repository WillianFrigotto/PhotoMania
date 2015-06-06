package br.edu.unisep.photomania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import br.edu.unisep.photomania.vo.UsuarioVO;

/**
 * Created by Willian on 31/05/2015.
 */
public class LoginActivity extends Activity{

    private TextView txtEmail;
    private TextView txtSenha;
    private Button btnLogar;



    private UsuarioVO usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        Intent intent = new Intent();


        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtSenha = (TextView) findViewById(R.id.txtSenha);
        btnLogar = (Button) findViewById(R.id.btn_logar);
    }

}
