public class sumodds {
    public static void main(String[] args) {
        int num=361589;
        String s=num+"";
        StringBuilder even=new StringBuilder();
        StringBuilder odd=new StringBuilder();
        int evensum=0;
        int ecount=0;
        int oddsum=0;
        int ocount=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int x=c-'0';
            if(x%2==0)
            {
                even.append(x);
                evensum+=x;
                ecount++;
            }
            if(x%2==1)
            {
                odd.append(x);
                oddsum+=x;
                ocount++;
            }
        }
        System.out.println("for oddsum & odd seq");
        System.out.println(oddsum+""+odd);
        System.out.println("for evensum & even seq");
        System.out.println(evensum+""+even);
        System.out.println("for oddseq & evenseq");
        System.out.println(odd+""+even);
        System.out.println("for odd+count & even+count");
        System.out.println(odd+"-"+ocount+" "+even+"-"+ecount);
    }
}
