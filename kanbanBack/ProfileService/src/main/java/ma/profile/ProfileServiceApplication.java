package ma.profile;

import ma.profile.models.implementation.Role;
import ma.profile.services.implementation.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Objects;

@SpringBootApplication
@EnableDiscoveryClient
public class ProfileServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(RoleService roleService){
        return args -> {
            Role adminRole = roleService.findAll().stream().filter(r -> r.getName().equals("ADMIN")).findFirst().orElse(null);
            Role userRole = roleService.findAll().stream().filter(r -> r.getName().equals("USER")).findFirst().orElse(null);

            if(Objects.isNull(adminRole)) roleService.save(Role.builder().name("ADMIN").build());
            if(Objects.isNull(userRole)) roleService.save(Role.builder().name("USER").build());
        };
    }

}
