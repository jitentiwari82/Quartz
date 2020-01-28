package com.rudra.controller;

import com.rudra.controller.dto.ScheduleRequest;
import com.rudra.controller.dto.ScheduleResponse;
import com.rudra.service.SchedulerService;
import org.quartz.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SchedulerController {

	@Autowired
	SchedulerService schedulerService;

//	@SuppressWarnings("unchecked")
//	@RequestMapping(value = "/schedule", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ScheduleResponse schedule(@RequestBody ScheduleRequest details) throws Exception {
//
//		Class<?> jobClass = Class.forName(details.getJobClass());
//		schedulerService.scheduleJob((Class<? extends Job>) jobClass, details.getJobName(), details.getJobGroup(),
//				details.getCronExpression());
//		return new ScheduleResponse("Successfully scheduled " + details.getJobName());
//	}

}
