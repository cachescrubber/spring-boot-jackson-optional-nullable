package org.cachescrubber.openapitools.demo.springbootjacksonoptionalnullable;

import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for the Json Nullable Library.
 *
 * @author cachescrubber, 2022-02-26
 * @since 0.1.0
 */
@Configuration
public class JsonNullableConfiguration {

  @Bean
  JsonNullableModule jsonNullableModule() {
    return new JsonNullableModule();
  }
}
