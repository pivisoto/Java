/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banquinhodamachion;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 22.01046-7
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(int codigo, String nome, String fone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        
    
    }
    public Pessoa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", fone=" + fone + ", email=" + email + '}';
    }
    public void inserir(){
        String sqlInsert = "INSERT INTO tb_pessoa (nome,fone,email) VALUES (?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sqlInsert);
            ps.setString(1, nome);
            ps.setString(2, fone );
            ps.setString(3, email);
            ps.execute();
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
            
    }

}

