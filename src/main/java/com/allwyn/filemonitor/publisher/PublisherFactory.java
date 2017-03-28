package com.allwyn.filemonitor.publisher;

/**
 * Publisher Factory
 * 
 * @author allwyn jesu
 *
 */
public class PublisherFactory {

    public Publisher getPublisher(Publisher publisherType) {
	Publisher publisher = null;
	if (PublisherType.TOPIC.equals(publisherType)) {
	    
	} else if (PublisherType.HTTP.equals(publisherType)) {
	    //TODO : Complete construction of http publisher
	}
	return publisher;
    }
    
}
