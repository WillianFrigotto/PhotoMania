package br.edu.unisep.photomania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Willian on 31/05/2015.
 */
public class LoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        Intent intent = getIntent();
    }

}
