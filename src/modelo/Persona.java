/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Fabricio
 */
@Getter
@Setter
@Entity
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 40)
    private String nombre;
    @Column(length = 40)
    private String apellido;
    @Column(length = 13)
    private String cedula;
    @Column(length = 13)
    private String telefono;
    @Column(length = 40)
    private String correo;
    @Column(length = 40)
    private String externalId;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(referencedColumnName = "id", name = "idRol")
    private Rol rol;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    private Cuenta cuenta;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    private CuentaBancaria cuentaBancaria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }
    
}
