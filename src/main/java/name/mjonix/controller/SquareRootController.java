package name.mjonix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import name.mjonix.exception.Exception404;
import name.mjonix.service.SquareRootService;

@CrossOrigin
@RestController

public class SquareRootController extends RuntimeException {

    private static final long serialVersionUID = -4193071171694094491L;

    @Autowired
    private SquareRootService squareRootService;

    @RequestMapping("/{input}")
    private String getSquareRoot(@PathVariable("input") String input) {
        long number = 0;   
        try {
            number = Long.parseLong(input);
        } catch (NumberFormatException e) {
        	throw new Exception404();
        }
        
        return squareRootService.calculateSquareRoot(number);   
    }
}