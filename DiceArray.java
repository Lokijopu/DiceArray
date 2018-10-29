/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class DiceArray {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int[] count = new int[13];
		for (int i = 0; i < 1000; i++) {
			int sum = dice1.roll() + dice2.roll();
			count[sum]++;
		}
		for (int i = 2; i < 13; i++) {
			System.out.println("Number of " + i + "s:\t" + count[i]);
		}
		}
}