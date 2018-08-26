/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 10)
    private Integer numeroCuotas;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLimite;
    @Column(length = 10)
    private Double saldoTotal;
    @Column(length = 10)
    private Double saldoPendiente;
    @Column(length = 10)
    private Double valorPrestamo;
    @Column(length = 10)
    private Double interes;
    @Column(length = 50)
    private String tipo;
    private Boolean estado=true;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(referencedColumnName = "id", name = "idCuentaBancaria")
    private CuentaBancaria cuentaBancaria;
    @OneToMany(mappedBy = "prestamos", cascade = CascadeType.ALL)
    private List<Pagos> listaPagos = new ArrayList<>();
    
    

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
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Prestamos[ id=" + id + " ]";
    }
    
}
