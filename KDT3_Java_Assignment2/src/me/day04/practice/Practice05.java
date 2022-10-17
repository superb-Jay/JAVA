package me.day04.practice;

public class Practice05 {
    public static void main(String[] args) {
        // a+b>c 삼각형
        int a= 0;
        int b= 0;
        int c= 0;
        int n= 0;

        for(a=1; a<101; a++){
            for(b=1; b<101; b++){
                for(c=1; c<101; c++){
                    if((c*c)== (a*a)+(b*b)){
                        n++;
                        //System.out.printf("%d, %d, %d \n", a,b, c);
                    }
                }

            }
        }
        System.out.println("(a,b,c)쌍의 개수: "+n);
    }
}
