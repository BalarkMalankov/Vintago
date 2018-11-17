package com.vintago.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DetalleordenPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "producto_idproducto"/*, insertable = false, updatable = false*/)
    private int productoIdproducto;

    @Column(name = "orden_idorden"/*, insertable = false, updatable = false*/)
    private int ordenIdorden;

}
