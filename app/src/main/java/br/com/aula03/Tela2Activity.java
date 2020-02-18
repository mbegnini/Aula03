package br.com.aula03;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView textViewBoasVindas;
    EditText editTextRetorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Aula02","Tela2 onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        editTextRetorno = (EditText) findViewById(R.id.editTextRetorno);
        textViewBoasVindas = (TextView) findViewById(R.id.textViewBemVindo);

        Bundle bundle = getIntent().getExtras();
        String nome = bundle.getString("nome");

        textViewBoasVindas.setText(getString(R.string.bem_vindo)+" "+ nome);

    }

    public void onClickConcluir(View v){
        String retorno = editTextRetorno.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("retorno", retorno);
        Intent returnIntent = new Intent();
        returnIntent.putExtras(bundle);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }

    @Override
    protected void onStart() {
        Log.i("Aula02","Tela2 onStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.i("Aula02","Tela2 onResume");
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.i("Aula02","Tela2 onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Aula02","Tela2 onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Aula02","Tela2 onDestroy");
        super.onDestroy();
    }

}
