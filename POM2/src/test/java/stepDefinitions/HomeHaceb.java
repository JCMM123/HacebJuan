package stepDefinitions;

import com.haceb.step.HomeHacebSteps;
import com.haceb.step.ProductDeatilsSteps;
import com.haceb.step.ProductListSteps;
import com.haceb.step.Validate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeHaceb {
    @Managed
    WebDriver driver;

    @BeforeAll
    public void setUpClass(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }
    @BeforeEach
    public void setUpTest(){
        driver= new ChromeDriver();
    }


    @Steps
    HomeHacebSteps homeHacebSteps;
    @Steps
    ProductDeatilsSteps productDeatilsSteps;
    @Steps
    ProductListSteps productListSteps;
    @Steps
    Validate validate;


    @Given("que el usuario abra el navegador en la url de haceb")
    public void queElUsuarioAbraElNavegadorEnLaUrlDeHaceb() {
        homeHacebSteps.userOpenBrowser();
        homeHacebSteps.clickAlert();
    }

    @When("el usuario busque el producto y lo seleccione")
    public void elUsuarioBusqueElProductoYLoSeleccione(io.cucumber.datatable.DataTable dataTable) {
        homeHacebSteps.search(dataTable);
        productListSteps.UserPressesTheButtonAddToCart();
        productDeatilsSteps.addProductCart();
        productDeatilsSteps.clicCart();
    }

    @Then("el usuario podrá visualizar el producto en el carrito")
    public void elUsuarioPodráVisualizarElProductoEnElCarrito() {
        validate.assertion();
    }

}

