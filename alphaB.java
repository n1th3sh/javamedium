public class alphaB {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                    if(i==1 || i==4)
                    {
                        System.out.print(i==1 && (j==1 || j==7)?"   ":"*  ");
                    }
                    else
                    {
                        System.out.print((j==1 || j==7)?"*  ":"   ");
                    }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==1 || i==4 || i==7)
                {
                    System.out.print((j==7)?"   ":"*  ");
                }
                else
                {
                    System.out.print((j==1 || j==7)?"*  ":"   ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==1 || i==7)
                {
                    System.out.print((j==1)?"   ":"*  ");
                }
                else
                {
                    System.out.print((j==1)?"*  ":"   ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==1 || i==7)
                {
                    System.out.print((j==7)?"   ":"*  ");
                }
                else
                {
                    System.out.print((j==1 || j==7)?"*  ":"   ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==2 || i==3 || i==5 || i==6)
                {
                    System.out.print((j==1)?"*  ":"   ");
                }
                else
                {
                    System.out.print("*  ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==2 || i==3 || i==5 || i==6 || i==7)
                {
                    System.out.print((j==1)?"*  ":"   ");
                }
                else
                {
                    System.out.print("*  ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==1 || i==4 || i==7)
                {
                    System.out.print(((i==1&&j==1)||(i==7&&j==1)||(i==4&&(j==2||j==3)))?"   ":"*  ");
                }
                else
                {
                    System.out.print(((i==2 && j==1)||(i==3 && j==1)||((i==5&&(j==1||j==7)))||(i==6&&(j==1||j==7))?"*  ":"   "));
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==4)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print((j==1 || j==7)?"*  ":"   ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==1 || i==7)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print((j==4)?"*  ":"   ");
                }


            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==1 || (i==7) )
                {
                    System.out.print((i==7&&j==1||j==2||j==3||j==4)||i==1?"*  ":"   ");
                }
                else
                {
                    System.out.print(((j==4)||(i==5&&j==1)||(i==6&&j==1)||(i==4
                            &&j==1))?"*  ":"   ");
                }


            }
            System.out.println();
        }
    }
}
