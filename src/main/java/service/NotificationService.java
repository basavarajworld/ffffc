package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repo.NotificationRepository;

import java.util.List;

import javax.management.Notification;

@Service
public class NotificationService {
    
    private final NotificationRepository notificationRepository;
    
    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
    
    public List<model.Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
    
    public model.Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }
    
    // You can add more methods as per your business requirements
}

