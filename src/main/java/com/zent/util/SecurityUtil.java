package com.zent.util;

import org.mindrot.jbcrypt.BCrypt;

public class SecurityUtil {
	public static String encrypte(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt(10));
	}
	public static Boolean checkPassword(String plainText, String encrypted) {
		return BCrypt.checkpw(plainText, encrypted);
				
	}
	public static void main(String[] args) {
		//System.out.println(SecurityUtil.encrypte("123"));
		System.out.println(SecurityUtil.checkPassword("123", "$2a$20$Ctbjq2/QEQVDud3t8HFda.CmguUdMtQe2UMV/PBS0tDKW.CWEl/Pu"));
	}
}
