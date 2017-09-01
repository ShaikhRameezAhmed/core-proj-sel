package com.Modelling.Util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesOperation implements Serializable{
 
    private Properties prop;
    String java;
    int hu;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
    
    //load the properties in hashmap
    public void loadAllProperties(HashMap<String, String> hs, String propertypath) {
	prop = new Properties();
	
	
    }
    
}
