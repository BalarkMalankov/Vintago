package com.vintago.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto")
    private int idproducto;

    @NotEmpty
    @Column(name = "codigoproducto")
    private String codigoproducto;

    @NotEmpty
    @Column(name = "nombreproducto")
    private String nombreproducto;

    @NotNull
    @Column(name = "precioproducto")
    private double precioproducto;

    @NotEmpty
    @Column(name = "descripcionproducto")
    private String descripcionproducto;

    @NotNull
    @Column(name = "stock")
    private int stock;


    @Column(name = "linkimagenproducto")
    private String linkimagenproducto;

    @NotNull
    @Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd-MM-yyy")
    @Column(name = "fechaingreso")
    private Date fechaingreso;

//    @OneToMany(mappedBy = "producto")
//    private List<Detalleorden> detalleordenes;

   /* @JsonIgnore*/
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idsubcategoria")
    private SubCategoria subCategoria;

    @PrePersist
    public void prePersist() {
        this.fechaingreso=new Date();
    }


}
