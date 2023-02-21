package com.athomas5;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardApiApplication extends Application<DropwizardApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardApiApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardApi";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardApiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardApiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
