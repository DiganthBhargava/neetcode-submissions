class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String,ArrayList<String>> hstr = new Hashtable<>();
        List<List<String>> ret = new ArrayList<>();
        for(String str:strs) {
            String arr = getAsciiArr(str);
            ArrayList<String> l = new ArrayList<>();
            if(hstr.containsKey(arr)) l = hstr.get(arr);
            l.add(str);
            hstr.put(arr,l);
        }
        for(Map.Entry<String,ArrayList<String>> entry: hstr.entrySet()) {
            ret.add(entry.getValue());
        }
        return ret;
    }
    private String getAsciiArr(String str) {
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++) {
            arr[str.charAt(i)-'a']++;
        }
        return Arrays.toString(arr);
    }
}
