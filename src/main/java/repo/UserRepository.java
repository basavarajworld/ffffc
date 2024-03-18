package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here
}
