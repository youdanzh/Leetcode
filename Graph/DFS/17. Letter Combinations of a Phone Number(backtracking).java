class Solution {
     String[] map = new String[] {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    List<String> res = new LinkedList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        dfs(digits,0,new StringBuilder());
        return res;
    }
    void dfs(String digits, int start, StringBuilder sb){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        for(int i = start;i<digits.length();i++){
            int digit = digits.charAt(i)-'0';
            for(char c:map[digit].toCharArray()){
                sb.append(c);
                dfs(digits,i+1,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
