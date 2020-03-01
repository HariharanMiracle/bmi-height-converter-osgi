//Regostration of service
package bmi_height_converter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		//start function
		System.out.println("BMI_Height_Converter => Start");
		HeightService heightService = new HeightServiceImpl();
		publishServiceRegistration = context.registerService(HeightService.class.getName(), heightService, null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("BMI_Height_Converter => Stop");
		publishServiceRegistration.unregister();
	}

}
