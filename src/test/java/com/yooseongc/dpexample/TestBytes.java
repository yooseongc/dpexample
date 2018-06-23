package com.yooseongc.dpexample;



public class TestBytes {

	public static void main(String[] args) {
		
		String data = "1234567890123456";  // --> 16 bytes to 8 bytes
		byte start = 0x02;  // 1 byte
		byte end   = 0x03;  // 1 byte
		
		byte[] buffer = new byte[1 + 8 + 1];
		
		byte[] databuffer = new byte[8];
		byte[] databytes = data.getBytes();
		
		System.out.println("initial bytes : " + databytes.length);
		for (int i = 0; i < databuffer.length; i++) {
			databuffer[i] = (byte) Integer.parseInt(data.substring(2*i, 2*i+2));
		}
		
		buffer[0] = start;
		for (int i = 1; i < 9; i++) {
			buffer[i] = databuffer[i - 1];
		}
		buffer[9] = end;
		
		System.out.println("end bytes : " + buffer.length);
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			//System.out.print("" + buffer[2*i + 1] + buffer[2*i + 2]);
			System.out.print(String.format("%02d%02d", buffer[2*i + 1], buffer[2*i + 2]));
		}
		
	}

}
