package strings;

public class kmpAlog {

}

public int[] returnLps(char[] arr){
        // kmp algo will return an array having longest prefix suffix
        int len = 0;
        int i=1;
        int[] lps = new int[arr.length];
        lps[0]=0;
        while(i<arr.length){
            if(arr[i] == arr[len]){
                len++;
                lps[i]=len;
                i++;
            }else if(arr[i] != arr[len]){
                if(len == 0){
                    lps[i]=0;
                    i++;
                }else{
                    len = lps[len-1];
                }
            }
        }
        return lps;
    }