package helpers;

public class SystemPropertiesReader {

    public static String readSelenoidUrl() {
        return System.getProperty("selenoidUrl", "selenoid.autotests.cloud/wd/hub/");
    }

    public static String readVideoUrl() {
        return System.getProperty("videoUrl", "https://selenoid.autotests.cloud/video/");
    }


}