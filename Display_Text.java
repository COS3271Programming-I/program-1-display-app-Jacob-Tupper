package program_1_Display_APP;

public class Display_Text {
	public static void main(String[] args) {
		//Prints the text
		System.out.println("Time to Dine\n");
		//Turning the text to uppercase
		System.out.println("on my way\n".toUpperCase());
		//Turning the text to lowercase
		System.out.println("I AM BUSY MOM!\n".toLowerCase());
		//Printing multiple text at once
		System.out.format("%s%s","Well the food is getting cold ", "I Will Just Warm it up later\n");
		//The Use of Tabs
		System.out.println("Why...\tThat is absolutely disgusting\n");
		//Justifying the Left
		System.out.format("%-30s%-30s%s", "Your Food with get smooth", "It tastes the same", "And.....\n");
		//Justifying the Right
		System.out.format("%30s%20s%30s", "But the texture","..........","But the texture\n");
		//Storing Strings
		String F, S;
		F = "The Texture will be fine\n";
		S = "It ruins the whole dish";
		System.out.println(F + S);
		//Upper case and lower case the string variables
		F = F.toUpperCase();
		S = S.toLowerCase();
		System.out.println(F + S);
	}
}
