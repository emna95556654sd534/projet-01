package Miniprojet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageyourcart {

        WebDriver driver;

        public Pageyourcart(WebDriver driver) {

            this.driver = driver;
        }


        public void TitreYOURCART() {
            WebElement Text = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
            String Xsite = Text.getText();
            String Xcorrecte = "YOUR CART";

            if (Xsite.equals(Xcorrecte)) {
                System.out.println("CORRECT");

            } else {

                System.out.println("INCORRECT");

            }

        }
        public void Presence1() {
            WebElement Text = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
            String Xsite = Text.getText();
            String Xcorrecte = "Sauce Labs Backpack";

            if (Xsite.equals(Xcorrecte)) {
                System.out.println("CORRECT");

            } else {

                System.out.println("INCORRECT");

            }

        }
        public void Presence2(){
            WebElement Text = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
            String Xsite = Text.getText();
            String Xcorrecte = "Sauce Labs Bike Light";

            if (Xsite.equals(Xcorrecte)) {
                System.out.println("present");

            } else {

                System.out.println("non present");

            }

        }

        public void CHEKOUT(){
            WebElement BtCHEKOUT=driver.findElement(By.id("checkout"));
            BtCHEKOUT.click();


        }
    }

