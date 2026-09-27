class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int fre = 0;
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Integer> arr = new ArrayList<>(count.keySet());
        arr.sort((a, b) -> count.get(b) - count.get(a));

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = arr.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}
