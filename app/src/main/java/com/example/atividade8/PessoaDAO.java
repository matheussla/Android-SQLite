package com.example.atividade8;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PessoaDAO {

    private Conexao conn;
    private SQLiteDatabase bd;

    public PessoaDAO(Context context){
        conn = new Conexao (context);
        bd = conn.getWritableDatabase();

    }

    public long inserir(Pessoa pessoa){
        ContentValues values = new ContentValues();
        values.put("nome", pessoa.getName());
        values.put("email", pessoa.getEmail());
        values.put("telefone", pessoa.getTelefone());
        return bd.insert("pessoa", null, values);
    }


}
