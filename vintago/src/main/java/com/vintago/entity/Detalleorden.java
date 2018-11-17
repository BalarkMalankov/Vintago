package com.vintago.entity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
/*@IdClass(DetalleordenPK.class)*/
public class Detalleorden implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private DetalleordenPK id;

    @JsonIgnore
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "orden_idorden", insertable = false, updatable = false)
    private Orden orden;

    @JsonIgnore
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "producto_idproducto", insertable = false, updatable = false)
    private Producto producto;


    @Digits(integer=6, fraction=2)
    @Column(name = "precioproducto")
    private BigDecimal precioproducto;

    @NotNull
    @Column(name = "cantidad")
    private int cantidad;


}
