package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
	@Test
	public void returnfreq() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myhashmap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myhashmap.get(word);
			if (value == null)
				value = 1;
			else {
				value = value + 1;
			}
			myhashmap.add(word, value);

		}
		int freq = myhashmap.get("to");
		System.out.println(myhashmap);
		Assert.assertEquals(2, freq);
	}

}

