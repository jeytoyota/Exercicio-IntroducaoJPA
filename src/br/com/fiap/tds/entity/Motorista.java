package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_EXJPA_MOTORISTA")
public class Motorista {
	
	@Id
	@Column(name="nr_carteira")
	private int carteira;
	
	@Column(name="nm_motorista", nullable = false, length = 150)
	private String motorista;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	@Column(name="ft_carteira")
	private byte fotoCarteira;
	
	@Column(name="ds_genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Motorista(int carteira, String motorista, Calendar nascimento, byte fotoCarteira, Genero genero) {
		super();
		this.carteira = carteira;
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.fotoCarteira = fotoCarteira;
		this.genero = genero;
	}
	
	

	public Motorista(int carteira, String motorista, Calendar nascimento, Genero genero) {
		super();
		this.carteira = carteira;
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.genero = genero;
	}



	public Motorista() {
		
	}

	public int getCarteira() {
		return carteira;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public byte getFotoCarteira() {
		return fotoCarteira;
	}

	public void setFotoCarteira(byte fotoCarteira) {
		this.fotoCarteira = fotoCarteira;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Motorista [carteira=" + carteira + ", motorista=" + motorista + ", nascimento=" + nascimento
				+ ", fotoCarteira=" + fotoCarteira + ", genero=" + genero + "]";
	}
	
	

}
