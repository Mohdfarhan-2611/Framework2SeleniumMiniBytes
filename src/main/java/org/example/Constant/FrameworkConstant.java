package org.example.Constant;

public class FrameworkConstant {

    private FrameworkConstant(){

    }
    private static final String CONFIGFILEPATH = System.getProperty("user.dir")+"/src/test/resources/data.properties";
    private static final int EXPLICITWAIT = 10;


    public static int getEXPLICITWAIT() {
        return EXPLICITWAIT;
    }

    public static String getConfigfilepath()
    {
        return CONFIGFILEPATH;
    }




}
