import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

	@ParameterizedTest
	@MethodSource("provideDataWithNewLines")
	void shouldReturnSumOfMultipleNumbersWithNewLine(String input, Integer output) {
		int result = new Calculator().addMultipleNumbersWithNewLine(input);
		assertEquals(output, result);
	}

	@ParameterizedTest
	@MethodSource("provideDataWithCustomSeparator")
	void shouldReturnSumOfMultipleNumbersWithCustomSeparator(String input, Integer output) {
		int result = new Calculator().addMultipleNumbersCustomSeparator(input);
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

	private static Stream<Arguments> provideDataWithNewLines() {
		return Stream.of(
				Arguments.of("1\n2,3", 6),
				Arguments.of("1\n2,4", 7),
				Arguments.of("1\n2,5", 8),
				Arguments.of("1\n3,5", 9)
				);
	}

	private static Stream<Arguments> provideDataWithCustomSeparator() {
		return Stream.of(
				Arguments.of("//;\n1;2", 3),
				Arguments.of("//;\n2;2", 4),
				Arguments.of("//;\n2;3", 5),
				Arguments.of("//;\n2;4", 6),
				Arguments.of("//;\n3;4", 7),
				Arguments.of("//;;\n3;;4", 7),
				Arguments.of("//;\n", 0)
				);
	}

}
