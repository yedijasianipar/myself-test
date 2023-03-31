package com.myself.main;

public class TestOne {
    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(j); //print 12345
                if (j == 5)
                {
                    System.out.println();
                    for (int k = 1; k <= 1; k++)
                    {
                        for (int l = 5; l >= 1; l--)
                        {
                            System.out.print(l);
                            if (l == 1)
                            {
                                System.out.println();
                            }

                        }
                    }

                }

            }

        }
    }
}
