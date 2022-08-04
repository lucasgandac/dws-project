package com.dentsu.dwsproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tracks")
public class Track {
    
    @Column(name="name")
    public String name;

    @Column(name="duration")
    public String duration;

	@Id
    @GeneratedValue
    //@Column(name="id")
    public String id;


}
