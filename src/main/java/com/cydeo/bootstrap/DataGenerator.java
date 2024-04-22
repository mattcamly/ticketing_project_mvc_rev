package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RoleService roleService;
    private final UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "john@cydeo.com", "Abc1", "Abc1", true, "7459684532", managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Mike", "Smith",
                "mike@cydeo.com", "Abc2", "Abc2", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user3 = new UserDTO("Delisa", "Norre",
                "delisa@cydeo.com",  "Abc3", "Abc3", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user4 = new UserDTO("Craig", "Jark",
                "craig@cydeo.com", "Abc4", "Abc4", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user5 = new UserDTO("Shaun", "Hayns",
                "shaun@cydeo.com", "Abc5", "Abc5", true, "3256987412", managerRole, Gender.MALE);
        UserDTO user6 = new UserDTO("Elizebeth", "Loren",
                "elizebeth@cydeo.com", "Abc6", "Abc6", true, "5306987412", employeeRole, Gender.FEMALE);
        UserDTO user7 = new UserDTO("Maria", "Ada",
                "maria@cydeo.com", "Abc7", "Abc7", true, "9996987412", employeeRole, Gender.FEMALE);
        UserDTO user8 = new UserDTO("Bill", "Matt",
                "bill@cydeo.com", "Abc8", "Abc8", true, "8881239846", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);

    }


}
