package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext343Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext343Application.class })
public class CucumberSpingConfiguration {}
