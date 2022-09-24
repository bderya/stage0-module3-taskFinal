package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
		int lastDigit = 0;
		int reverse = 0;
		while(number >=1)
		{
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number =number / 10;
		}
		System.out.println(reverse);
    }
}
