package com.can.util.random;

import java.util.Random;

/**
 * @description: 随机数
 *
 * @author: LCN
 * @date: 2018-07-05 18:38
 */
public class RandomUtil {

	/**
	 * 随机生成数字或数字字母的
	 *
	 * @param length 长度
	 * @return
	 */
	public static String generateNumStr(int length) {

		String str = "";
		Random random = new Random();

		for(int i = 0 ; i < length ; i++){
			int type = random.nextInt(3);
			switch (type) {
				case 0 :
						// 生成随机小写字母
						char c1 = (char)(random.nextInt(26) + 'a');
						str += c1;
					break;

				case 1 :
						// 生成随机大写字母
						char c2 = (char)(random.nextInt(26) + 'A');
						str += c2;
					break;

				case 2 :
						// 生成随机数字
						str += random.nextInt(10);
					break;
				default:
					break;
			}
		}

		return str;
	}


}
