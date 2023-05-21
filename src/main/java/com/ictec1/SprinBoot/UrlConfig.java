package com.ictec1.SprinBoot;

public class UrlConfig {

    private String url;

    UrlConfig(String prefix, String host){
        this.url = prefix + "://" + host;
    }

    UrlConfig(String prefix, String host, String port){
        this.url = prefix + "://" + host + ":" + port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
