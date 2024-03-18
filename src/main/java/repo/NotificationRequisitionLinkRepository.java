package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.NotificationRequisitionLink;

@Repository
public interface NotificationRequisitionLinkRepository extends JpaRepository<NotificationRequisitionLink, Long> {
    // You can add custom query methods if needed
}
