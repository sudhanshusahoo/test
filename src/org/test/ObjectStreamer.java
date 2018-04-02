package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.SerializationUtils;
public class ObjectStreamer {

	public static void main(String[] args) {
		
		TestObj obj1 = new TestObj("the", "quick", "brown fox", "Jumped", "over a", "lazy dog");
		TestObj obj2 = new TestObj("the", "quick", "brown fox", "Jumped", "over two", "lazy dog");
		TestObj obj3 = new TestObj("the", "quick", "brown fox", "Jumped", "over three", "lazy dog");
		TestObj obj4 = new TestObj("the", "quick", "brown fox", "Jumped", "over four", "lazy dog");
		TestObj obj5 = new TestObj("the", "quick", "brown fox", "Jumped", "over five", "lazy dog");
		
		List<TestObj> objList = new ArrayList<TestObj>() {{
			add(obj1);add(obj2);add(obj3);add(obj4);add(obj5);
		}};
		
		//List<TestObjCopy> copyList = objList.stream().map(e-> new TestObjCopy(e,"charminnar", "kutubminar")).collect(Collectors.toList());
		
		//int count = 0;
		//IntHolder count = new IntHolder(0);
		/*String default5 = "";
		String default6 = "";*/
		
		List<TestObjWrapper> copyList = objList.stream()
				.map(e-> {
					TestObjWrapper copyObj = new TestObjWrapper(SerializationUtils.clone(e), "charminnar", "kutubminar");
					return copyObj;
				}).collect(Collectors.toList());
		
		System.out.println("Testobj");
		
		for (TestObj testObj : objList) {
			System.out.println(testObj);
		}
		
		System.out.println("TestobjCopy");
		
		for (TestObjWrapper testObjCopy : copyList) {
			System.out.println(testObjCopy);
		}

	}

}
