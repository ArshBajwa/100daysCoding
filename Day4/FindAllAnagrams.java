class Solution {
    public static List<Integer> anagram(String s, String p,List<Integer>l) {
       int i = 0;
       int j = 0;
       int ans = 0;
       int n = s.length();
       int k = p.length();
       Map<Character, Integer> h = new HashMap<>();
       for (char e : p.toCharArray()) {
           h.put(e, h.getOrDefault(e, 0) + 1);
       }
       int cnt = h.size();
       while (j < n) {
           if (h.containsKey(s.charAt(j))) {
               h.put(s.charAt(j), h.get(s.charAt(j)) - 1);
               if (h.get(s.charAt(j)) == 0) {
                   cnt--;
               }
           }
           if (j - i + 1 < k) {
               j++;
           } else if (j - i + 1 == k) {
               if (cnt == 0) {
                   l.add(i);
               }
               if (h.containsKey(s.charAt(i))) {
                   h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
                   if (h.get(s.charAt(i)) == 1) {
                       cnt++;
                   }
               }
               i++;
           j++;
       }
   }
       return l;
   }
   public List<Integer> findAnagrams(String s, String p) {
       List<Integer>l=new ArrayList<>();
       return anagram(s,p,l);
       
       
   }
}