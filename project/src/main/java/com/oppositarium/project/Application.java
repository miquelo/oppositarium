package com.oppositarium.project;

import static picocli.CommandLine.usage;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name="oppositarium-project",
    mixinStandardHelpOptions = true,
    version = "1.0"
)
public class Application
implements Runnable
{
    public Application()
    {
    }
    
    @Override
    public void run()
    {
        usage(Application.class, System.err);
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
