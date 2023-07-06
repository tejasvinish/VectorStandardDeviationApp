package com.vector.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vector1")
public class Vector {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int vector_num;

    private int vector_id;

	public Vector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vector(int id, int vector_num, int vector_id) {
		super();
		this.id = id;
		this.vector_num = vector_num;
		this.vector_id = vector_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVector_num() {
		return vector_num;
	}

	public void setVector_num(int vector_num) {
		this.vector_num = vector_num;
	}

	public int getVector_id() {
		return vector_id;
	}

	public void setVector_id(int vector_id) {
		this.vector_id = vector_id;
	}
		
}
	