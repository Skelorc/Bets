package wns.bets.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wns.bets.domain.Football;
import wns.bets.repo.FootballRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("test")
public class TestController {

    int idStart = 1;
    int idEnd = 799413;
    List<Football> list;

    @Autowired
    FootballRepo footballRepo;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public List<Football> testPost(@RequestBody String text)
    {
        list = new ArrayList<>();
        int number = Integer.parseInt(text);
        Random random = new Random();
        if(number < idEnd) {
            int randStart = idStart + random.nextInt(idEnd - idStart - 1);
            int randEnd = randStart + number;
            System.out.println(randStart);
            System.out.println(randEnd);
            list = footballRepo.findAllByIdBetween(randStart,randEnd);
            return list;
          // System.out.println(rand);
           /* for (int i = 0; i <= number - 1; i++) {
                Football bet = footballRepo.findAllById(rand);
                list.add(bet);
                rand++;*/

               //System.out.println(rand);
            }


        return null;
    }
}
