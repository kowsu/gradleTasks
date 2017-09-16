package com.ram.spring.helper.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ram.spring.util.beans.Service;

@Component
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private static List<Service> services;
	
	static {
		services = new ArrayList<>();
		services = prepareStub();
	}

	@GetMapping(path="/getServices")
	public List<Service> getServiceDetails() {
		return services;
	}
	
	@GetMapping(path="/getService/{sid}")
	public Service getService(@PathVariable("sid")String sid) {
		Service service = getSpecificService(Integer.parseInt(sid));
		return service!=null?service:new Service(Integer.parseInt(sid),"service_not_avaiable","NA", "NO_ACK");
	}
	
	
	public static List<Service> prepareStub() {
		services.add(new Service(121, "getLocation", "REST","ACK"));
		services.add(new Service(122, "getWeather", "SOAP","ACK"));
		services.add(new Service(123, "getPassengersList", "SOAP","ACK"));
		services.add(new Service(124, "getDestination", "REST","ACK"));
		services.add(new Service(125, "getFlightDetails", "SOAP","ACK"));
		return services;
	}
	
	public static Service getSpecificService(int sid) {
		for(Service service : services) {
			if(service.getServiceId() == sid) return service;
		}
		return null;
	}
}
