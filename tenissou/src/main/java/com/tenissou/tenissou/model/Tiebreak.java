package com.tenissou.tenissou.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tiebreak")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
        allowGetters = true)
public class Tiebreak implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_tiebreak")
	private long idTiebreak;
	
	@NotBlank @Column(name="Id_set")
	private Integer idSet;
	
	@NotBlank @Column(name="Equipe1_score")
	private long equipe1Score;
	
	@NotBlank @Column(name="Equipe2_score")
	private long equipe2Score;

	public Tiebreak() {
		super();
	}

	public Tiebreak(long idTiebreak, @NotBlank Integer idSet, @NotBlank long equipe1Score,
			@NotBlank long equipe2Score) {
		super();
		this.idTiebreak = idTiebreak;
		this.idSet = idSet;
		this.equipe1Score = equipe1Score;
		this.equipe2Score = equipe2Score;
	}

	public long getIdTiebreak() {
		return idTiebreak;
	}

	public void setIdTiebreak(long idTiebreak) {
		this.idTiebreak = idTiebreak;
	}

	public Integer getIdSet() {
		return idSet;
	}

	public void setIdSet(Integer idSet) {
		this.idSet = idSet;
	}

	public long getEquipe1Score() {
		return equipe1Score;
	}

	public void setEquipe1Score(long equipe1Score) {
		this.equipe1Score = equipe1Score;
	}

	public long getEquipe2Score() {
		return equipe2Score;
	}

	public void setEquipe2Score(long equipe2Score) {
		this.equipe2Score = equipe2Score;
	}
}