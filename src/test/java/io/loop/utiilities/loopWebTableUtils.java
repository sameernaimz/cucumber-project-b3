package io.loop.utiilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loopWebTableUtils {
    public static String returnAnyField(WebDriver driver, String name, String field) throws InterruptedException {
        WebElement element = null;
        String xpath = "";

        switch (field.toLowerCase()) {
            case "type":

            xpath = "//td[2][text()='" + name + "']/following-sibling::td[1]";
            element = driver.findElement(By.xpath(xpath));

            break;
            case "amount":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[2]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "date":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[3]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "street":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[4]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "city":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[5]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "state":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[6]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "zip":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[7]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "card":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[8]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "card number":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[9]";
                element = driver.findElement(By.xpath(xpath));

                break;
            case "exp":

                xpath = "//td[2][text()='" + name + "']/following-sibling::td[10]";
                element = driver.findElement(By.xpath(xpath));

                break;
            default:throw new InterruptedException("there is not such a field" + field);
        }
        return element.getText().trim();

    }

}

