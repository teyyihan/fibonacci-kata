import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

	/* int add(String input) {
		if (input.isEmpty()) return 0;
		if ("4".equals(input)) return 4;
		if ("1,2".equals(input)) return 3;
		if ("2,4".equals(input)) return 6;
		if ("3,4".equals(input)) return 7;

		return 0;
	} */

    int addTwoNumbers(String input) {
        if (input.isEmpty()) return 0;

        String[] numbers = input.split(",");
        List<Integer> integers = Arrays.stream(numbers).map(Integer::parseInt).collect(Collectors.toList());

        if (integers.size() == 1) return integers.get(0);

        return integers.get(0) + integers.get(1);
    }

/*
    int addUnlimitedNumbers(String input) {
        if (input.isEmpty()) return 0;
        if ("1".equals(input)) return 1;

        if ("1,2,3,4,5,6,7,8,9".equals(input)){
            return 45;
        }
        return 0;
    }
*/

    int addUnlimitedNumbers(String input) {
        if (input.isEmpty()) return 0;

        String[] numbers = input.split(",");
        List<Integer> integers = Arrays.stream(numbers).map(Integer::parseInt).collect(Collectors.toList());

        if (integers.size() == 1) return integers.get(0);

        return integers.stream().reduce(0, Integer::sum);
    }
}
