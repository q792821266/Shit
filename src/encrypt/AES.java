package encrypt;

import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.*;

public class AES {
	// 用戶密鑰
	private static byte[] keyValue = new byte[] { 22, 25, -35, -45, 25, 98,
			-55, -45, 10, 35, -45, 25, 26, -95, 25, -65, -78, -99, 85, 45, -62,
			10, -0, 11, -35, 48, -98, 65, -32, 14, -78, 25, 36, -56, -45, -45,
			12, 15, -35, -75, 15, -14, 62, -25, 33, -45, 55, 68, -88 };
	// 算法參數
	private static byte[] iv = new byte[] { -12, 35, -25, 65, 45, -87, 95, -22,
			-15, 45, 55, -66, 32, 5 - 4, 84, 55 };
	// 加密密钥
	private static SecretKey key;
	// 算法参数
	private static AlgorithmParameterSpec paramSpec;
	// 加密算法
	private static Cipher ecipher;
	
	static{
		KeyGenerator kgen;
		try {
			kgen = KeyGenerator.getInstance("AES");
		} catch (Exception e) {

		}
	}
}
