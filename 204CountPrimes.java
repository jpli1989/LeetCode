/**

用一个数组表示当前数是否是素数。

然后从 2 开始，将 2 的倍数，4、6、8、10 …依次标记为非素数。

下个素数 3，将 3 的倍数，6、9、12、15 …依次标记为非素数。

下个素数 7，将 7 的倍数，14、21、28、35 …依次标记为非素数。

在代码中，因为数组默认值是 false ，所以用 false 代表当前数是素数，用 true 代表当前数是非素数。
*/

class Solution {
    public int countPrimes(int n) {
       //use a boolean array and default value false
        boolean[] res = new boolean[n];
        
        int count=0;
        for(int i=2; i<n; i++){
            if(res[i] == false){// is prime number
                count++;
                //find all the multiple numbers based on current number
                for(int j=2; i*j < n; j++){
                    //update all the multiple numbers to true
                    res[i*j] = true;
                }
            }
        }
        
        return count;
    }
}
