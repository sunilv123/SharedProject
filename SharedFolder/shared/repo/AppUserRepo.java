package shared.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import shared.modal.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Long>{

}
