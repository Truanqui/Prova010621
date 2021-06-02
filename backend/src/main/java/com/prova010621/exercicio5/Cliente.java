package com.prova010621.exercicio5;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Tarefas> tarefas = new ArrayList<>();
    
    public  Cliente(Long id, String name){
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Tarefas> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }
}
