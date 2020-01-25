

/**
 * Created by Yang on 1/23/20.
 */
import java.util.HashSet;
import java.util.ArrayList;

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++){
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newStringArray = new String[array.length];
        for (int i = array.length-1, j=0; i >= 0; i--, j++){
            newStringArray[j] = array[i];
        }
        return newStringArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] newStringArray = new String[array.length];
        for (int i = array.length-1, j=0; i >= 0; i--, j++){
            newStringArray[j] = array[i];
        }
        for (int i =1; i < array.length; i++){
            if (array[i] != newStringArray[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String s = "";
        HashSet<Character> h = new HashSet<>();
        for (String st: array) {
            s += st;
        }
        for (int i = 0; i < s.length(); i++) {
            if (h.contains(s.charAt(i))) {
                return true;
            } else {
                h.add(s.charAt(i));
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrence = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                occurrence += 1;
            }
        }
        return occurrence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (valueToRemove != array[i]) {
                al.add(array[i]);
            }
        }
        String[] newArr = new String[al.size()];
        al.toArray(newArr);
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> al = new ArrayList<String>();
        al.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                al.add(array[i]);
            }
        }
        String[] stringArray = new String[al.size()];
        al.toArray(stringArray);
        return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add(array[0]);
        int i = 0;
        int j = 0;
        while (i < array.length - 1) {
            if (array[i] == array[i+1]) {
                newArr.set(j, newArr.get(j).concat(array[i+1]));
            } else {
                j++;
                newArr.add(j, array[i+1]);
            }
        }
        String[] st = new String[newArr.size()];
        newArr.toArray(st);
        return st;
    }


}
