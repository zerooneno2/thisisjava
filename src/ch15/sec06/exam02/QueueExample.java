package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQue = new LinkedList<>();
		
		messageQue.offer(new Message("sendMail", "홍길동"));
		messageQue.offer(new Message("sendSMS", "백일섭"));
		messageQue.offer(new Message("sendKakaotalk", "신용복"));
		
		while(!messageQue.isEmpty()) {
			Message message  = messageQue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카톡을 보냅니다");
					break;
			}
		}
	}

}
