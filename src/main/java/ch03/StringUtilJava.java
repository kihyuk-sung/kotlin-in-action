package ch03;

import java.util.Collection;

public class StringUtilJava {
    public static <T> String joinToString(
        Collection<T> collection,
        String separator,
        String prefix,
        String postfix
    ) {
        final StringBuilder result = new StringBuilder(prefix);

        int index = 0;
        for (T item : collection) {
            if (index > 0) result.append(separator);

            result.append(item);
            index++;
        }

        result.append(postfix);
        return result.toString();
    }
}
