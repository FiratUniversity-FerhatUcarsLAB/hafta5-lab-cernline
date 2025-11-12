/*
 * Ad Soyad: Ceren Çam
 * Ogrenci No: 250541073
 * Tarih: 12.11.2025
 * Aciklama: Görev 1 - Geometrik Şekil Hesaplayıcı
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarrini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // 1. Kare alanı
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // 2. Kare çevresi
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // 3. Dikdörtgen alanı
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // 4. Dikdörtgen çevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // 5. Daire alanı
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // 6. Daire çevresi
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // 7. Üçgen alanı
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    // 8. Üçgen çevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");

        System.out.print("\nKARE:\nKenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();

        System.out.print("\nDIKDORTGEN:\nKisa kenar (cm): ");
        double rectShort = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectLong = input.nextDouble();

        System.out.print("\nDAIRE:\nYaricap (cm): ");
        double circleRadius = input.nextDouble();

        System.out.print("\nUCGEN:\nTaban (cm): ");
        double triBase = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double triHeight = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double triA = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double triB = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double triC = input.nextDouble();

        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.2f cm):\n  Alan  : %.2f cm²\n  Cevre : %.2f cm\n",
                squareSide, calculateSquareArea(squareSide), calculateSquarePerimeter(squareSide));

        System.out.printf("\nDIKDORTGEN (%.2f x %.2f cm):\n  Alan  : %.2f cm²\n  Cevre : %.2f cm\n",
                rectShort, rectLong, calculateRectangleArea(rectShort, rectLong),
                calculateRectanglePerimeter(rectShort, rectLong));

        System.out.printf("\nDAIRE (yaricap: %.2f cm):\n  Alan  : %.2f cm²\n  Cevre : %.2f cm\n",
                circleRadius, calculateCircleArea(circleRadius), calculateCircleCircumference(circleRadius));

        System.out.printf("\nUCGEN (taban: %.2f, yukseklik: %.2f cm):\n  Alan  : %.2f cm²\n  Cevre : %.2f cm\n",
                triBase, triHeight, calculateTriangleArea(triBase, triHeight),
                calculateTrianglePerimeter(triA, triB, triC));

        System.out.println("========================================");

        input.close();
    }
}
