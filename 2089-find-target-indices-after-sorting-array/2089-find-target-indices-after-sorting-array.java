class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> li = new ArrayList<>();
        int low = 0, same = 0;

        for(int num : nums){
            if(num < target){
                low++;
            } else if(num == target){
                same++;
            }
        }

        for(int i = 0; i < same; i++){
            li.add(low+i);
        }

        return li;
    }
}