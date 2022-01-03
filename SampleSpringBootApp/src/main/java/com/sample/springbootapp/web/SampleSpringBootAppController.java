package com.sample.springbootapp.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class SampleSpringBootAppController {

    @GetMapping("ping")
    public ResponseEntity<String> ping() {
        String toRet = "Sample SpringBootApp Service Pinging at ";
        return new ResponseEntity<>(toRet + System.currentTimeMillis(), HttpStatus.OK);
    }

}
