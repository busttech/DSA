class Solution {
    public boolean wordPattern(String s, String t) {
        String[] arr = t.split(" ");
        if(s.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> mp1 = new HashMap<Character,String>();
        HashMap<String,Boolean> mp2 = new HashMap<String,Boolean>();
        for(int i=0;i<arr.length;i++){
            char ch1 = s.charAt(i);
            String ch2 = arr[i];
            if(mp1.containsKey(ch1)){
                if(!mp1.get(ch1).equals(ch2)){
                    return false;
                }
            }else{
                if(mp2.containsKey(ch2)){
                    return false;
                }else{
                    mp1.put(ch1,ch2);
                    mp2.put(ch2,true);
                }
            }
        }
        return true; 
    }
}
