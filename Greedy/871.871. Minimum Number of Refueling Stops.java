class Solution {
     public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int i = 0, n = stations.length, maxDistance = 0, count = -1;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b - a);
        queue.add(startFuel);
        while(maxDistance < target && !queue.isEmpty()){
            maxDistance += queue.poll();
            count++;
            while(i < n && stations[i][0] <= maxDistance){
                queue.add(stations[i][1]);
                i++;
            }
        }
        
        if(maxDistance >= target) return count;
        else return -1;
    }
}
