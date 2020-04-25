package academy.learnprogramming;

import academy.learnprogramming.common.Common;

public class UsingAccessModifers {

    public static void main(String[] args) {
        Common common = new Common();

        common.publicPrint();

        System.out.println("publicNumber=" + common.publicNumber);
    }

}
