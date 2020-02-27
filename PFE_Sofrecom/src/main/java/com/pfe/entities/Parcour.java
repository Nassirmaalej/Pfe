package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the parcours database table.
 * 
 */
@Entity
@Table(name="parcours")
@NamedQuery(name="Parcour.findAll", query="SELECT p FROM Parcour p")
public class Parcour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code;

	private String libelle;

	//bi-directional many-to-one association to Path
	@OneToMany(mappedBy="parcour")
	private List<Path> paths;

	public Parcour() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Path> getPaths() {
		return this.paths;
	}

	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}

	public Path addPath(Path path) {
		getPaths().add(path);
		path.setParcour(this);

		return path;
	}

	public Path removePath(Path path) {
		getPaths().remove(path);
		path.setParcour(null);

		return path;
	}

}