package ru.Albiz19.java2020.pr10.ex10_8;

public class main {
    public static void main(String []args){
        String s = "алла";
        if(isPalindrome(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean isPalindrome(String s){
        int n=s.length();
        for (int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
