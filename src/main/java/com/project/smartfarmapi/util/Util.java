package com.project.smartfarmapi.util;

public class Util {
	public static boolean isNotNull(Object obj) {
		return obj != null;
	}

	public static boolean isNotNull(String str) {
		return str != "";
	}

	public static boolean isNotNull(int num) {
		return num != 0;
	}

	public static boolean isNull(Object obj) {
		return obj == null;
	}

	public static boolean isNull(String str) {
		return str == "";
	}

	public static boolean isNull(int num) {
		return num == 0;
	}
}