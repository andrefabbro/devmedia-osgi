package br.com.devmedia.osgi.exemplo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import br.com.devmedia.hello.service.HelloService;

public class Activator implements BundleActivator {

    private ServiceReference helloServiceReference;

    @Override
    public void start(BundleContext context) throws Exception {
        helloServiceReference =
            context.getServiceReference(HelloService.class.getName());
        HelloService helloService =
            (HelloService) context.getService(helloServiceReference);
        System.out.println(helloService.sayHello());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye World");
        context.ungetService(helloServiceReference);
    }
}
