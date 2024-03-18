package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.HomePageItemDTO;
import service.HomePageService;

import java.util.List;

@RestController
@RequestMapping("/homepage")
public class HomePageController {

    private final HomePageService homePageService;

    @Autowired
    public HomePageController(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @GetMapping
    public ResponseEntity<List<HomePageItemDTO>> getHomePageData() {
        List<HomePageItemDTO> homepageData = homePageService.getHomePageData();
        return new ResponseEntity<>(homepageData, HttpStatus.OK);
    }
}

