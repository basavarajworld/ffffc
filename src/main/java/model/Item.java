package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Items")
@Data
@AllArgsConstructor
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ItemID")
    private Long id;
    
    @Column(name = "ItemNo")
    private String itemNo;
    
    @Column(name = "ItemCode")
    private String itemCode;
    
    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "Quantity")
    private Double quantity;
    
    @Column(name = "UOM")
    private String uom;
    
    @Column(name = "EstimatedPrice")
    private Double estimatedPrice;

    // Constructors, getters, and setters
}
