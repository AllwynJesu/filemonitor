package com.allwyn.filemonitor.listener.config;

import com.allwyn.filemonitor.publisher.PublisherType;

/**
 * POJO class for holding data related to keyword
 * 
 * @author allwyn jesu
 *
 */
public class Keyword {

    private String text;
    private String message;
    private PublisherType publisherType;
    private String topicName;
    private String restEndPoint;
    private String pattern;

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public PublisherType getPublisherType() {
	return publisherType;
    }

    public void setPublisherType(PublisherType publisherType) {
	this.publisherType = publisherType;
    }

    public String getTopicName() {
	return topicName;
    }

    public void setTopicName(String topicName) {
	this.topicName = topicName;
    }

    public String getRestEndPoint() {
	return restEndPoint;
    }

    public void setRestEndPoint(String restEndPoint) {
	this.restEndPoint = restEndPoint;
    }

    public String getPattern() {
	return pattern;
    }

    public void setPattern(String pattern) {
	this.pattern = pattern;
    }

}
