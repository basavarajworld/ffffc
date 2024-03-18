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
@Table(name = "Notifications")
@Data
@AllArgsConstructor
public class Notification {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NotificationID")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "UserID")
    private User user;
    
    @Column(name = "NotificationCode")
    private String notificationCode;
    
    @Column(name = "Category")
    private String category;
    
    @Column(name = "Buyer")
    private String buyer;
    
    @Column(name = "Status")
    private String status;

	public Item getRequisition() {
		// TODO Auto-generated method stub
		return null;
	}

    // Constructors, getters, and setters
}

