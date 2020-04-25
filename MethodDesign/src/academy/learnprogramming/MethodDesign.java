package academy.learnprogramming;

/**
 * [access modifier] [optional specifier] [return type] [method name] [brackets] [exception]
 */
public class MethodDesign {

    public void jump() {}

    // void public jump2() {} does not compile

    void jump3() {} // package access modifier

    public final void jump4() {}
    public static final void jump5() {}
    public final static void jump6() {}

    // public modifier void jump7() {} // does not compile
    // public String void jump8() {} // does no compile, two return type
    // final public void final jump9() {} // does no compile

    final static public void jump10() {}

    // String int public void jump11() {} // does not compile
}
