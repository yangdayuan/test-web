package com.mogujie.app.juandou.cache;

/**
 * 
 * @author lvpinglin
 *
 */
public class CacheContext {
	
	/**
	 * 刷新本地线程，如果值为true,则不从缓存中取数据，数据取得之后会将新的数据写入缓存
	 */
	public static ThreadLocal<Boolean> refreshFlag = new ThreadLocal<Boolean>();
	
	/**
	 * 只读本地线程，如果值为true,则新的值不会写进缓存
	 */
	public static ThreadLocal<Boolean> onlyReadCache = new ThreadLocal<Boolean>();

}
