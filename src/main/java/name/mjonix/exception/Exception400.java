package name.mjonix.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class Exception400 extends RuntimeException {
	
	private static final long serialVersionUID = 7920315601772358702L;
}