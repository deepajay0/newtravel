package com.travel.controller;

import com.travel.models.State;
import com.travel.models.TravelType;
import com.travel.repository.RegionRepo;
import com.travel.repository.StateRepo;
import com.travel.repository.TravelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.travel.models.REGION;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class TravelController {
    @Autowired
    private RegionRepo regionRepo;
    @Autowired
    private StateRepo stateRepo;
    @Autowired
    private TravelRepo travelRepo;
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @PostMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/suggest")
    public String suggest(){
        return "suggestion";
    }


    @GetMapping("/getRegion")
    public ResponseEntity<?> getRegion(){
        System.out.println("api called");
        List<REGION> all = this.regionRepo.findAll();
        System.out.println(all);
        return ResponseEntity.ok(this.regionRepo.findAll());
    }

    @PostMapping("/getState")
    public ResponseEntity<?> getState(@RequestParam String region){
        System.out.println("api called "+region);
        List<State> all = this.stateRepo.findAll();
        System.out.println(all);
        return ResponseEntity.ok(this.stateRepo.findAll());
    }
    @GetMapping("/getTouristType")
    public ResponseEntity<?> getTourist(){
        System.out.println("tourist api called");
        List<TravelType> all = this.travelRepo.findAll();
        System.out.println(all);
        return ResponseEntity.ok(this.travelRepo.findAll());
    }
}
