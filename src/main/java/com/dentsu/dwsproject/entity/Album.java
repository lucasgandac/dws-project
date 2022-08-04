package com.dentsu.dwsproject.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="albums")
public class Album {

    @Id
    @GeneratedValue
    @Column(name="id")
    public long id;

    @Column(name="name")
    public String name;

    @Column(name="image")
    public String image;

    @Column(name="releasedDate")
    public String releasedDate;

    @Column(name="band")
    public String band;
    
    /*@OneToMany
    @JoinColumn(name="tracks")
    @Column(name="tracks", table="tracks")
    public ArrayList<Track> tracks;  */

}
