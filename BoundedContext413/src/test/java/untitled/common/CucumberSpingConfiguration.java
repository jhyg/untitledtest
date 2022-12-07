package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext413Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext413Application.class })
public class CucumberSpingConfiguration {}
