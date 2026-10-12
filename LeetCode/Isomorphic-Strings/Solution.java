1
2import java.util.*;
3
4class Solution {
5    public boolean isIsomorphic(String s, String t) {
6        if (s.length() != t.length()) {
7            return false;
8        }
9
10        Map<Character, Character> map1 = new HashMap<>();
11        Map<Character, Character> map2 = new HashMap<>();
12
13        for (int i = 0; i < s.length(); i++) {
14            char c1 = s.charAt(i);
15            char c2 = t.charAt(i);
16
17            if (map1.containsKey(c1) && map1.get(c1) != c2) {
18                return false;
19            }
20
21            if (map2.containsKey(c2) && map2.get(c2) != c1) {
22                return false;
23            }
24
25            map1.put(c1, c2);
26            map2.put(c2, c1);
27        }
28
29        return true;
30    }
31}
32