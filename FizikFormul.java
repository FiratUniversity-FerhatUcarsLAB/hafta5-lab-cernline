/*
 * Ad Soyad: Ceren Çam
 * Ogrenci No: 250541073
 * Tarih: 13.11.2025
 * Aciklama: Görev 2 - Fizik Formül Asistanı
 * 
 * Bu program temel fizik formullerini kullanarak
 * hiz, ivme, kuvvet, is, guc, enerji ve momentum hesaplamalari yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    public static double calculatePower(double work, double time) {
        return work / time;
    }

    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double GRAVITY = 9.8;

        System.out.println("=== FIZIK FORMUL ASISTANI ===");

        System.out.print("\nKutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double velocityChange = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        double velocity = calculateVelocity(distance, time);
        double acceleration = calculateAcceleration(velocityChange, time);
        double force = calculateForce(mass, acceleration);
        double work = calculateWork(force, distance);
        double power = calculatePower(work, time);
        double kinetic = calculateKineticEnergy(mass, velocity);
        double potential = calculatePotentialEnergy(mass, GRAVITY, height);
        double totalEnergy = kinetic + potential;
        double momentum = calculateMomentum(mass, velocity);

        System.out.printf("\nHIZ ve HAREKET:\n  Hiz (v = s/t)      : %.2f m/s\n  Ivme (a = Δv/t)    : %.2f m/s²\n",
                velocity, acceleration);

        System.out.printf("\nKUVVET ve IS:\n  Kuvvet (F = m*a)   : %.2f N\n  Is (W = F*d)       : %.2f J\n  Guc (P = W/t)      : %.2f W\n",
                force, work, power);

        System.out.printf("\nENERJI:\n  Kinetik Enerji (KE): %.2f J\n  Potansiyel Enerji (PE): %.2f J\n  Toplam Enerji      : %.2f J\n",
                kinetic, potential, totalEnergy);

        System.out.printf("\nMOMENTUM:\n  Momentum (p = m*v) : %.2f kg·m/s\n", momentum);

        System.out.println("========================================");

        input.close();
    }
}
