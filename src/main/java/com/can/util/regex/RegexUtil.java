package com.can.util.regex;


import com.can.util.regex.expression.ExpressionEnum;
import com.can.util.validation.AssertUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: LCN
 * @date: 2018-07-03 15:42
 */
public class RegexUtil {

	/**
	 * 正则校验邮箱格式是否正确
	 *
	 * @param eMail
	 * @return
	 */
	public static boolean isEmail(String eMail) {

		AssertUtil.isEmpty(eMail, "邮箱不能为空");

		Pattern pattern =  Pattern.compile(ExpressionEnum.EMAIL.getRegexExpression());

		Matcher matcher = pattern.matcher(eMail);

		if(matcher.matches()) {
			return true;
		}

		return false;
	}


}
