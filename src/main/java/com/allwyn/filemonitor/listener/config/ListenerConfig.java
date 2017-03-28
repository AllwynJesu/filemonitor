package com.allwyn.filemonitor.listener.config;

import java.util.List;

/**
 * Listener config class
 * 
 * @author allwyn jesu
 *
 */
public class ListenerConfig {
    private String fileLocation;
    private String topic;
    private String http;
    private List<Keyword> keywords;

    public String getFileLocation() {
	return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
	this.fileLocation = fileLocation;
    }

    public String getTopic() {
	return topic;
    }

    public void setTopic(String topic) {
	this.topic = topic;
    }

    public List<Keyword> getKeywords() {
	return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
	this.keywords = keywords;
    }

    public String getHttp() {
	return http;
    }

    public void setHttp(String http) {
	this.http = http;
    }

}
