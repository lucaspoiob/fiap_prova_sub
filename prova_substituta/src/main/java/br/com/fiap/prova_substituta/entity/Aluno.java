package br.com.fiap.prova_substituta.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    private String id;
    private String name;
    private String registry;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    public Aluno() {
    }

    public Aluno(String id, String name, String registry, Sex sex) {
        this.id = id;
        this.name = name;
        this.registry = registry;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegistry() {
        return registry;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Aluno{id=" + id + ", nome=" + name + ", matricula=" + registry + ", sex=" + sex + '}';
    }
}
