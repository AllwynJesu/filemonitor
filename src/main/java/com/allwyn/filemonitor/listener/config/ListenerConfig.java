package com.allwyn.filemonitor.listener.config;

import java.util.List;

import com.allwyn.filemonitor.publisher.PublisherType;

/**
 * Listener config class
 * 
 * @author allwyn jesu
 *
 */
public class ListenerConfig {
    private String fileLocation;
    private PublisherType defaultPublisherType;
    private String defaultTopicName;
    private String defaultRestEndpoint;
    private List<Keyword> keywords;

    public String getFileLocation() {
	return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
	this.fileLocation = fileLocation;
    }

    public PublisherType getDefaultPublisherType() {
	return defaultPublisherType;
    }

    public void setDefaultPublisherType(PublisherType defaultPublisherType) {
	this.defaultPublisherType = defaultPublisherType;
    }

    public String getDefaultTopicName() {
	return defaultTopicName;
    }

    public void setDefaultTopicName(String defaultTopicName) {
	this.defaultTopicName = defaultTopicName;
    }

    public String getDefaultRestEndpoint() {
	return defaultRestEndpoint;
    }

    public void setDefaultRestEndpoint(String defaultRestEndpoint) {
	this.defaultRestEndpoint = defaultRestEndpoint;
    }

    public List<Keyword> getKeywords() {
	return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
	this.keywords = keywords;
    }

}
