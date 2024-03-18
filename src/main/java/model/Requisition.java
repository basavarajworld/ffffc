package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Requisitions")
@Data
@AllArgsConstructor
public class Requisition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RequisitionID")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "BusinessUnitID")
    private BusinessUnit businessUnit;
    
    @ManyToOne
    @JoinColumn(name = "ItemID")
    private Item item;
    
    @ManyToOne
    @JoinColumn(name = "UserID")
    private User user;
    
    @Column(name = "RequisitionCode")
    private String requisitionCode;
    
    @Column(name = "TotalAmount")
    private Double totalAmount;

	public String getPurchasingGroup() {
		// TODO Auto-generated method stub
		return null;
	}

    // Constructors, getters, and setters
}
