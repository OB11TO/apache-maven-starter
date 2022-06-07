package com.ob11to.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    @Parameter(defaultValue = "Hello OB11TO 2", property = "hello.massage")
    private String massage;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(massage);
    }
}
