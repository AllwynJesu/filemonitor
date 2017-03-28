package com.allwyn.filemonitor.publisher;

/**
 * Different types of publisher
 * 
 * @author allwyn jesu
 *
 */
public enum PublisherType {

    TOPIC("topic"), HTTP("http");

    private String type;

    private PublisherType(String type) {
	this.type = type;
    }

    public PublisherType getType(String type) {
	PublisherType pubType;
	switch (type) {
	case "topic":
	    pubType = PublisherType.TOPIC;
	    break;
	case "http":
	    pubType = PublisherType.HTTP;
	    break;
	default:
	    pubType = PublisherType.TOPIC;
	    break;
	}
	return pubType;
    }

    public String toString() {
	return this.type;
    }

}
