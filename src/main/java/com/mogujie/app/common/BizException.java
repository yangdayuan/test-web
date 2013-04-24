/**
 * 
 */
package com.mogujie.app.common;

/**
 * @author yuexuqiang
 *
 */
public class BizException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public BizException() {
		super();
	}
	
	public BizException(String msg, Throwable t) {
		super(msg, t);
	}
}
