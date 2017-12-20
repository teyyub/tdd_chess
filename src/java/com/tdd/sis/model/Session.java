package com.tdd.sis.model;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author teyyub Apr 24, 2016 1:24:43 PM
 */
abstract public class Session {
    
    public Session(){}
    
    private URL url;

    public void setUrl(String urlString) throws MalformedURLException {
        this.url = new URL(urlString);
    }

    public URL getUrl() {
        return url;
    }

}
