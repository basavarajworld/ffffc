package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // You can add custom query methods if needed
}

