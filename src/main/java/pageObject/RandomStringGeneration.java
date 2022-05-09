package pageObject;

import java.util.Random;

      public class RandomStringGeneration {
			public String generateRandomPassword(int len) {
				String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
		          +"lmnopqrstuvwxyz!@#$%&";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(len);
				for (int i = 0; i < len; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
				return sb.toString();
			}
			public String generationRandomNumbers(int len) {
				String qw  = "123456789";
				Random num =new Random();
				StringBuilder n= new StringBuilder(len);
				for (int j=0; j<len; j++)
					n.append(qw.charAt(num.nextInt(qw.length())));
				return n.toString();
				
			}
			public boolean equal(String errorMsg) {
				// TODO Auto-generated method stub
				return false;
			}

	}
	
	
	
	
