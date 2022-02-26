package org.cachescrubber.openapitools.demo.springbootjacksonoptionalnullable.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullable;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoModel2DefaultObjectMapperTest {

  // use standard spring boot configured objectmapper
  @Autowired
  private ObjectMapper objectMapper;

  @Test
  void testSerialize() throws JsonProcessingException, JSONException {
    DemoModel2 demoModel = new DemoModel2();
    demoModel.setName("Name");

    // JsonNullable: do not add property to json
    demoModel.setEmail(JsonNullable.undefined());

    // JsonNullable: explicit: null
    demoModel.setWorkEmail(JsonNullable.of(null));

    // empty optional
    demoModel.setNumberOfUsers(Optional.empty());

    // set the optional to null
    demoModel.setLastLogin(null);

    String json = objectMapper.writerFor(DemoModel2.class).writeValueAsString(demoModel);
    System.out.println(json);
    JSONAssert.assertEquals("""
        {
          "name" : "Name",
          "workEmail" : null
        }""", json, true);
  }

}