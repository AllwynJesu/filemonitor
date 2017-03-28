package com.allwyn.filemonitor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;

import com.allwyn.filemonitor.listener.FileListener;
import com.allwyn.filemonitor.listener.config.ListenerConfig;
import com.fasterxml.jackson.dataformat.yaml.snakeyaml.Yaml;

/**
 * Driver class for starting the monitor
 * 
 * @author allwyn jesu
 *
 */
public class Driver {

    public static void main(String args[]) throws IOException {
	if (args.length != 1) {
	    printUsage();
	    System.exit(0);
	}
	ListenerConfig config = getConfig(args[0]);
	TailerListener listener = new FileListener(config);
	Tailer tailer = new Tailer(new File(config.getFileLocation()), listener, 500);
	tailer.run();
    }
    
    private static ListenerConfig getConfig(String configFilePath) throws IOException {
	Yaml yaml = new Yaml();
	ListenerConfig config = null;
	InputStream in = null;
        try {
            in = Files.newInputStream(Paths.get(configFilePath));
            config = yaml.loadAs( in, ListenerConfig.class );
        } finally {
            if (in != null) {
        	in.close();
            }
        }
        return config;
    }
    
    private static void printUsage() {
	System.out.println("Usage:");
	System.out.println("java -jar devtools-logmonitor.jar <config_file_path>");
    }
    
}
