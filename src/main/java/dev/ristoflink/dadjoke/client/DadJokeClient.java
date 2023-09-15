package dev.ristoflink.dadjoke.client;

import dev.ristoflink.dadjoke.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {
    //GET https://icanhazdadjoke.com
    @GetExchange("/")
    DadJokeResponse random();
}
