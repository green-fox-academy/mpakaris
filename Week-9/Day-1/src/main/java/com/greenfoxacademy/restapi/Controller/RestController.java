package com.greenfoxacademy.restapi.Controller;

import com.greenfoxacademy.restapi.Errors.*;
import com.greenfoxacademy.restapi.Errors.Error;
import com.greenfoxacademy.restapi.Models.*;
import com.greenfoxacademy.restapi.Services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    LogService logService;

    @GetMapping ("/doubling")
    public ResponseEntity doubleNumber(@RequestParam (required = false) Integer input) {
        if (input != null) {
            logService.createNewLog("/doubling", "value=" + input);
            Doubling doubling = new Doubling(input);
            int result = logService.doubling(input);
            doubling.setResult(result);
            return ResponseEntity.ok().body(doubling);
        } else {
            return ResponseEntity.ok().body(new Error("Please provide an input!"));
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greet(@RequestParam (required = false) String name,
                                @RequestParam (required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.badRequest().body(new TitleAndNameMissingError());
        } else if (name == null) {
           return ResponseEntity.badRequest().body(new NameMissingError());
       } else if (title == null) {
           return ResponseEntity.badRequest().body(new TitleMissingError());
       } else {
           logService.createNewLog("/greeter", "?name=" + name + "&title=" + title);
           return ResponseEntity.ok().body(new Greeter(name, title));
       }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable (required = false) String appendable) {
        if (appendable == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            logService.createNewLog("/appenda", "appendable=" + appendable);
            return ResponseEntity.ok().body(new Appenda(appendable));
        }
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity doUntil(@RequestBody Limit limit,
                                  @PathVariable String operation) {
       if (operation.equals("sum")) {
           logService.createNewLog("/dountil/sum", "until=" + limit.getUntil());
            return ResponseEntity.ok().body(new DoUntilSum(limit.getUntil()));

        } else if (operation.equals("factor")) {
           logService.createNewLog("/dountil/factor", "until=" + limit.getUntil());
            return ResponseEntity.ok().body(new DoItUntilFactor(limit.getUntil()));

        } else {
            return new ResponseEntity<>(new DoUntilError(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity arrays(@RequestBody ArrayHandler array) {
        if (array.getWhat().equals("sum")) {
            logService.createNewLog("/arrays/" + array.getWhat(), array.getNumbers().toString());
            return ResponseEntity.ok().body(new ArrayHandlerSum(array.getNumbers()));
        } else if (array.getWhat().equals("multiply")) {
            logService.createNewLog("/arrays/" + array.getWhat(), array.getNumbers().toString());
            return ResponseEntity.ok().body(new ArrayHandlerMult(array.getNumbers()));
        } else if (array.getWhat().equals("double")) {
            logService.createNewLog("/arrays/" + array.getWhat(), array.getNumbers().toString());
            return ResponseEntity.ok().body(new ArrayHandlerDouble(array.getNumbers()));
        } else {
            return ResponseEntity.ok().body(new ArrayError());
        }
    }

    @GetMapping("/log")
    public ResponseEntity getAllLogs() {
        return ResponseEntity.ok().body(logService.getAllLogs());
    }

    @PostMapping("/sith")
    public ResponseEntity reverseSentence(@RequestBody String sentence) {
        return ResponseEntity.ok().body(logService.reverseSentence(sentence));
    }

    @GetMapping("/log/top10")
    public ResponseEntity getTop10() {
        return ResponseEntity.ok().body(logService.fetchTop10());
    }

    @GetMapping("/log/pagination")
    public ResponseEntity getLogsByParameters (@RequestParam (required = false) String count,
                                               @RequestParam (required = false) String page,
                                               @RequestParam (required = false) String search) {
        if (search != null) {
            return ResponseEntity.ok().body(logService.findLogsByKeyWord(search));
        } else {
            return ResponseEntity.ok().body(logService.findLogsByParameters(count, page));
        }
    }

    @GetMapping("/nativeSQL/fetch10")
    public ResponseEntity get10Native() {
        return ResponseEntity.ok().body(logService.fetch10NativeSQL());
    }

    @GetMapping("/nativeSQL/pagination")
    public ResponseEntity getLogsByParametersNative (@RequestParam (required = false) String count,
                                                     @RequestParam (required = false) String page,
                                                     @RequestParam (required = false) String search) {
        if (search != null) {
            return ResponseEntity.ok().body(logService.findLogsByKeyWordNative(search));
        } else {
            return ResponseEntity.ok().body(logService.findLogsByParametersNative(count, page));
        }
    }
}