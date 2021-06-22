package helpers;

public class SystemPropertiesReader {

    public static String readSelenoidUrl() {
        return System.getProperty("selenoidUrl");
    }

    public static String readVideoUrl() {
        return System.getProperty("videoUrl");
    }
}