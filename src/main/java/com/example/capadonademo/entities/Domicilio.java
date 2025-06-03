package com.example.capadonademo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Domicilio")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicilio extends Base{
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false) // La localidad no puede ser nula cuado creamos un domicilio
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
