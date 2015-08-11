package math;

import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Node node = null;
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			int data = sc.nextInt();
			
			if (node == null) {
				node = insert(node, data);
			} else {
				insert(node, data);
			}
		}
		
		System.out.println(diameterOfTree(node));
		
		sc.close();
	}
	
	private static class Node {
		
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	private static Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (node.data > data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		
		return node;
	}
	
	private static int diameterOfTree(Node node) {
		if (node != null) {
			int leftHeight = heightOfTree(node.left);
			int rightHeight = heightOfTree(node.right);
			
			int leftDiameter = diameterOfTree(node.left);
			int rightDiameter = diameterOfTree(node.right);
			
			return max(leftHeight + rightHeight + 1, max(leftDiameter, rightDiameter));
		} else {
			return 0;
		}
	}
	
	private static int heightOfTree(Node node) {
		if (node != null) {
			return 1 + max(heightOfTree(node.left), heightOfTree(node.right));
		} else {
			return 0;
		}
	}
	
	private static int max(int a, int b) {
		return (a >= b) ? a : b;
	}
	
}
