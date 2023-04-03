package Test_Runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "C:\\Users\\Aryan.Pandey\\IdeaProjects\\Exam_Test\\src\\test\\resources\\features\\login.feature",glue = {"StepDef"})
public class Login_Runner {
}
