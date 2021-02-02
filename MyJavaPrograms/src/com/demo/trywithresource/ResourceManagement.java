package com.demo.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagement {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"/home/admin/Desktop/tryWithResources.txt"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}