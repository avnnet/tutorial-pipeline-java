package com.example.tutorialjavapipeline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tutorialjavapipeline.controller.HomeController;

@SpringBootTest
public class HomeControllerTest {

  @Autowired
  HomeController homeController;

  @Test
  public void homeController_healtCheck_returnsOk() {
    assertEquals(homeController.healtCheck(), "OK");
  }

  @Test
  void homeController_getPeople_returnsListOfPeople() {
    assertEquals(homeController.getPeople().size(), 20);
  }

}
