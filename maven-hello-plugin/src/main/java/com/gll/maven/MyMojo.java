package com.gll.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Goal which touches a timestamp file.
 *
 * @goal touch
 * @phase process-sources
 */
public class MyMojo extends AbstractMojo {

    /**
     * @parameter default-value="Somebody" expression="${username}
     */
    private String userName;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello World!" + userName);
    }
}
