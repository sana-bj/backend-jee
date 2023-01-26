package bankend.managment.backend.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bankend.managment.backend.entities.Role;
import bankend.managment.backend.services.IRoleService;

@Component
public class RoleInitailizer implements CommandLineRunner  {
	
    @Autowired 
	private IRoleService roleService;
	@Override 
	public void run(String... args) throws Exception{
		Role role1 = new Role();
		role1.setCode("Admin");
		role1.setLabel("Bank admin");
		roleService.save(role1);
		
		roleService.findAll()
		.stream()
		.forEach(role -> {
			System.out.print(role.getCode());
		});
		
		
	}
}


