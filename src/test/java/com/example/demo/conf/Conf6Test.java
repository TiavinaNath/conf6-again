package com.example.demo.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class Conf6Test extends FacadeIT {
  @Value("${api.key}")
  private String apiKey;

  @Value("${another.key}")
  private String anotherKey;

  @Value("${test.key}")
  private String testKey;

  @Test
  void is_api_key_ok() {
    var trueSecret = "dummy";
    assertEquals(trueSecret, apiKey);
  }

  @Test
  void is_api_key_ko() {
    var trueSecret = "dummyTsyMarina";
    assertNotEquals(trueSecret, apiKey);
  }

  @Test
  void is_another_key_ok() {
    var trueSecret = "anotherDummy";
    assertEquals(trueSecret, anotherKey);
  }

  @Test
  void is_another_key_ko() {
    var trueSecret = "AAA";
    assertNotEquals(trueSecret, anotherKey);
  }

  @Test
  void is_test_key_ok() {
    var trueSecret = "test123456789";
    assertEquals(trueSecret, testKey);
  }

  @Test
  void is_test_key_ko() {
    var trueSecret = "123456789";
    assertNotEquals(trueSecret, testKey);
  }
}
