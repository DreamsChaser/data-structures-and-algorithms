package cn.com.leon.stacksandqueues.stack;

/**
 * 单词逆序
 *
 * @author leon
 */
public class WordsReverse {

    public String doReverse(String word) {
        char[] words = word.toCharArray();
        StringBuffer result = new StringBuffer();
        Stack stack = new Stack(words.length);
        for (char c : words) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
