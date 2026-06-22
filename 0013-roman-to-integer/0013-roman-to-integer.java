class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int strLen = s.length();
       for(int i = strLen-1; i >= 0; i--){
            if(s.charAt(i) == 'I'){
                sum += 1;
            }
            else if(s.charAt(i) == 'V'){
                if(i > 0 && s.charAt(i-1) == 'I'){
                    sum += 4;
                    i--;
                }
                else    sum += 5;
            }
            else if(s.charAt(i) == 'X'){
                if(i > 0 && s.charAt(i-1) == 'I'){
                    sum += 9;
                    i--;
                }
                else    sum += 10;
            }
            else if(s.charAt(i) == 'L'){
                if(i > 0 && s.charAt(i-1) == 'X'){
                    sum += 40;
                    i--;
                }
                else    sum += 50;
            }
            else if(s.charAt(i) == 'C'){
                if(i > 0 && s.charAt(i-1) == 'X'){
                    sum += 90;
                    i--;
                }
                else    sum += 100;
            }
            else if(s.charAt(i) == 'D'){
                if(i > 0 && s.charAt(i-1) == 'C'){
                    sum += 400;
                    i--;
                }
                else    sum += 500;
            }
            else{
                if(i > 0 && s.charAt(i-1) == 'C'){
                    sum += 900;
                    i--;
                }
                else    sum += 1000;
            }
       } 
       return sum;
    }
}