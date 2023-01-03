package util.match;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MatchAndNonMatch {
    public static void mainLogic() {
        List<String> testList1 = new ArrayList<>();
        testList1.add("1");
        testList1.add("2");
        testList1.add("3");
        testList1.add("4");
        testList1.add("5");

        List<String> testList2 = new ArrayList<>();
        testList2.add("2");
        testList2.add("3");
        testList2.add("4");
        testList2.add("5");
        testList2.add("6");

        // match(testList1,testList2);

        List<String> originalList = Arrays.asList("a1", "a2", "a3", "a4");
        List<String> filterList = Arrays.asList("a3", "a4", "a5", "a6");
        List<String> filteredList = originalList.stream()
                .filter(item -> filterList.stream().noneMatch(Predicate.isEqual(item)))
                .collect(Collectors.toList());

        //originalList 를 기준으로 비교하여 일치하지 않는(noneMatch) 값 찾기
        System.out.println(filteredList); //a1, a2

        List<String> filteredTargetList = filterList.stream()
                .filter(target -> originalList.stream().noneMatch(Predicate.isEqual(target)))
                .collect(Collectors.toList());

        //filterList 를 기준으로 비교하여 일치하지 않는(noneMatch) 값 찾기
        System.out.println(filteredTargetList); //a5, a6
    }

    public static List<String> match(List<String> testList1, List<String> testList2) {
        List<String> returnData = new ArrayList<>();

        return returnData;
    }

    public static void nonMatch() {

    }
}
