package com.schedule.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/** 
* @version 创建时间：2017年4月22日 下午9:07:08 
*
*/
public class LogAspect {

	public void logBefore(){
		System.out.println("log before....");
	}
	
	public void logAfter(){
		System.out.println("log after....");
	}
	public Object logArround(ProceedingJoinPoint point){
		System.out.println("arround before...");
		Object o=null;
		try {
			o = point.proceed(point.getArgs());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("arround after...");
		return o;
	}
	
}
