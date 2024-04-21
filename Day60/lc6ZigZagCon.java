class Solution {
    public String convert(String s, int numRows) {
        String []arr=new String[numRows];
        if(numRows==1){
            return s;
        }
        Arrays.fill(arr,"");
        int cr=0,i=0,mod=0;
        int []dir={1,-1};
        while(i<s.length()){
            arr[cr]+=s.charAt(i);
            i++;
            int newRow=cr+dir[mod];
            if(newRow<0||newRow>=numRows){
                mod=(mod+1)%2;
                newRow=cr+dir[mod];
            }
            cr=newRow;
        }
        String res="";
        for(String a:arr){
            res+=a;
        }
return res;
        
    }
}