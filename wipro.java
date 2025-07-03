public class wipro {
    public static void main(String[] args) {
        String str="WIPRO";
        int sum=0;

        for(int i=0;i<str.length();i++)
        {
            int count = 0;
            int c=str.charAt(i);
            char s = (char)c;
            for(int j=2;j<=Math.sqrt(c);j++)
            {
                if(c%j==0){
                    count+=1;
                    break;
                }





//                if(c%j==0)
//                {
//                    break;
//                }
//                if(j == (int) Math.sqrt(c))
//                {
//                    System.out.println(j);
//                    System.out.println(Math.sqrt(c));
//                    System.out.println(c);
//                    sum+=c;
//                }

            }
            if(count==0){
                sum+=c;
                System.out.print(s);
            }

        }

        System.out.println("="+sum);


    }
}
