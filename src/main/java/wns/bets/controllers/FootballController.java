package wns.bets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wns.bets.domain.Football;
import wns.bets.repo.FootballRepo;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


    @CrossOrigin
    @RequestMapping("main")
    @RestController
    public class FootballController {


    @Autowired
    FootballRepo footballRepo;


    @GetMapping
    public List<Football> create(@RequestParam String fb_first_win_open, String fb_draw_open, String fb_second_win_open,
                                 String fb_first_win_close, String fb_draw_close,
                                 String fb_second_win_close,
                                 String fb_tb_large, String fb_tb_small, String name_base)
    {
        if(!(fb_first_win_open).equals("")&&!(fb_second_win_open).equals("")&&!(fb_draw_open).equals(""))
        {
            double first_win_open = Double.parseDouble(fb_first_win_open);
            double draw_open = Double.parseDouble(fb_draw_open);
            double second_win_open = Double.parseDouble(fb_second_win_open);
            if (!(fb_first_win_close).equals("") && !(fb_second_win_close).equals("") && !(fb_draw_close).equals(""))
            {
                double fist_win_close = Double.parseDouble(fb_first_win_close);
                double draw_close = Double.parseDouble(fb_draw_close);
                double second_win_close = Double.parseDouble(fb_second_win_close);
                if (!(fb_tb_large).equals("") && !(fb_tb_small).equals(""))
                {
                    double tb_large = Double.parseDouble(fb_tb_large);
                    double tb_small = Double.parseDouble(fb_tb_small);
                    return footballRepo.findByAllPAram(first_win_open, draw_open, second_win_open, fist_win_close,
                            draw_close, second_win_close, tb_large, tb_small,name_base);

                }
                else
                {
                    return footballRepo.findByMainAndSecondParam(first_win_open, draw_open, second_win_open, fist_win_close,
                            draw_close, second_win_close,name_base);


                }
            }
            else
            {
                if (!(fb_tb_large).equals("") && !(fb_tb_small).equals(""))
                {
                    double tb_large = Double.parseDouble(fb_tb_large);
                    double tb_small = Double.parseDouble(fb_tb_small);
                    return footballRepo.findByMainParamAndtb(first_win_open,draw_open,second_win_open,tb_large,tb_small,name_base);

                }
            }
            return footballRepo.findAllByMainParam(first_win_open,draw_open, second_win_open,name_base);
        }
        else
        {
            if (!(fb_first_win_close).equals("") && !(fb_second_win_close).equals("") && !(fb_draw_close).equals(""))
            {
                double fist_win_close = Double.parseDouble(fb_first_win_close);
                double draw_close = Double.parseDouble(fb_draw_close);
                double second_win_close = Double.parseDouble(fb_second_win_close);
                return footballRepo.findBySecondParam(fist_win_close,draw_close,second_win_close,name_base);

            }
        }

            return null;
    }


    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id)
    {
        System.out.println(id);
        return getBet(id);
    }

    private Map<String, String> getBet(@PathVariable String id) {
        /*return bets.stream()
               *//* .filter(bets -> bets.get("id").equals(id))*//*
                .findFirst()
                .orElseThrow(NotFoundException::new);*/
        return null;
    }

    @PostMapping
    public String create(@RequestParam String obj)
    {
        System.out.println(obj);
        return "Hello";
    }


    @PutMapping("{id}")
    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> bet)
    {
        Map<String, String> betFromDB = getBet(id);

        betFromDB.putAll(bet);
        betFromDB.put("id", id);

        return betFromDB;
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable String id)
    {
        Map<String, String> bet = getBet(id);
       /* bets.remove(bet);*/
    }

}
