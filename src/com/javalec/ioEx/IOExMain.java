package com.javalec.ioEx;

import java.io.*;
import java.util.*;

public class IOExMain {
	public static void inout() {
		try {
			InputStream is = new FileInputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest.txt");
			while(true) {
				int i = is.read();
				System.out.println("데이터 : " + i );				
				if(i == -1) break;
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest1.txt");
			String str = "이것은 FileOutPutStream을 활용한 텍스트입니다.";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os != null) os.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
	}
	
	public static void inoutCopy() {
		InputStream isCopy = null;
		OutputStream osCopy = null;
		
		try {
			isCopy = new FileInputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest1.txt");
			osCopy = new FileOutputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest_copy.txt");
			
			while(true) {
				int i = isCopy.read();
				if(i == -1) break;
				osCopy.write(i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if(isCopy != null) {
				try {
					isCopy.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
			}
			
			if(osCopy != null) {
				try {
					osCopy.close();
				} catch (Exception e3) {
					// TODO: handle exception
					System.out.println(e3.getMessage());
				}
			}
		}
	}
	
	public static void inoutCopyByte() {
		InputStream isCopy = null;
		OutputStream osCopy = null;
		
		try {
			isCopy = new FileInputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest1.txt");
			osCopy = new FileOutputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest_copyByte.txt");
			
			byte[] bs = new byte[5];
			
			while(true) {
				int count = isCopy.read(bs);
				
				if(count == -1) break;
				osCopy.write(bs, 0, count);				
			}
			
		}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			} finally {
			if(isCopy != null) {
				try {
					isCopy.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
			}
			
			if(osCopy != null) {
				try {
					osCopy.close();
				} catch (Exception e3) {
					// TODO: handle exception
					System.out.println(e3.getMessage());
				}
			}
		}
	}
	
	public static void inoutString() {
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest1.txt");			
			dis = new DataInputStream(is);			
			String str = dis.readUTF();
			
			os = new FileOutputStream("D:\\Pro_wrkspace\\Students\\src\\IOTest1_StringCopy.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러"+e.getMessage());
		} finally {
			if(dos != null) {
				try {
					dos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println("dos에러"+e2.getMessage());
				}
			}
			
			if(os != null) {
				try {
					os.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println("os에러"+e2.getMessage());
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		inoutString();
	}

}
