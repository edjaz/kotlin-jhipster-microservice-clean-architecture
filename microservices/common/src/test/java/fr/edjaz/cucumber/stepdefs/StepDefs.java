package fr.edjaz.cucumber.stepdefs;

import fr.edjaz.CommonApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CommonApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
