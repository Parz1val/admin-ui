package com.ocdsoft.bacta;

import com.google.inject.Module;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

/**
 * Created by Kyle on 4/1/2015.
 */

@ApplicationPath("/api/v1")
public final class AdminResourceConfig extends ResourceConfig {

    @Inject
    public AdminResourceConfig(ServiceLocator serviceLocator) {
        packages("com.ocdsoft.bacta");
    }
}
