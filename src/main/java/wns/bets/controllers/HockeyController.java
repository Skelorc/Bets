package wns.bets.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wns.bets.domain.Hockey;
import wns.bets.repo.HockeyRepo;

import java.util.List;


@CrossOrigin
@RequestMapping("hockey")
@RestController
public class HockeyController {

    @Autowired
    HockeyRepo hockeyRepo;

    @GetMapping
    public List<Hockey> get (@RequestParam String hc_first_win, @RequestParam String hc_draw,
                             @RequestParam String hc_second_win)
    {
        double first_win = Double.parseDouble(hc_first_win);
        double draw = Double.parseDouble(hc_draw);
        double second_win = Double.parseDouble(hc_second_win);

        List<Hockey> hockeysBets = hockeyRepo.findByMainParam(first_win, draw, second_win);
        return hockeysBets;
    }
}
