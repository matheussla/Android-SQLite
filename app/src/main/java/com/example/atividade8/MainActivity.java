package com.example.atividade8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText telefone;
    private PessoaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        email = findViewById(R.id.editEmail);
        telefone = findViewById(R.id.editNascimento);
        dao = new PessoaDAO(this);
    }

    public void salvar(View view){
        Pessoa p = new Pessoa();
        p.setName(nome.getText().toString());
        p.setEmail(email.getText().toString());
        p.setTelefone(telefone.getText().toString());
        long id = dao.inserir(p);
        Toast.makeText(this, "Pessoa inserida com o id: " + id + ", Nome: " + nome + ", Email: " + email + " e Telefone: " + telefone, Toast.LENGTH_SHORT).show();


    }
}
