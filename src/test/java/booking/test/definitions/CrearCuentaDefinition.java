package booking.test.definitions;

import com.booking.bot.steps.StepLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class CrearCuentaDefinition {

    @Steps
    StepLogin stepLogin;

    @Given("que deseo registrarme como el usuario {string}")
    public void queDeseoRegistrarmeComoElUsuario(String user) throws Throwable {
        stepLogin.ingresar_usuario(user);
    }

    @When("ingreso un {string} incorrecto")
    public void ingresoUnIncorrecto(String pass) throws Throwable {
        stepLogin.crear_contrasena(pass);
    }

    @Then("valido el mensaje de alerta en pantalla")
    public void validoElMensajeDeAlertaEnPantalla() {
       assertTrue(stepLogin.muestra_alerta());
    }

    @When("ingreso un {string} correcto")
    public void ingresoUnCorrecto(String pass) throws Throwable {
        stepLogin.crear_contrasena(pass);
    }


    @Then("se debe mostrar la pantalla de inicio")
    public void seDebeMostrarLaPantallaDeInicio() {
        assertTrue(stepLogin.muestra_home());
    }
}
