package hiwotab.bookdatabase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public @ResponseBody String displayWel(){
        return "Welcome to the Book Database!";
    }
    @PostMapping("/findbooksbycate")
    public @ResponseBody String findBooksByCat(){
        return "Select Book Category";

    }
    @PostMapping("/findbooksbyaut")
    public @ResponseBody String findBooksByAuthor(){
        return "Select Book Author";

    }
    @PostMapping("/findbooksbysku")
    public @ResponseBody String findBooksBySku(){
        return "Select Book SKU";

    }
    @GetMapping("/addbook")
    public @ResponseBody String addBook(){
        return "This is were to add books";

    }
    @GetMapping("/deletebook")
    public @ResponseBody String deleteBook(){
        return "This is were to delete books";

    }

    @GetMapping("/showallbook")
    public @ResponseBody String showBook(){
        return "This is a list of all books";

    }


}
