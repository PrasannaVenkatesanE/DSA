class Solution {
    public String intToRoman(int num) {
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(num != 0 && index < value.length){
            int iter = num/value[index];

            sb.append(symbol[index].repeat(iter));
            num = num % value[index];
            index++;
        }
        return sb.toString();
    }
}