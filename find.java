public class find {
    public static void main(String[] args){
        int a=0,b=0,c=0,d=0;
        String w="werfh98235^*^9qew";
        String vowels="aeiou";
        String num="1234567890";
        String spec="!@#$%^&*()";
        for (int i=0;i<=w.length();i++){
            if (vowels.contains(w.charAt(i)+"")){
                a+=1;
            }else if(num.contains(w.charAt(i)+"")){
                b+=1;
            }else if(spec.contains(w.charAt(i)+"")){
                c+=1;
            }else{
                d+=1;
            }
            System.out.println(a+" "+b+" "+c+" "+d);
        }


    }
}

