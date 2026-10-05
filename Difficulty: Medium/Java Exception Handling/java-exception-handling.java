class Solution {
    public int findMin(int a, int b) {
        // code here
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = 0;
        if(b == 0){
            div = 0;
        }
        else{
            div = a/b;
        }
        
        int min = Math.min(add,sub);
        min = Math.min(min,mul);
        min = Math.min(min,div);
        return min;
    }
}