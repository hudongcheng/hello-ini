package com.jni.demo;
public class LibPath {
	//定义一个本地方法
	//public native int nativeAdd(int a, int b);
	public static void main(String[] args){
		//调用动态链接库
		//System.loadLibrary("add-jni");
    System.out.println(System.getProperty("java.library.path"));
    //System.out.printf("x + y = ", jniDemo.nativeAdd(3, 3));
	}
}