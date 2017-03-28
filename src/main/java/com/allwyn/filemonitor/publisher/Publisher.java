package com.allwyn.filemonitor.publisher;

/**
 * Publisher interface
 * 
 * @author allwyn jesu
 *
 */
public interface Publisher {
    
    public void publish(String url, String msg) throws Exception;

}
