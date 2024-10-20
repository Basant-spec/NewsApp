package NewsApp.example.NewsApp.Service;

import NewsApp.example.NewsApp.Configuration.RestTemplateConfig;
import NewsApp.example.NewsApp.ResponseBody.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    @Autowired
    RestTemplate restTemplate;

    String base="https://newsapi.org/v2/top-headlines";

    public NewsResponse getNewsBySource(String source, String apiKey) {
      String url=prepareUrl(source,apiKey);

      return restTemplate.getForObject(url, NewsResponse.class);


    }

    private String prepareUrl(String source, String apiKey) {

        return base+"?sources="+source+"&apiKey="+apiKey;


    }




}
