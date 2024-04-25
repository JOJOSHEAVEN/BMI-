package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BMIService {

    public String calculateBMI(String gender, double weight, double height) {
        double bmi = calculateBodyMassIndex(weight, height);
        String formattedBMI = String.format("%.2f", bmi); // Formatieren auf zwei Nachkommastellen
        String interpretation = interpretBMI(gender, bmi);
        return "BMI: " + formattedBMI + ", Interpretation: " + interpretation;
    }

    private double calculateBodyMassIndex(double weight, double height) {
        return weight / (height * height);
    }

    private String interpretBMI(String gender, double bmi) {
        if (gender.equalsIgnoreCase("male")) {
            if (bmi <= 18.5) {
                return "Underweight, your personal trainingplan is:\\r\\n" + //
                        "Total body strength training (2-3 times a week):\r\n" + //
                        "Squats: 3 sets x 8-12 reps\r\n" + //
                        "Deadlift: 3 sets x 8-12 reps\r\n" + //
                        "Bench press: 3 sets x 8-12 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 3 sets x 8-12 reps\r\n" + //
                        "Shoulder press: 3 sets x 8-12 reps\r\n" + //
                        "Rowing: 3 sets x 8-12 reps";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                return "Normalweight, your personal trainingplan is:\\\\r\\\\n" + //
                        "Bench press (3 times a week with maximumweight):\r\n" + //
                        "Rowing: 4 sets x 10-12 reps\r\n" + //
                        "Shoulder press: 4 sets x 10-12 reps\r\n" + //
                        "Cardio: 3 times a week for 10 minutes\r\n" + //
                        "Pushups: 30 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 6 sets x 12-16 reps\r\n" + //
                        "Hammercurls: 3 sets x 10-12 reps";
            } else if (bmi >= 25 && bmi <= 29.9) {
                return "Overweight, your personal trainingplan is:\\\\r\\\\n" + //
                        "Cardio (4 times a week with maximumweight):\r\n" + //
                        "Rowing: 4 sets x 12-16 reps\r\n" + //
                        "Shoulder press: 4 sets x 12-16 reps\r\n" + //
                        "Cardio: 4 times a week for 20 minutes\r\n" + //
                        "Push-ups: 30 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 6 Sets x 12-16 reps\r\n" + //
                        "Hammercurls: 3 sets x 12-16 reps";
            } else {
                return "Obese, your personal trainingplan is\\\\r\\\\n" + //
                        "Cardio (4 times a week with maximumweight):\r\n" + //
                        "Rowing: 4 sets x 12-16 reps\r\n" + //
                        "Shoulder press: 4 sets x 12-16 reps\r\n" + //
                        "Cardio: 4 times a week for 20 minutes\r\n" + //
                        "Push-ups: 30 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 6 sets x 12-16 reps\r\n" + //
                        "Hammercurls: 3 sets x 12-16 reps";

                // Trainingsplan für Frauen
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (bmi <= 18.5) {
                return "Untergewichtig, your personal trainingplan is\\r\\n" + //
                        "Total body strength training (2-3 times a week):\r\n" + //
                        "Squats: 2 sets x 8-12 reps\r\n" + //
                        "Deadlift: 2 sets x 8-12 reps\r\n" + //
                        "Bench press: 2 sets x 8-12 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 3 sets x 8-10 reps\r\n" + //
                        "Shoulder press: 3 sets x 8-10 reps\r\n" + //
                        "Rowing: 2 sets x 8-12 reps";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                return "Normalweight, your personal trainingplan is\\\\r\\\\n" + //
                        "Bench press (2 times a week with maximumweight):\r\n" + //
                        "Rowing: 2 sets x 10-12 reps\r\n" + //
                        "Shoulder press: 3 sets x 10-12 reps\r\n" + //
                        "Cardio: 1 times a week for 10 minutes\r\n" + //
                        "Pushups: 30 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 6 sets x 8-10 reps\r\n" + //
                        "Hammercurls: 3 sets x 8-10 reps";
            } else if (bmi >= 25 && bmi <= 29.9) {
                return "Overweight, your personal trainingplan is\\\\r\\\\n" + //
                        "Cardio (4 times a week for 20 minutes\r\n" + //
                        "Rowing: 4 sets x 8-10 reps\r\n" + //
                        "Shoulder press: 2 sets x 8-10 reps\r\n" + //
                        "Push-ups: 20 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 4 Sets x 8-10 reps\r\n" + //
                        "Hammercurls: 2 sets x 8-10 reps";
            } else {
                return "Obese, your personal trainingplan is\\\\r\\\\n" + //
                        "Rowing: 4 sets x 12-16 reps\r\n" + //
                        "Shoulder press: 2 sets x 12-16 reps\r\n" + //
                        "Cardio: 4 times a week for 30 minutes\r\n" + //
                        "Push-ups: 20 reps\r\n" + //
                        "Pull-ups or lat pulldown machines: 4 sets x 12-16 reps\r\n" + //
                        "Hammercurls: 2 sets x 12-16 reps";
            }
        }
        return gender;
    }
}
