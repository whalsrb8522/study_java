package day012;

public class 과제 {
	public static void main(String[] args) {
		/*
		 * remocon 인터페이스
		 * [추상 메서드]
		 * - powerOn
		 * - powerOff
		 * - channelUp
		 * - channelDown
		 * - volUp
		 * - volDown
		 */

		Tv myTv = new Tv();
		myTv.tvInfo();
		
		myTv.channelUp();
		myTv.channelDown();
		myTv.volUp();
		myTv.VolDown();
	
		myTv.powerOn();
		
		myTv.channelDown();
		myTv.channelUp();
		
		myTv.volUp();
		myTv.setVol(20);
		myTv.volUp();
		myTv.volUp();
		
		myTv.setVol(2);
		myTv.VolDown();
		myTv.VolDown();
		myTv.VolDown();
	}
}

class Tv implements remocon {
	/*
	 * 채널은 0~10, 순환구조
	 * 볼륨은 0~20, 0이 되면 음소거라고 출력, 0미만 또는 20초과로 올라가지 않음
	 */
	
	private boolean power = false;
	private int channel = 0;
	private int vol = 0;
	
	public void tvInfo() {
		if(power) {
			System.out.printf("= myTV =\n");
			System.out.printf("채널 : %d\n", channel);
			System.out.printf("볼륨 : %d", vol);
		} else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}

	@Override
	public void powerOn() {
		System.out.println("전원을 켭니다.");		
		power = true;
	}

	@Override
	public void poweroff() {
		System.out.println("전원을 끕니다.");		
		power = false;
	}

	@Override
	public void channelUp() {
		if (power) {
			channel++;
			 
			if (channel == 11) {
				channel = 0;
			}
			
			System.out.printf("채널을 올립니다. 현재채널 : %d\n", channel);	
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	@Override
	public void channelDown() {
		if (power) {
			channel--;
			
			if (channel == -1) {
				channel = 10;
			}
			
			System.out.printf("채널을 내립니다. 현재채널 : %d\n", channel);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	@Override
	public void volUp() {
		if (power) {
			vol++;
			
			if (vol > 20) {
				vol = 20;
			}

			System.out.printf("볼륨을 올립니다. 현재볼륨 : %d\n", vol);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	@Override
	public void VolDown() {
		if (power) {
			vol--;
			
			if (vol <= 0) {
				vol = 0;
				System.out.printf("음소거. 현재볼륨 : %d\n", vol);
			} else {
				System.out.printf("볼륨을 내립니다. 현재볼륨 : %d\n", vol);
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
		
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
}

interface remocon {
	void powerOn();
	void poweroff();
	void channelUp();
	void channelDown();
	void volUp();
	void VolDown();
}