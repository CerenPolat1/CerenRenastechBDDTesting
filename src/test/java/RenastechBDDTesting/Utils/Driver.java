package RenastechBDDTesting.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static ThreadLocal<WebDriver> driverPool=new ThreadLocal<>();//it will create a pool of driver and
    // everytime it will launch a new driver(more than one driver)

    //alttaki method sayesinde birden fazla senaryo ayni anda run edebilecek, birini run edecek kapatacajk digerini run edecek
    private Driver(){
    }

    public static WebDriver getDriver(){// means launch chrome
        if (driverPool.get()==null){//if it is null launch a new one
            synchronized (Driver.class) {//if you do not synchronize, driver will get confused, It coordinates and organize them
                //Without "synchronized" Driver wants to run all test cases at the same time.
                //synchronized (Driver.class) is for paralel testing

                switch (ConfigurationReaders.getProperty("browser")) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driverPool.set(new EdgeDriver());
                    default:
                        System.out.println("The Driver is NOT Found!!!");
                }
            }
        }
        return driverPool.get();
    }

    public static void closeDriver(){
        if (driverPool.get()!=null){
            driverPool.get().quit();//will close all of them
            driverPool.remove();//destroy the session
        }
    }

}
