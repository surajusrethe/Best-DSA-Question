Sort Characters By Frequency



class Solution {
        public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap(); 

        //put the element of string in map with their frequency       
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }      
        
        //sort the element using priority queue according to their frequency
        PriorityQueue <Character> pq = new PriorityQueue((a,b) -> map.get(b) - map.get(a));
        for (char c : map.keySet()) {
            pq.offer(c);
        }
        
        // Creat a Stringbuilder to modify the string in a efficient manner
        StringBuilder sb = new StringBuilder();    

        //now add the element from the queue to store in String in sorted manner   
        while (!pq.isEmpty()) {
            //stroing the element in the char variable 
            char c = pq.poll();

            //map.get, gets the frequncy from the map and add the element in the string according to the frequency
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }       
        return sb.toString();
    }   
}
