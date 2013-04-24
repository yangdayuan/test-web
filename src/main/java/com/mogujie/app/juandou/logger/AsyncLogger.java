package com.mogujie.app.juandou.logger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * @author lvpinglin
 *
 */
public class AsyncLogger {
	
	private BlockingQueue<AbstractLogger> logQueue = new LinkedBlockingQueue<AbstractLogger>();
	
	/**
	 * 添加日志到队列中
	 * @param log
	 */
	public void log(AbstractLogger log) {
		//TODO
	}

}
