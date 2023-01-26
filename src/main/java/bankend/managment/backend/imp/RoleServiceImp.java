package bankend.managment.backend.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import bankend.managment.backend.dao.RoleDao;
import bankend.managment.backend.entities.Role;
import bankend.managment.backend.services.IRoleService;
@Service
public class RoleServiceImp implements IRoleService{
	@Autowired
	private RoleDao roleDao;
	@Override
	public Role save(Role role) {
		return roleDao.save(role);
		 
	}

	
	@Override
	public Optional<Role> findById(Long id) {
		
		return roleDao.findById(id);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		 return Streamable.of(roleDao.findAll()).toList();
	}

}
