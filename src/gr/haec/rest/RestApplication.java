package gr.haec.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig {

	public RestApplication() {
		packages("gr.haec.rest");
	}
}
