class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int c=0;
        int sum=0;
        int i=num.length-1;
        ArrayList<Integer> ll = new ArrayList<>();
      for(;i>=0 && k!=0;i--) {
                sum = c + num[i] + k % 10;
                ll.add(sum % 10);
                c = sum / 10;
                k /= 10;
        }

        while(i>=0){
            sum=num[i]+c;
            ll.add(sum%10);
            c=sum/10;
            i--;
        }

        while(k!=0){
            sum=c+k%10;
            ll.add(sum%10);
            c = sum/10;
            k/=10;
        }


     if(c!=0){
         ll.add(c);
     }

     Collections.reverse(ll);
     return ll;

    }
}
