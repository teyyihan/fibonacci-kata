import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {

	@ParameterizedTest
	@MethodSource("provideDataForTwoNumbers")
	void shouldReturnSum(String input, Integer output) {
		int result = new Calculator().addTwoNumbers(input);
		assertEquals(output, result);
	}

	@ParameterizedTest
	@MethodSource("provideData")
	void shouldReturnSumOfMultipleNumbers(String input, Integer output) {
		int result = new Calculator().addUnlimitedNumbers(input);
		assertEquals(output, result);
	}

	private static Stream<Arguments> provideDataForTwoNumbers() {
		return Stream.of(
				Arguments.of("", 0),
				Arguments.of("1", 1),
				Arguments.of("4", 4),
				Arguments.of("1,2", 3),
				Arguments.of("2,4", 6)
		);
	}

	private static Stream<Arguments> provideData() {
		return Stream.of(
				Arguments.of("", 0),
				Arguments.of("1", 1),
				Arguments.of("1,2,3,4,5,6,7,8,9", 45)
				);
	}

}
