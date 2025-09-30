package com.example.demo.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class Conf6Test extends FacadeIT {
  @Value("${api.key}")
  private String apiKey;

  @Test
  void is_api_key_ok() {
    var trueSecret = "dummy";
    assertEquals(trueSecret, apiKey);
  }

  @Test
  void is_api_key_ko() {
    var trueSecret = "dummy";
    assertNotEquals(trueSecret, apiKey);
  }
}
