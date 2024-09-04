package com.hackerrank.api.controller;

import com.hackerrank.api.model.Covid;
import com.hackerrank.api.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/covid")
public class CovidController {
  private final CovidService covidService;
  

  @Autowired
  public CovidController(CovidService covidService) {
    this.covidService = covidService;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Covid> getAllCovid() {
    return covidService.getAllCovid();
  }
  @GetMapping("/covid/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Covid> getCovidById(@PathVariable("id")Long id) {
      Covid covidData =  covidService.getCovidById(id);
    if (covidData != null) {
        return ResponseEntity.ok(covidData);
    } else {
        return ResponseEntity.notFound().build();
    }
  }
  @GetMapping("/covid/top5?by={by}")
  public ResponseEntity<List<Covid>> getTop5CovidData(@RequestParam String by) {
      List<Covid> top5CovidData = covidService.top5By(by);
      if (top5CovidData != null) {
          return ResponseEntity.ok(top5CovidData);
      } else {
          return ResponseEntity.badRequest().build();
      }
      //return ResponseEntity.ok(top5CovidData);
  }
  

  @GetMapping("/total")
  public ResponseEntity<Integer> getTotalByAttribute(@RequestParam String by) {
      Integer total = covidService.totalBy(by);
      if (total != null) {
          return ResponseEntity.ok(total);
      } else {
          return ResponseEntity.badRequest().build();
      }
      //return ResponseEntity.ok(total);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Covid createCovid(@RequestBody Covid covid) {
    return covidService.createNewCovid(covid);
  }
}
