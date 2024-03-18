package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.BusinessUnit;

public interface BusinessUnitRepository extends JpaRepository<BusinessUnit, Long> {
}
