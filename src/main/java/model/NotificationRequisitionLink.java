package model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "NotificationRequisitionLink")
@Data
@AllArgsConstructor
public class NotificationRequisitionLink {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "NotificationID")
    private Long notificationId;
    
    @Column(name = "RequisitionID")
    private Long requisitionId;

    // Constructors, getters, and setters
}
