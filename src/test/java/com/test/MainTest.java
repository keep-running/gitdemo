package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class MainTest {

	@Test
	public void dateTest() {
		Locale locale = Locale.FRANCE;
		System.out.println(JSON.toJSONString(locale));
		Date date = new Date();
		String now = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(date);
		System.out.println(now);

		try {
			date = DateFormat.getDateInstance(DateFormat.DEFAULT, locale).parse("16 nov. 01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
	}
}
