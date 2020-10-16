package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTestPara {
	@Test
	public void TestParaInHashMap() {
		String sen = "Paranoids are not paranoid beacuse they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations ";

		MyHashMapPara<String, Integer> mylistpara = new MyHashMapPara<>();
		String[] words = sen.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = mylistpara.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			mylistpara.add(word, value);
		}
		System.out.println(mylistpara);
		int freq = mylistpara.get("paranoid");
		mylistpara.remove("are");
		System.out.println(mylistpara);
		Assert.assertEquals(3, freq);

	}
}
