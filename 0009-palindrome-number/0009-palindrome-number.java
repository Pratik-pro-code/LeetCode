// class Solution {
//     public boolean isPalindrome(int x) {
//        String str = String.valueOf(x);
//         int i = 0;
//         int j= str.length() -1 ;
//         while(i<j){
//             if(str.charAt(i) != str.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//             return true;
//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
       int copy = x;
       int reversed = 0;
       if (x<0) return false;
        while( x > 0){
            int rem = x%10;
            reversed = (reversed*10)+rem;
            x/=10;
        }
        return copy == reversed;
    }
}