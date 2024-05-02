package com.Sriram.Rest.Webservices.Restfull_services.Filter;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {
    
	@GetMapping("/filter")
	public MappingJacksonValue listfilter() {
		FilterBean filterbean = new FilterBean("Value1" , "value2" ,"value3");
		MappingJacksonValue mappingjacksonvalue = new MappingJacksonValue(filterbean);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1") ;
		FilterProvider filters = new SimpleFilterProvider().addFilter("beanfilter", filter );
		mappingjacksonvalue.setFilters(filters );
		return mappingjacksonvalue ;
	}
	
}
