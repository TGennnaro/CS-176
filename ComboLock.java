
public class ComboLock {
	private int[] password;
	private int currentNum;
	private int[] entered;
	public ComboLock(int num1, int num2, int num3) {
		this.password = new int[3];
		this.password[0] = num1;
		this.password[1] = num2;
		this.password[2] = num3;
		this.reset();
	}
	
	public void reset() {
		int[] temp = {-1, -1, -1};
		entered = temp;
		currentNum = 0;
	}
	
	public void turnLeft(int tick) {
		if (entered[0] != -1 && entered[2] == -1) {
			entered[1] = currentNum+tick;
			if (entered[1] > 39) {
				entered[1] -= 40;
			}
			currentNum = entered[1];
		}
	}
	
	public void turnRight(int tick) {
		int num = -1;
		if (entered[0] == -1 && entered[1] == -1) {
			num = 0;
		} else if (entered[0] != -1 && entered[1] != -1){
			num = 2;
		}
		if (num != -1) {
			entered[num] = currentNum-tick;
			if (entered[num] < 0) {
				entered[num] = 40-Math.abs(entered[num]);
			}
			currentNum = entered[num];
		}
	}
	
	public boolean open() {
		for (int i=0;i<password.length;i++) {
			if (entered[i] != password[i]) {
				return false;
			}
		}
		this.reset();
		return true;
	}
	
	public void increment() {
		for (int i=0;i<password.length;i++) {
			password[i] += 5;
			if (password[i] > 39) {
				password[i] -= 40;
			}
		}
	}
}
