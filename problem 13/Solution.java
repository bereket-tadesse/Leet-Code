class Solution {

    public int romanToInt(String s) {
        int total = 0;
        int i = 0;
        while (i <= s.length()-1) {
            if (s.charAt(i)=='I') {
                if (i != s.length()-1 && s.charAt(i+1) == 'V' ) {
                    total += 4;
                    i++;
                } else if ( i   != s.length()-1 && s.charAt(i+1) == 'X' ) {
                    total += 9;
                    i++;
                } else {
                    total += 1;
                }
            } 
            else if (s.charAt(i)=='X') {
                if (i != s.length()-1 && s.charAt(i+1) == 'L') {
                    total += 40;
                    i++;
                } else if (i != s.length()-1 && s.charAt(i+1) == 'C') {
                    total += 90;
                    i++;
                } else {
                    total += 10;
                }
            } 

            else if (s.charAt(i)=='C') {
                if (i != s.length()-1 && s.charAt(i+1) == 'D' ) {
                    total += 400;
                    i++;
                } else if (i != s.length()-1 && s.charAt(i+1) == 'M' ) {
                    total += 900;
                    i++;
                } else {
                    total += 100;
                }

            }  else if (s.charAt(i)=='V'){
                total+= 5;
            } else if (s.charAt(i) == 'D') {
                total += 500;
            } else if (s.charAt(i) == 'L') {
                total += 50;
            } else if (s.charAt(i) == 'M') {
                total += 1000;
            }
            i++;
        }
        return total;
    }
}