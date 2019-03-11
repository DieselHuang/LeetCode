class Solution {
    public String intToRoman(int num) {
        /*String res = "";
        int bit = 1;
        while(num > 0) {
            int m = num % 10;
            num /= 10;
            switch(bit) {
                case 1:
                    res = oneBit(m, "I", "V", "X") + res;
                    bit++;
                    break;
                case 2:
                    res = oneBit(m, "X", "L", "C") + res;
                    bit++;
                    break;
                case 3:
                    res = oneBit(m, "C", "D", "M") + res;
                    bit++;
                    break;
                default:
                    for(int i=0; i<m; i++) {
                        res = "M" + res;
                    }
            }
        }
        return res;*/
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

    /*private String oneBit(int num, String small, String middle, String large) {
        String res = "";
        if(num <= 3) {
            for(int i=0; i<num; i++) {
                res = small + res;
            }
        } else if(num == 4) {
            res = small + middle + res;
        } else if(num == 5) {
            res = middle + res;
        } else if(num < 9){
            res = middle + res;
            for(int i=0; i<num-5; i++) {
                res = res + small;
            }
        } else {
            res = small + large + res;
        }
        return res;
    }*/
}