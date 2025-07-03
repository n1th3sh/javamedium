public class highstring {
    public static void main(String[] args) {
        String a="heel956noto567in789uhh";
        String x=a.replaceAll("[A-Z a-z]{1,}"," ").trim();
        int y=x.replaceAll("[0-9]","").length();
        String[] arr=x.split(" ");
        int high=0;
        for(String s:arr)
        {
            int max=Integer.parseInt(s);
            if(max>high)
            {
                high=max;
            }
        }
        System.out.println(high);
    }
}
