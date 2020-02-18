package br.com.aula03;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText nome;
    EditText email;
    EditText curso;
    Button concluir;

    public static final int TELA2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Aula02","Main Activity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        nome = (EditText) findViewById(R.id.editTextNome);
        email = (EditText) findViewById(R.id.editTextEmail);
        curso = (EditText) findViewById(R.id.editTextCurso);
        concluir = (Button) findViewById(R.id.buttonConcluir);

        /*concluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = nome.getText().toString();
                Log.i("Aula02", "nome = "+n);
            }
        });*/

    }



    public void onClickConcluir(View v){
        Intent intent = new Intent(this, Tela2Activity.class);
        String Snome = nome.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("nome",Snome);
        intent.putExtras(bundle);
        //startActivity(intent);
        startActivityForResult(intent, TELA2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TELA2){
            if(resultCode == Activity.RESULT_OK){
                Bundle bundle = data.getExtras();
                String retorno = bundle.getString("retorno");
                textView.setText(retorno);
            }
        }

    }

    @Override
    protected void onStart() {
        Log.i("Aula02","Main Activity onStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.i("Aula02","Main Activity onResume");
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.i("Aula02","Main Activity onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Aula02","Main Activity onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Aula02","Main Activity onDestroy");
        super.onDestroy();
    }


}
