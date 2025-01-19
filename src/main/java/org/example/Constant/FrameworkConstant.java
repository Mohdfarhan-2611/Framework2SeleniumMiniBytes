package org.example.Constant;

public class FrameworkConstant {

    private FrameworkConstant(){

    }
    private static final String CONFIGFILEPATH = System.getProperty("user.dir")+"/src/test/resources/data.properties";
    public static String getConfigfilepath()
    {
        return CONFIGFILEPATH;
    }

}
