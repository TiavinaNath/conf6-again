package com.example.demo.conf;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class Conf6Test extends FacadeIT {
  @Value("${api.key}")
  private String apiKey;

  @Test
  void is_api_key_true() {
    var trueSecret = "dummy";
    assertEquals(trueSecret, apiKey);
  }
}
