class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int k = 0;
    public KthLargest(int k, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        this.k = k;
    }
    
    public int add(int val) {
        pq.add(val);
        List<Integer> temp = new ArrayList<>();
        int t = k;
        while (t-- > 1) {
            temp.add(pq.poll());
        }
        int ans = pq.peek();
        t = k;
        int i = 0;
        while (t-- > 1) {
            pq.add(temp.get(i++));
        }
        return ans;
    }
}
