package J3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Exe {
    public static void execute() {
//        OddPredicate Func1 = FuncList::isOdd;
//        OddPredicate Func1 = FuncList.isOdd;
//        System.out.println(Func1.process(0));
//        System.out.println(Func1.process(1));
//        System.out.println(Func1.process(2));
//        System.out.println(Func1.process(3));

        // practice 3-3
        IntPredicate Func1 = FuncList.isOdd;
        System.out.println(Func1.test(0));
        System.out.println(Func1.test(1));
        System.out.println(Func1.test(2));
        System.out.println(Func1.test(3));

//        PassOperator Func2 = new FuncList()::passCheck;
        PassOperator Func2 = new FuncList().passCheck;

        System.out.println(Func2.process(64, "Alen"));
        System.out.println(Func2.process(68, "Bred"));

        // practice 3-4
        List<String> names = new ArrayList<>(Arrays.asList("菅原琢磨", "湊祐介", "朝倉さくら", "大江学人"));
        names.stream()
                .filter(s -> s.length() <= 4)
                .forEach(s -> System.out.println(s + "さん"));
    }
}
