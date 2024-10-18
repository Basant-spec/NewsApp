package NewsApp.example.NewsApp.Controller;

import NewsApp.example.NewsApp.ResponseBody.NewsResponse;
import NewsApp.example.NewsApp.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/v1/news")
public class NewsController {
    @Autowired
    NewsService newsService;
    @GetMapping
    public NewsResponse getNewsBySource(@RequestParam("source") String source, @RequestParam("apiKey") String apiKey){

       return  newsService.getNewsBySource(source,apiKey);


    }






}
