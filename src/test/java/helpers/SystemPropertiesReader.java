package helpers;

public class SystemPropertiesReader {

    public static String readSelenoidUrl() {
        return System.getProperty("selenoidUrl", "selenoid.autotests.cloud");
    }

    public static String readVideoUrl() {
        return System.getProperty("videoUrl", "https://selenoid.autotests.cloud/video/");
    }


}