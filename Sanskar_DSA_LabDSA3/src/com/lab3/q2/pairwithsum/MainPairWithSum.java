package com.lab3.q2.pairwithsum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPairWithSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();

		try {
			while (true) {
				System.out.println("Enter the numbers to insert, enter any letter to exit");
				int num = sc.nextInt();
				bst.insert(num);
			}
		} catch (InputMismatchException ex) {
			System.out.println("Inorder traversal of Binary Search Tree:");
			bst.inorder();
		}

		System.out.println();
		System.out.println("Enter the number:");
		sc.nextLine();
		int num = sc.nextInt();
		sc.close();
		bst.isPairPresent(bst.root, num);
	}
}
