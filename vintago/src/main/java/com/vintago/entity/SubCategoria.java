package com.vintago.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SubCategoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsubcategoria")
    private int idsubcategoria;

    @NotEmpty
    @Column(name = "nombresubcategoria")
    private String nombresubcategoria;

    @NotEmpty
    @Column(name = "descripcionsubcategoria")
    private String descripcionsubcategoria;

    @Basic
    @Column(name = "linkimagensubcategoria")
    private String linkimagensubcategoria;

    @ManyToOne
    @JoinColumn(name = "categoria_idcategoria", referencedColumnName = "idcategoria", nullable = false)
    private Categoria categoria;



}

