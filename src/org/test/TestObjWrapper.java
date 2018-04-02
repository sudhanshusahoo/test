package org.test;

import java.util.Objects;

public class TestObjWrapper {
	/*private String key1;
	private String key2;
	private String key3;
	private String key4;
	private String key5;
	private String key6;*/
	
	private TestObj object;
	
	public TestObjWrapper(Object obj, String defaultVal5, String defaultVal6) {
		this.object = (TestObj) obj;
		this.setDefaultVal(defaultVal5, defaultVal6);
		/*TestObj object = (TestObj) obj;
		this.key1 = object.getKey1();
		this.key2 = object.getKey2();
		this.key3 = object.getKey3();
		this.key4 = object.getKey4();
		this.key5 = Objects.nonNull(defaultVal5) ? defaultVal5 : "Hello";
		this.key6 = Objects.nonNull(defaultVal6) ? defaultVal5 : "World";*/
	}
	
	

	private TestObjWrapper setDefaultVal(String defaultVal5, String defaultVal6) {
		this.object.setKey5(Objects.nonNull(defaultVal5) ? defaultVal5 : "Hello");
		this.object.setKey6(Objects.nonNull(defaultVal6) ? defaultVal6 : "World");
		return this;
	}


	public TestObj getObject() {
		return object;
	}






	public void setObject(TestObj object) {
		this.object = object;
	}






	/*public String getKey1() {
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
	}*/
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.object.getKey1());
		String whiteSpace = " ";
		sb.append(whiteSpace).append(this.object.getKey2()).append(whiteSpace);
		sb.append(whiteSpace).append(this.object.getKey3()).append(whiteSpace);
		sb.append(whiteSpace).append(this.object.getKey4()).append(whiteSpace);
		sb.append(whiteSpace).append(this.object.getKey5()).append(whiteSpace);
		sb.append(whiteSpace).append(this.object.getKey6());
		
		
		
		/*StringBuilder sb = new StringBuilder(this.getKey1());
		String whiteSpace = " ";
		sb.append(whiteSpace).append(this.getKey2()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey3()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey4()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey5()).append(whiteSpace);
		sb.append(whiteSpace).append(this.getKey6());*/
		
		return sb.toString();
	}
}
