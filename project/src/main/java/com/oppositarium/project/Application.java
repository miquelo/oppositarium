package com.oppositarium.project;

import static java.lang.String.format;
import static picocli.CommandLine.usage;

import java.io.File;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
    name="oppositarium-project",
    mixinStandardHelpOptions = true,
    version = "1.0"
)
public class Application implements Runnable {
    
    public Application() {
    }
    
    @Override
    public void run() {
        usage(Application.class, System.err);
    }
    
    @Command(
        description="Emerge a platform."
    )
    public void emerge(
        @Parameters(
            paramLabel="platform-descriptor",
            description="Descriptor path of the platform to be emerged."
            
        )
        File platformDescriptorFile) {
    }
    
    public static void main(String[] args) {
        new CommandLine(Application.class)
            .execute(args);
    }
}
