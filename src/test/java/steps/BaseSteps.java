package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PaginaPrincipal;

public class BaseSteps {

    public String titulo;
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();


    @Given("El usuario ingresa a la pagina herokuapp")
    public void el_usuario_ingresa_a_la_pagina_herokuapp() {
        paginaPrincipal.abrirPagina();
    }
    @Then("El usuario visualiza el titulo \"Welcome to the-internet\"")
    public void el_usuario_visualiza_el_titulo_welcome_to_the_internet() {
    titulo = paginaPrincipal.traerTitulo();

    Assert.assertEquals(titulo, "Welcome to the-internet");

    }
}
