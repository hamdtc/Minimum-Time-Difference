class Solution {
    public int findMinDifference(List<String> timePoints) {
        int ans=Integer.MAX_VALUE;
        
        int n=timePoints.size();
        
        //firstly we need to change to minints and save
        int mints[]=new int[n];
        for(int i=0;i<n;i++){
            String s=timePoints.get(i);     mints[i]=Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3,5));
        }
        
        //sort because we can minimise the comparison
        Arrays.sort(mints);
        
        //now find the differance
        for(int i=1;i<n;i++){
            ans=Math.min(ans,mints[i]-mints[i-1]);
        }
        
        //may be the least differnce will be first and last element
        ans=Math.min(ans,(24*60 -mints[n-1])+mints[0]);
        return ans;    
    }
}