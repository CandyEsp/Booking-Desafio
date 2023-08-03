package booking.test.definitions;

import com.booking.bot.steps.StepLogin;
import com.booking.bot.steps.StepReserva;
import com.booking.bot.utility.Constantes;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class BookingDefinition {

    @Steps
    StepLogin stepLogin;
    @Steps
    StepReserva stepReserva;


    @Given("que como usuario registrado realizo el login en el aplicativo {string} {string}")
    public void queComoUsuarioRegistradoRealizoElLoginEnElAplicativo(String usuario, String pass) throws Throwable {
        stepLogin.ingresar_usuario(usuario);
        stepLogin.ingresar_contrasena(pass);
        stepLogin.iniciar_sesion();
    }

    @When("deseo realizar la busqueda de una habitacion en el {string}")
    public void deseoRealizarLaBusquedaDeUnaHabitacionEnEl(String destino) throws Throwable {
        stepReserva.buscar_alojamiento(destino);
    }

    @And("selecciono la habitacion del listado de busqueda")
    public void seleccionoLaHabitacionDelListadoDeBusqueda() throws Throwable {
        stepReserva.seleccionar_opcion();
        stepReserva.seleccionar_habitacion();
        stepReserva.elegir_instancia();
    }

    @And("verifico que el precio de la habitacion sea el correcto")
    public void verificoQueElPrecioDeLaHabitacionSeaElCorrecto() {
        assertEquals(Constantes.initialPrice ,Constantes.finalPrice);
    }
    @Then("valido la seleccion correcta de la habitacion")
    public void validoLaSeleccionCorrectaDeLaHabitacion() {
        assertEquals("1 habitación seleccionada" ,stepReserva.validar_habitacion_seleccionada());
    }


}
