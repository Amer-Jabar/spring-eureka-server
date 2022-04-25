package serviceregistry.centralregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
In a server that is based on Eureka, a lot of configuration can be done. Be sure to include only the neccessary
dependencies: spring-cloud-starter + spring-cloud-netflix-eureka-server. Also, make sure to include the properties
in the properties file that resolve the startup errors. For the current status, the dependencyManagement was better
not be be included in the pom.xml file.
*/
@SpringBootApplication
@EnableEurekaServer
public class CentralRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CentralRegistryApplication.class, args);
    }
}
