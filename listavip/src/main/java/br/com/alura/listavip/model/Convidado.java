package br.com.alura.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_convidado", schema = "db_listavip")
public class Convidado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sq_convidado")
	@SequenceGenerator(name = "sq_convidado", sequenceName = "db_listavip.sq_convidado", allocationSize=1)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    
    public Convidado() {
    	
    }
    
    public Convidado ( String nome, String email, String telefone) {
    	this.nome = nome;
    	this.email = email;
    	this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}