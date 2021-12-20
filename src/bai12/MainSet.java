package bai12;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Huy");
        stringSet.add("Huy");
        stringSet.add("Hiếu");
        System.out.println(stringSet);
        System.out.println("-----------");

        Set<String> stringSet1 = new HashSet<>();

        String string1 = new String("Huy");
        String string2 = new String("Huy");
        String string3 = new String("Hiếu");
        stringSet1.add(string1);
        stringSet1.add(string2);
        stringSet1.add(string3);
        System.out.println(stringSet1);
        System.out.println("-----------");

        Set<StringBuffer> stringSet2 = new HashSet<>();

        StringBuffer stringBuffer1 = new StringBuffer("Huy");
        StringBuffer stringBuffer2 = new StringBuffer("Huy");
        StringBuffer stringBuffer3 = new StringBuffer("Hiếu");
        stringSet2.add(stringBuffer1);
        stringSet2.add(stringBuffer2);
        stringSet2.add(stringBuffer3);
        System.out.println(stringSet2);
        System.out.println("-----------");

        System.out.println("-----------");
        System.out.println(stringSet.equals(stringSet1));
        System.out.println(stringSet.equals(stringSet2));
        System.out.println(stringSet1.equals(stringSet2));
    }
}
