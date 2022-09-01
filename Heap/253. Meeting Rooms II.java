class Solution {
    public int minMeetingRooms(int[][] intervals) {
 
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for(int[] i: intervals){
             if(!pq.isEmpty()&&(pq.peek()[1])<=i[0]) pq.poll();
            pq.offer(i);
        }
        return pq.size();
    }
}
