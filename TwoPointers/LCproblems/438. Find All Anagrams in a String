class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // ========= 模板：定义相关数据结构，初始化工作============
        HashMap<Character, Integer> window_map = new HashMap<>();
        HashMap<Character, Integer> p_map = new HashMap<>();
        for (int i = 0; i < p.length(); i++){
            char c1 = p.charAt(i);
            p_map.put(c1, p_map.getOrDefault(c1, 0) + 1);
        }
        int left, right, count;
        left = right = count = 0;
        ArrayList<Integer> res = new ArrayList<>();

        // ================== 模板：开始滑动窗口=====================
        while (right < s.length()) {

            // =========== 模板：向右滑动窗口，装填满足的字符到map中==========
            char c = s.charAt(right);
            right++;
            if (p_map.containsKey(c)) {
                window_map.put(c, window_map.getOrDefault(c, 0) + 1);
                if (window_map.get(c).equals(p_map.get(c))) {
                    count++;
                }
            }

            // =========== 根据题意：此时“有可能”出现满足条件的解 ==========
            while (right - left == p.length()) {

                // ============= 根据题意：获取“真正”满足条件的解 =============
                if (count == p_map.size()){
                    res.add(left);
                }

                // ========== 模板：左指针向右滑动，寻找下一个可行解/优化已知解======
                char d = s.charAt(left);
                left++;
                if (p_map.containsKey(d)) {
                    if (window_map.get(d).equals(p_map.get(d))) {
                        count--;
                    }
                    window_map.put(d, window_map.getOrDefault(d, 0) - 1);
                } 
            }
        }
        return res;
    }
}
