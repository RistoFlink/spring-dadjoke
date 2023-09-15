package dev.ristoflink.dadjoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommands {

    @ShellMethod(key = "hello", value = "I will say hello.")
    public String hello(@ShellOption(defaultValue = "World") String arg) {
        return "hello, " + arg + "!";
    }

    @ShellMethod(key = "goodbye", value = "I will say goodbye.")
    public String goodbye() {
        return "goodbye";
    }
}
