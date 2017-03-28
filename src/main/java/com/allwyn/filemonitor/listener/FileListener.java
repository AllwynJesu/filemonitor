package com.allwyn.filemonitor.listener;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;

import com.allwyn.filemonitor.listener.config.Keyword;
import com.allwyn.filemonitor.listener.config.ListenerConfig;

/**
 * Implementation of FileListener class
 * 
 * @author allwyn jesu
 *
 */
public class FileListener implements TailerListener{

    private ListenerConfig config;
    
    public FileListener(ListenerConfig config) {
	this.config = config;
    }
    
    public void init(Tailer tailer) {
	// TODO Auto-generated method stub
    }

    public void fileNotFound() {
	// TODO Auto-generated method stub
    }

    public void fileRotated() {
	// TODO Auto-generated method stub
    }

    public void handle(String line) {
	for(Keyword keyword : config.getKeywords()) {
	    if (line.indexOf(keyword.getText()) != -1) {
		System.out.println(keyword.getMessage());
	    }
	}
    }

    public void handle(Exception ex) {
	// TODO Auto-generated method stub
	
    }
    
    public ListenerConfig getConfig() {
	return this.config;
    }
    
}
