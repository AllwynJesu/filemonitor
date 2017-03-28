package com.allwyn.filemonitor.publisher.impl;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import com.allwyn.filemonitor.publisher.Publisher;

/**
 * 
 * @author allwyn jesu
 *
 */
public class TopicPublisher implements Publisher{

    private ConnectionFactory factory;
    private Connection connection;
    private Session session;
    private MessageProducer producer;
    private static final TopicPublisher INSTANCE = new TopicPublisher();

    private TopicPublisher() {
	this.factory = null;
	try {
	    this.connection = this.factory.createConnection();
	    this.connection.start();
	    this.session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	} catch (JMSException ex) {

	}

    }

    public static Publisher getInstance() {
	return INSTANCE;
    }
    
    @Override
    public void publish(String topic, String msg) throws Exception {
	Message message = session.createTextMessage("msg");
	Destination destination = session.createTopic(topic);
	producer.send(destination, message);
    }

    

}
