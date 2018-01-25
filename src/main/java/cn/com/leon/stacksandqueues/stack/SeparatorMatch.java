package cn.com.leon.stacksandqueues.stack;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 分隔符匹配
 * 例 a{e()f}b 成功 a{c{]}}b 错误
 *
 * @author leon
 */
public class SeparatorMatch {

    public void match(String str) {
        Stack stack = new Stack(str.length());
        char[] chars = str.toCharArray();
        //遍历字符串
        for (char c : chars) {
            //将左括号压入堆栈
            if ('{' == (c) || '(' == (c) || '[' == (c)) {
                stack.push(c);
            }
            //遇到 右括号则出栈并匹配是否一致
            if ('}' == (c) || ')' == (c) || ']' == (c)) {
                if (stack.isEmpty()) {
                    System.out.println("nothing match " + c);
                } else {
                    Object stackPop = stack.pop();
                    if ((Character) stackPop == '{' && c == '}'
                            || (Character) stackPop == '[' && c == ']'
                            || (Character) stackPop == '(' && c == ')') {
                        continue;
                    } else {
                        System.out.println("error match at" + c);
                        break;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("nothing match " + Arrays.toString(stack.getStackValue()));
        }
    }
}
