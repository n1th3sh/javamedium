public class prevalphabet {
    public static void main(String[] args) {
        String ip="xyz";
        char res='\0';
        String x="";
        for(int i=0;i<ip.length();i++){
            int ch=ip.charAt(i);
            if(ch=='a' || ch=='A') {
                res=(char) (ch+25);
                x+=(res+"");
            }
            else{
                res=(char) (ch-1);
                x+=(res+"");
            }
        }
        System.out.println(x);

    }
}
