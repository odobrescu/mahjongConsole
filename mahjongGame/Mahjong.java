//package mahjongGame;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Mahjong {
//	static int[][] mahjongMatrix = new int[7][7];
//	static int count = 0;
//	static int noOfPairs = 18;
//	static {
//		System.out.println(
//				" O sa jucam un joc de memorie. Alege doua cate doua orice carti de pe tabla introducand coordonatele. ");
//		System.out.println(
//				"Scopul jocului este sa ghiccesti toate perchile de piese de pe tabla");
//		System.out.println(
//				"Cand ghicesti doua carti, acestea vor disparea, pe pozitiile lor aparand -1");
//		System.out.println("may the odds be ever in your favor! :)");
//
//	}
//
//	public static void main(String[] args) {
//		System.out.println();
//		createMatrix();
//		showMatrix();
//		play();
//		System.out.println("Jocul s-a terminat dupa " + count + " miscari");
//	}
//
//	public static void createMatrix() {
//
//		for (int i = 0; i < mahjongMatrix.length; i++) {
//			mahjongMatrix[0][i] = i;
//			mahjongMatrix[i][0] = i;
//		}
//		shuflleMatrix();
//	}
//
//	public static void showMatrix() {
//		for (int i = 0; i < mahjongMatrix.length; i++) {
//			for (int j = 0; j < mahjongMatrix[i].length; j++) {
//				if (mahjongMatrix[i][j] >= 10) {
//					System.out.print(0 + "  ");
//				} else if (mahjongMatrix[i][j] != -1) {
//					System.out.print(mahjongMatrix[i][j] + "  ");
//				} else {
//					System.out.print(-1 + " ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//
//	public static void shuflleMatrix() {
//		for (int i = 1; i < mahjongMatrix.length / 2 + 1; i++) {
//			for (int j = 1; j < mahjongMatrix[i].length; j++) {
//				mahjongMatrix[i][j] = mahjongMatrix[i][j - 1] + 10 + 1;
//				mahjongMatrix[i + 3][j] = mahjongMatrix[i][j - 1] + 10 + 1;
//			}
//		}
//		// Collections.shuffle(Arrays.asList(mahjongMatrix));
//	}
//
//	public static void play() {
//
//		while (noOfPairs != 0) {
//			int[] a = getCoordinates();
//			int[] b = getCoordinates();
//			if (mahjongMatrix[a[0]][a[1]] == mahjongMatrix[b[0]][b[1]]) {
//				mahjongMatrix[a[0]][a[1]] = -1;
//				mahjongMatrix[b[0]][b[1]] = -1;
//				noOfPairs--;
//				System.out.println(" Bravo! Ai gasit o pereche! Mai sunt" + noOfPairs);
//			} else {
//				System.out.println("perechea introdusa nu este corecta :( mai incearca");
//			}
//			showMatrix();
//			count++;
//		}
//	}
//
//	public static int[] getCoordinates() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" introdu coordonata x");
//		int[] a = new int[2];
//		a[0] = sc.nextInt();
//		System.out.println(" introdu coordonata y");
//		a[1] = sc.nextInt();
//
//		return a;
//	}
//}
