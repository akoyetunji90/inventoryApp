package com.zeedlabs.login;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zeedlabs.login.entity.Role;
import com.zeedlabs.login.entity.User;
import com.zeedlabs.login.repository.RoleRepository;
import com.zeedlabs.login.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RoleRepository roleRepo;

	@Test
	public void testAddRoleToNewUser() {
		Role roleUser = roleRepo.findByName("User");

		User user = new User();
		user.setEmail("adekunle@zeedlabs.com.com");
		user.setPassword("Pass123$$##");
		user.setFirstName("OluwaSegun");
		user.setLastName("Adekunle");
		user.addRole(roleUser);

		User savedUser = userRepo.save(user);

		assertThat(savedUser.getRoles().size()).isEqualTo(1);
	}

	@Test
	public void testAddRoleToExistingUser() {
		User user = userRepo.findById(1L).get();
		Role roleUser = roleRepo.findByName("User");
		Role roleAdmin = new Role(2L);

		user.addRole(roleUser);
		user.addRole(roleAdmin);

		User savedUser = userRepo.save(user);

		assertThat(savedUser.getRoles().size()).isEqualTo(2);
	}
}
