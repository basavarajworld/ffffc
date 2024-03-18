package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Requisition;

@Repository
public interface RequisitionRepository extends JpaRepository<Requisition, Long> {
    // You can add custom query methods if needed
}

