package br.com.alessanderleite.api.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.alessanderleite.api.controller.UserResource;

@Component
@ApplicationPath("/boot-jersey")
public class JerseyConfiguration extends ResourceConfig {
	public JerseyConfiguration() {
		register(UserResource.class);
	}
}
