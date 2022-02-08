package com.example.assignment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "district")
    @JsonIgnore
    private Set<Street> street;
    public District(String name){

        this.name = name;
    }
}
