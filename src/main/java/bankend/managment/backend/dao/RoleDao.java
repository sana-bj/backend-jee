package bankend.managment.backend.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bankend.managment.backend.entities.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Long>{

}
