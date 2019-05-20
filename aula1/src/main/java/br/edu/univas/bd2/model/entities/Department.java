package br.edu.univas.bd2.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
//pode comentar aqui susssegado
public class Department implements Serializable {

	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEP_GENERATOR")
	@SequenceGenerator(name="DEP_GENERATOR", sequenceName="seq_departamento", 
						allocationSize=3)
	private int code;
	
	@Column(name="nome", nullable=false, length=20)
	private String name;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
