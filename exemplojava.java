/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
public class usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    public usuario(){
        this("","","","");
    }
    
    public usuario(String email, String login, String nome, String senha){
        this.email = email;
        this.login = login;
        this.email = nome;
        this.senha = senha;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public String setNome(String nome){
        this.nome = nome;
    }
    
    public void provarExistenia(){
        System.out.println("Oi, eu existo!");
    }
}
