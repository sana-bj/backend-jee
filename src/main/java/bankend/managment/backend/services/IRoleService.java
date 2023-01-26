package bankend.managment.backend.services;

import java.util.List;
import java.util.Optional;

import bankend.managment.backend.entities.Role;

public interface IRoleService {
	
	Role save(Role role);
	Optional<Role> findById(Long id);
	List<Role> findAll();

}
