package com.mogujie.app.juandou.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

/**
 * 
 * @author lvpinglin
 *
 */
public class CacheAspect {
	
	/**
	 * 
	 * @param pjpParam
	 * @return
	 * @throws Throwable
	 */
	@Around("@annotation(com.mogujie.app.juandou.annotation.CacheData)")
	public Object doCache(ProceedingJoinPoint pjpParam) throws Throwable{
		return null;
	}

}
