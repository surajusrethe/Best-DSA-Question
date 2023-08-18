class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 0;
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            long z = minrequired(piles, h, mid);

            if (z <= h)
                end = mid;
            else
                start = mid + 1;
        }
        
        if (end > end) return -1;
        return end;
    }

    static long minrequired(int[] piles, int h, int mid) {
        long ans = 0L;
        for (int pile : piles) {
            ans += (pile + mid - 1) / mid; // Ceiling division
        }
        return ans;
    }
}
