package J3;

import java.util.function.IntPredicate;

public class FuncList {
    // practice 3-1
//    public static boolean isOdd(int x) { return x % 2 == 1; }
//    public String passCheck(int point, String name) {
//        return name + "さんは" + ( point > 65 ? "合格" : "不合格" );
//    }

    // practice 3-2
//    public static OddPredicate isOdd = x -> (x % 2 == 1);
//    public PassOperator passCheck = (point, name) -> name + "さんは" + ( point > 65 ? "合格" : "不合格" );

    // practice 3-3
    public static IntPredicate isOdd = x -> (x % 2 == 1);
    public PassOperator passCheck = (point, name) -> name + "さんは" + ( point > 65 ? "合格" : "不合格" );

}
