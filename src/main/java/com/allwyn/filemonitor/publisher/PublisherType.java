package com.allwyn.filemonitor.publisher;

/**
 * Different types of publisher
 * 
 * @author allwyn jesu
 *
 */
public enum PublisherType {

    TOPIC("topic"), REST("rest");

    private String type;

    private PublisherType(String type) {
	this.type = type;
    }

    @Override
    public String toString() {
	return this.type;
    }

}
