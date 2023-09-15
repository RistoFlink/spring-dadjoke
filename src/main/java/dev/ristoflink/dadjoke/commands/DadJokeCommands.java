package dev.ristoflink.dadjoke.commands;

import dev.ristoflink.dadjoke.client.DadJokeClient;
import dev.ristoflink.dadjoke.model.DadJokeResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DadJokeCommands {

    private final DadJokeClient dadJokeClient;

    public DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "random", value = "I tell a random dad joke.")
    public String getRandomDadJoke() {
        DadJokeResponse random = dadJokeClient.random();
        return random.joke();
    }
}
