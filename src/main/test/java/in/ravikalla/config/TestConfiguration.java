package in.ravikalla.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages={    
    "in.ravikalla.controllers", "in.ravikalla.service"})
public class TestConfiguration {
  
  @Bean
  public PersonRepository getPersonRepositoryMock(){
    return Mockito.mock(PersonRepository.class);
  }  
}
