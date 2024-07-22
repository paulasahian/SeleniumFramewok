package framework.Maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashPageMap {

    public By productContainers = By.cssSelector(".col-lg-4.col-md-6.col-sm-10");
    public By addToCartButtons = By.xpath(".//button[contains(text(), 'Add To Cart')]");

    public By zaraAddToCartButton = By.xpath("(//button[@class='btn w-10 rounded'])[1]");

    public By adidasAddToCartButton = By.xpath("(//button[@class='btn w-10 rounded'])[2]");

    public By iphoneAddToCartButton = By.xpath("(//button[@class='btn w-10 rounded'])[3]");

    public By zaraCoatViewButton = By.xpath("(//button[@class='btn w-40 rounded'])[2]");

    public By adidasViewButton = By.xpath("(//button[@class='btn w-40 rounded'])[2]");

    public By iphoneViewButton = By.xpath("(//button[@class='btn w-40 rounded'])[3]");

    public By cartButton =  By.cssSelector("button[routerlink='/dashboard/cart'][tabindex='0']");

    public By overlay = By.cssSelector(".ngx-spinner-overlay");


    // Método para obtener los contenedores de productos
    /*public List<WebElement> getProductContainers(WebDriver driver) {
        return driver.findElements(productContainers);
    }
    // Método para obtener los botones "Add to Cart" dentro de cada contenedor de producto
    public List<WebElement> getAddToCartButtons(WebDriver driver) {
        List<WebElement> botonesAgregarAlCarrito = new ArrayList<>();
        List<WebElement> productos = getProductContainers(driver);

        for (WebElement producto : productos) {
            WebElement botonAgregarAlCarrito = producto.findElement(addToCartButton);
            botonesAgregarAlCarrito.add(botonAgregarAlCarrito);
        }

        return botonesAgregarAlCarrito;
    }

     */

}
