package com.example.carteiradeclientes.entidades;

import java.io.Serializable;

public class Cliente implements Serializable {
    public Integer codigo;
    public String nome, endereco, email, telefone;

    public Cliente(){
        codigo = 0;
    }
}
