package com.example.jaxrs.Config;

import com.example.jaxrs.controllers.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig config = new ResourceConfig();

        // Enregistrer ton API
        config.register(CompteRestJaxRSAPI.class);

        // ✅ Activer JAXB pour XML
        config.register(org.glassfish.jersey.jaxb.internal.XmlJaxbElementProvider.App.class);
        config.register(org.glassfish.jersey.jaxb.internal.XmlJaxbElementProvider.Text.class);
        config.register(org.glassfish.jersey.jaxb.internal.XmlJaxbElementProvider.General.class);

        return config;
    }
}
