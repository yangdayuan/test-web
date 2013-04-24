package com.mogujie.app.juandou.cache;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author lvpinglin
 *
 */
public abstract class Cache {
	
	/**
	 * 
	 * @param localCache
	 * @param key
	 * @param object
	 * @param expire
	 */
	public void put(boolean localCache, String key, Object object, int expire) {
		//TODO
	}
	
	/**
	 * 
	 * @param localCache
	 * @param key
	 * @return
	 */
	public Object get(boolean localCache, String key) {
		//TODO
		return null;
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 * @param expire
	 */
	protected abstract void put(byte[] key, byte[] value, int expire);
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	protected abstract byte[] get(byte[] key);
	
	/**
	 * 
	 * @param key
	 */
	protected abstract void remove(byte[] key);
	
	/**
	 * 对象序列化
	 * @param value
	 * @return
	 */
	protected byte[] value(Object value) {
		try{
			ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
	        ObjectOutputStream objectOut = new ObjectOutputStream(byteArrayOut);
	        objectOut.writeObject(value);
	        byte[] b = byteArrayOut.toByteArray();
	        objectOut.close();
	        byteArrayOut.close();
	        return b;
		}catch(Exception e){
			//TODO
			return null;
		}
	}
	
	/**
	 * 对象反序列化
	 * @param value
	 * @return
	 */
	protected Object object(byte[] value){
		try{
			ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(value);
	        ObjectInputStream objectIn = new ObjectInputStream(byteArrayIn);
	        Object obj = objectIn.readObject();
	        objectIn.close();
	        byteArrayIn.close();
	        return obj;
		}catch(Exception e){
			//TODO
			return null;
		}
	}

}
