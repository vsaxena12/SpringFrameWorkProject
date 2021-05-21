package SpringBootProject.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Create a new RestController in order to :-
public class BookController {
	
	@GetMapping("/books") //Get the books, doing the mapping
	public List<Books> getAllBooks()
	{
		return Arrays.asList(new Books(1,"Varun Saxena","My Book "));
		
	}

}
