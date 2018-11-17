package com.vintago.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private int idcategoria;

    @NotEmpty
    @Column(name = "nombrecategoria")
    private String nombrecategoria;

    @NotEmpty
    @Column(name = "descripcioncategoria")
    private String descripcioncategoria;

    @Basic
    @Column(name = "linkimagencategoria")
    private String linkimagencategoria;

    @JsonIgnore
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubCategoria> subCategorias = new ArrayList<>();

}
