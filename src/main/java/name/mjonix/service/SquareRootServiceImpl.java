package name.mjonix.service;

import org.springframework.stereotype.Service;

import name.mjonix.exception.Exception400;

@Service
public class SquareRootServiceImpl implements SquareRootService {

    public String calculateSquareRoot(long number) {
        if (number < 0) {
            throw new Exception400();
        }
        
        if (number == 0) {
        	return "Square root of 0 is: 0";
        }
        
        double error = .000000001, difference = 1, guess = number, newGuess;
        while (difference > error) {
            newGuess = guess - ((guess * guess - number) / (guess * 2));
            difference = newGuess - guess;
            guess = newGuess;
            if (difference < 0) {
                difference *= -1;
            }
        }
        return "Square root of " + number + " is: " + guess;
    }
}