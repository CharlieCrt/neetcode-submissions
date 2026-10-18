class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i : nums){
            if (seen.containsKey(i)){
                return true;
                } else {
                    seen.put(i,i);}
        }
        return false;
    }
}