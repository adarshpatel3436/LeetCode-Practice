class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int n1 = nums1.length;
        int n2 = nums2.length;
        int count = 0;

        for(int i = 0; i < n1; i++){
            set1.add(nums1[i]);
        }

        for(int i = 0; i < n2; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] arr = new int[set2.size()];

        int idx = 0;
        for(int num : set2){
            arr[idx] = num;
            idx++;
        }
        return arr;
    }
}