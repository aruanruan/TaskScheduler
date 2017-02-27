package com.lede.tech.workflow.sample;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lede.tech.workflow.core.engine.Engine;
import com.lede.tech.workflow.core.engine.bean.ProcessTemplate;

@Service
public class Sample
{
	@Autowired
	ProcessTemplate sampleTemplate3;
	
	@PostConstruct
	private void init()
	{
		Engine.start();
		Engine.removeFinishedInstance();
		Engine.initInstance(sampleTemplate3);
	}
}
