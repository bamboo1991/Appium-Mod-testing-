package com.techtorial.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
   private static WebDriver driver;
   public Driver(){}
   public static WebDriver getDriver(){
       if (driver!=null) {
           return driver;
       }
           String browser = "chrome";
           switch (browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.chromedriver().setup();
                   driver=new FirefoxDriver();
                   break;
               default:
                   WebDriverManager.chromedriver().setup();
                   driver= new ChromeDriver();
                   break;
           }
           return driver;
       }
   }

