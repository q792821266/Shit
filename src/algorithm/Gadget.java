package algorithm;

/**
 * ??????????????
 * 
 * @author notJerry
 */
public class Gadget {
	// ???????2????
	public static boolean judgePowerOf2(long n) {
		return (n & n - 1) == 0;
	}

	// ???????? exp: i am Jerry -> Jerry am i;
	public static String reverseString(String s, int left, int right) {
		if (left < 0 || right > s.length() || left > right) {
			System.out.println("???????????~");
			return "err";
		}
		// ???????????????????????
		class a {
			private char[] exchange(String s, int start, int end) {
				char[] s_char = s.toCharArray();
				while(start<end){
					char temp = s_char[start];
					s_char[start++] = s_char[end];
					s_char[end--] = temp;
				}
				return s_char;
			}
		}
		
		char[] a = new a().exchange(s, 0, s.length());
		int start = 0, end = 0;
		if (a[end] != ' ' && end <= right) {
			end++;
		}
		return s;

	}

}
