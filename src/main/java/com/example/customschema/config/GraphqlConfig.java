package com.example.customschema.config;

import graphql.scalars.ExtendedScalars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.GraphQlSource;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphqlConfig {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer(){
        return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.Date)
                .scalar(ExtendedScalars.Url);
    }
    @Bean
    public GraphQlSourceBuilderCustomizer customizer(){
        return source -> source.inspectSchemaMappings(report ->
                logger.info(report.toString()));
    }
}
