package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.net.URL;

public class GithubSearch {
    public WebDriver driver = null;
    @BeforeMethod(alwaysRun = true)
    public void setup() throws Exception{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void searchGithub() {
        driver.get("https://gh-users-search.netlify.app/");
        System.out.println("Title of the page is: " + driver.getTitle());
        driver.findElement(By.cssSelector("input[data-testid='search-bar']")).sendKeys("Arghajit47");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
