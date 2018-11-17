package com.vintago.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Direccion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion")
    private int iddireccion;

    @NotEmpty
    @Column(name = "pais")
    private String pais;

    @NotEmpty
    @Column(name = "provincia")
    private String provincia;

    @NotEmpty
    @Column(name = "distrito")
    private String distrito;

    @NotEmpty
    @Column(name = "calle")
    private String calle;

    @NotNull
    @Column(name = "codigopostal")
    private int codigopostal;

    @NotEmpty
    @Column(name = "lote")
    private String lote;

    @JsonIgnore
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "cliente_idcliente")
    private Cliente cliente;



}
