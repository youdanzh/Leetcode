class Solution {
    public boolean isPossible(int[] nums) {
        //for both maps:
        //key -> element
        //value -> frequency of that element
        
        //keeps elements and their frequencies which are still available and have not been assigned to any subsequence
        HashMap<Integer,Integer> available=new HashMap<>();
        
        //keeps elements and their frequencies which are next required in subsequencies already formed
        HashMap<Integer,Integer> want=new HashMap<>();
        
        //Approach:-
        //if the current element is already used, then just continue to next element
        
        //if the current element has not been assigned yet
        
        //then check if this element is there in want map(if any subsequence needs it)
            //if it is found, then it will add itself to that subsequence and make way for nums[i]+1
            //(we would require nums[i]+1 to continue the current subsequence)
            //add nums[i]+1 to want map now
        
        //if it is not found in want map,
            //then it has to start its own subsequence
            //and the subsequence will only be valid when nums[i]+1 and nums[i]+2 are there in the available map
            //if the elements are available,
            //then add nums[i]+3 to want map since we have made a new sebsequence already with {nums[i], nums[i]+1, nums[i]+2}
        
        //if the elements are not available, then the current element can't satisfy any condition, so return false
        
        for(int i=0;i<nums.length;i++){
            available.put(nums[i],available.getOrDefault(nums[i],0)+1);
        }
        
        for(int i=0;i<nums.length;i++){
            //already assigned
            if(available.get(nums[i])<=0){
                continue;
            }
            
            //checking if there is a need in any already made subsequence
            else if(want.getOrDefault(nums[i],0)>0){
                available.put(nums[i],available.get(nums[i])-1);
                want.put(nums[i],want.get(nums[i])-1);
                //adding the new want for this subsequence, i.e, nums[i]+1
                want.put(nums[i]+1,want.getOrDefault(nums[i]+1,0)+1);
            }
            
            //checking if new subsequence can be started
            else if(available.getOrDefault(nums[i]+1,0)>0 && available.getOrDefault(nums[i]+2,0)>0){
                available.put(nums[i],available.get(nums[i])-1);
                available.put(nums[i]+1,available.get(nums[i]+1)-1);
                available.put(nums[i]+2,available.get(nums[i]+2)-1);
                
                want.put(nums[i]+3,want.getOrDefault(nums[i]+3,0)+1);
            }
            
            else{
                return false;
            }
            
        }
        
        return true;
    }
}
