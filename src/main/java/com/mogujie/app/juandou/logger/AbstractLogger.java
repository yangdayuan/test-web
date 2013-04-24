package com.mogujie.app.juandou.logger;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * @author lvpinglin
 *
 */
public abstract class AbstractLogger implements Serializable {
	
	private static final long serialVersionUID = -2889654419406232139L;
	private long count;
	private Date time;
	
	/**
	 * 保存日志
	 * @param logger
	 */
	protected abstract void write(AbstractLogger logger);
	
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
