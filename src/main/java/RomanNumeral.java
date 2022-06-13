import java.util.List;
import util.Pair;

public class RomanNumeral {

	private List<Pair<Integer, String>> lookup = List.of(
			new Pair<Integer, String>(100, "C"),
			new Pair<Integer, String>(90, "XC"),
			new Pair<Integer, String>(50, "L"),
			new Pair<Integer, String>(40, "XL"),
			new Pair<Integer, String>(10, "X"),
			new Pair<Integer, String>(9, "IX"),
			new Pair<Integer, String>(5, "V"),
			new Pair<Integer, String>(4, "IV"),
			new Pair<Integer, String>(1, "I")
	);

	// 99 -> 90 + 9 -> XC + IX
	// 799 -> 700 + 90 + 9 -> DCC + XC + IX
	public String convert(int amount) {
		StringBuilder stringBuilder = new StringBuilder();

		while (amount != 0) {
			for (int i = 0; i < lookup.size(); i++) {
				var pair = lookup.get(i);

				if (pair.getFirst() <= amount) {
					stringBuilder.append(pair.getSecond());
					amount -= pair.getFirst();
					break;
				}
			}
		}

		return stringBuilder.toString();
	}

}
