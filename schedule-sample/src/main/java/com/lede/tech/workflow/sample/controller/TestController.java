package com.lede.tech.workflow.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
	
	private final Log LOG = LogFactory.getLog(getClass());
	//@Resource
	//JedisProxy proxy;

	/***
	 * 开始游戏
	 * @param request
	 * @param response
	 */

	@RequestMapping(value = "/test.html")
	@ResponseBody
	public String startPokerGame(HttpServletRequest request, HttpServletResponse response)
	{
		LOG.info("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "test ok!";
	}

	@RequestMapping(value = "/testRedis.html")
	@ResponseBody
	public String testRedis(HttpServletRequest request, HttpServletResponse response, String key, String value)
	{
		LOG.info("get testRedis ,key:" + key + ",value:" + value);
		try
		{
			//proxy.set(key, value);
		}
		catch (Exception e)
		{
			LOG.error("exception during testRedis", e);
		}
		return "100";
	}

	@RequestMapping(value = "/getRedis.html")
	@ResponseBody
	public String testgetRedis(HttpServletRequest request, HttpServletResponse response, String key)
	{
		LOG.info("get testgetRedis ,key:" + key);
		String value;
		try
		{
			value = null;//(String) proxy.get(key);
			LOG.info("get testgetRedis ,key:" + key + ",value:" + value);
		}
		catch (Exception e)
		{
			LOG.error("exception during testgetRedis", e);
			value = "exception";
		}
		return value;
	}
}
