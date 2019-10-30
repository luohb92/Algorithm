/**
 * 独特的电子邮箱地址
 */
package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem929 {
    public static void main(String[] args) {

    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email: emails) {
            int index = email.indexOf('@');
            String local = email.substring(0, index);
            String remote = email.substring(index+1);
            String newLocal="";
            for (char a: local.toCharArray()) {
                if (a == '+' ) {
                    break;
                }
                if (a == '.') {
                   continue;
                }
                newLocal = newLocal + a;

            }
            set.add(newLocal+ "@" + remote);
        }
        return set.size();
    }
}
