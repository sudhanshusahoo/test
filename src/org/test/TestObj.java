package org.test;

import java.io.Serializable;

public class TestObj implements Serializable{
	
	private String key1;
	private String key2;
	private String key3;
	private String key4;
	private String key5;
	private String key6;
	
	public TestObj() {
	}
	
	public TestObj getClone() throws CloneNotSupportedException {
		return (TestObj) this.clone();
	}
	
	public TestObj(String key1, String key2, String key3, String key4, String key5, String key6) {
		this.key1 = key1;
		this.key2 = key2;
		this.key3 = key3;
		this.key4 = key4;
		this.key5 = key5;
		this.key6 = key6;
	}


	public String getKey1() {
		return key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public String getKey2() {
		return key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}
	public String getKey3() {
		return key3;
	}
	public void setKey3(String key3) {
		this.key3 = key3;
	}
	public String getKey4() {
		return key4;
	}
	public void setKey4(String key4) {
		this.key4 = key4;
	}
	public String getKey5() {
		return key5;
	}
	public void setKey5(String key5) {
		this.key5 = key5;
	}
	public String getKey6() {
		return key6;
	}
	public void setKey6(String key6) {
		this.key6 = key6;
	}
	
	public TestObj setDefaults(String defaultVal5, String defaultVal6) {
		this.setKey5(defaultVal5);
		this.setKey6(defaultVal6);
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.getKey1());
		String whiteSpace = " ";
		sb.append(whiteSpace).append(this.getKey2()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey3()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey4()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey5()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey6());
		
		return sb.toString();
	}
	
}
