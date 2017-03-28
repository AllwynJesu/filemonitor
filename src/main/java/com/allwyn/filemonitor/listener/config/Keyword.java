package com.allwyn.filemonitor.listener.config;

/**
 * POJO class for holding data related to keyword
 * 
 * @author allwyn jesu
 *
 */
public class Keyword {

    private String text;
    private String message;
    private String publisherType;
    private String queue;
    private String pattern;

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public String getQueue() {
	return queue;
    }

    public void setQueue(String queue) {
	this.queue = queue;
    }

    public String getPattern() {
	return pattern;
    }

    public void setPattern(String pattern) {
	this.pattern = pattern;
    }

    public String getPublisherType() {
	return publisherType;
    }

    public void setPublisherType(String publisherType) {
	this.publisherType = publisherType;
    }

}
