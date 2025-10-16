package pages;

public class PaginaPrincipal extends BasePage{

    private String titulo = "//h1[@class='heading']";
    public void abrirPagina(){
        navigateTo("https://the-internet.herokuapp.com/");
    }

    public String traerTitulo(){
       return getText(titulo);
    }

}
