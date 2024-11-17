package nov24;

import java.util.HashMap;
import java.util.Map;

public class RupeesToWords {

	public static void main(String[] args) {
		int amount = 9234567; // Example amount in rupees
		String words = convertRupeesToWords(amount);
		System.out.println("Amount in Words: " + words);
	}

	private static String convertRupeesToWords(int amount) {
		if (amount == 0) {
			return "Zero Rupees";
		}

		// Number to words mapping
		Map<Integer, String> unitsMap = Map.ofEntries(
	            Map.entry(0, ""), Map.entry(1, "One"), Map.entry(2, "Two"), Map.entry(3, "Three"),
	            Map.entry(4, "Four"), Map.entry(5, "Five"), Map.entry(6, "Six"),
	            Map.entry(7, "Seven"), Map.entry(8, "Eight"), Map.entry(9, "Nine"),
	            Map.entry(10, "Ten"), Map.entry(11, "Eleven"), Map.entry(12, "Twelve"),
	            Map.entry(13, "Thirteen"), Map.entry(14, "Fourteen"), Map.entry(15, "Fifteen"),
	            Map.entry(16, "Sixteen"), Map.entry(17, "Seventeen"), Map.entry(18, "Eighteen"),
	            Map.entry(19, "Nineteen")
	        );
	        
		Map<Integer, String> tensMap = Map.of(2, "Twenty", 3, "Thirty", 4, "Forty", 5, "Fifty", 6, "Sixty", 7,
				"Seventy", 8, "Eighty", 9, "Ninety");

		StringBuilder result = new StringBuilder();

		// Process crores
		if (amount >= 10000000) {
			result.append(convertToWords(amount / 10000000, unitsMap, tensMap)).append(" Crore ");
			amount %= 10000000;
		}

		// Process lakhs
		if (amount >= 100000) {
			result.append(convertToWords(amount / 100000, unitsMap, tensMap)).append(" Lakh ");
			amount %= 100000;
		}

		// Process thousands
		if (amount >= 1000) {
			result.append(convertToWords(amount / 1000, unitsMap, tensMap)).append(" Thousand ");
			amount %= 1000;
		}

		// Process hundreds
		if (amount >= 100) {
			result.append(convertToWords(amount / 100, unitsMap, tensMap)).append(" Hundred ");
			amount %= 100;
		}

		// Add "and" for the last two digits
		if (amount > 0 && result.length() > 0) {
			result.append("and ");
		}

		// Process tens and units
		if (amount > 0) {
			result.append(convertToWords(amount, unitsMap, tensMap)).append(" ");
		}

		result.append("Rupees");
		return result.toString().trim();
	}

	private static String convertToWords(int number, Map<Integer, String> unitsMap, Map<Integer, String> tensMap) {
		if (number < 20) {
			return unitsMap.get(number);
		} else {
			int tens = number / 10;
			int units = number % 10;
			return tensMap.get(tens) + (units > 0 ? " " + unitsMap.get(units) : "");
		}
	}
}
