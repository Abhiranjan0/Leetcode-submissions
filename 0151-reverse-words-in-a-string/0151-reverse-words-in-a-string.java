class Solution {
    public String reverseWords(String s) {
        String str = "";
        String[] ar = s.split(" ");
        for(int i=0; i<ar.length; i++){
            if(ar[i].isEmpty()){
                continue;
            }
            str = ar[i].trim()+" "+str;
        }
        return str.trim();
    }
}