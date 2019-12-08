package com.oppositarium.project;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name="oppositarium-project",
    mixinStandardHelpOptions = true
)
public class Application
{
    public Application()
    {
    }
    
    @Command
    public void deploy()
    {
        System.out.println("deploy");
    }
    
    public static void main(String[] args)
    {
        new CommandLine(Application.class).execute(args);
    }
}
