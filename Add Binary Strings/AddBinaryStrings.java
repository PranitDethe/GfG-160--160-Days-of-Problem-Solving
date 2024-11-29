class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        
        int i = n - 1;
        int j = m - 1;
        
        StringBuilder res = new StringBuilder();
        
        int carry = 0;
        
        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if(i >= 0) sum += s1.charAt(i) - '0';
            if(j >= 0) sum += s2.charAt(j) - '0';
            
            res.append(sum % 2);
            carry = sum / 2;
            
            i--;
            j--;
        }
        String result = res.reverse().toString();
        return result.replaceFirst("^0+", "");
    }
}
