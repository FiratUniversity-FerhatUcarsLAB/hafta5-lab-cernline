/*
 * Ad Soyad: Ceren Çam
 * Ogrenci No: 250541073
 * Tarih: 13.11.2025
 * Aciklama: Görev 3 - E-Ticaret Sepet Hesaplayıcı
 * 
 * Bu program 3 urunun fiyat ve adet bilgilerini alip
 * ara toplam, indirim, KDV ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    public static double calculateLineTotal(double price, int quantity) {
        return price * quantity;
    }

    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100);
    }

    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double VAT_RATE = 0.18;
        final double SHIPPING_FEE = 29.99;

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");

        System.out.print("\nURUN 1 - Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("URUN 1 - Adet: ");
        int qty1 = input.nextInt();

        System.out.print("\nURUN 2 - Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("URUN 2 - Adet: ");
        int qty2 = input.nextInt();

        System.out.print("\nURUN 3 - Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("URUN 3 - Adet: ");
        int qty3 = input.nextInt();

        System.out.print("\nIndirim Kuponu Yuzdesi (%): ");
        double discountPercent = input.nextDouble();

        double line1 = calculateLineTotal(price1, qty1);
        double line2 = calculateLineTotal(price2, qty2);
        double line3 = calculateLineTotal(price3, qty3);
        double subtotal = calculateSubtotal(line1, line2, line3);
        double discountAmount = calculateDiscountAmount(subtotal, discountPercent);
        double discountedTotal = applyDiscount(subtotal, discountAmount);
        double vat = calculateVAT(discountedTotal, VAT_RATE);
        double grandTotal = calculateGrandTotal(discountedTotal, vat, SHIPPING_FEE);

        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3);

        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                 : %.2f TL\n", subtotal);
        System.out.printf("Indirim Tutari (%%% .0f)      : -%.2f TL\n", discountPercent, discountAmount);
        System.out.printf("Indirimli Toplam           : %.2f TL\n", discountedTotal);
        System.out.printf("KDV Tutari (%%18)           : +%.2f TL\n", vat);
        System.out.printf("Kargo Ucreti               : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM               : %.2f TL\n", grandTotal);
        System.out.println("========================================");

        input.close();
    }
}
