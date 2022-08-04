package com.dentsu.dwsproject.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="bandas")
public class Band {

	@Column(name="name")
    public String name;

	@Column(name="image")
    public String image;

	@Column(name="genre")
    public String genre;

	@Column(name="biography")
    public String biography;

	@Column(name="numPlays")
    public int numPlays;

	@Column(name="albums")
    public ArrayList<String> albums;

	@Id
    @GeneratedValue
	@Column(name="id")
	public String id;

    /*@OneToMany
    @JoinColumn(name="albums")
    public ArrayList<Album> albumList;*/
		
}