package tramo.pages;

import org.junit.Assert;

public class LogInPages extends BasePage{
    String buttonLogInLanding = "//a[contains(text(),'Inicio Sesion')]";
    String LogInButton = "//button[contains(text(),'Iniciar sesión')]";
    String inputUser = "//input[@id='form-label']";
    String inputPass = "//input[@id='contrasena']";
    String user = "//span[contains(text(),'Carlos Noguera')]";

    public void navigateToUrl() {
        open();
    }

    // Metodo para ingresar usuario y contraseña en el login de la pagina web
    public void enterCredentials(String user, String pass) {
        click(buttonLogInLanding);
        write(inputUser, user);
        write(inputPass, pass);
    }

    // Metodo para dar click en el boton de login
    public void clickLogInButton() {
        click(LogInButton);
    }

    public void checkDashboard() {
        Assert.assertTrue(displayedElement(user));
    }
}
