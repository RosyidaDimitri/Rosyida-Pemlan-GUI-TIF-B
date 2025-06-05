package screentime;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rosyida
 */
    public class Tracker {
        private List<Activity> activities;
        private int dailyTarget;
        private int totalTime;

        public Tracker() {
            activities = new ArrayList<>();
            totalTime = 0;
        }

        public void addActivity(Activity activity) {
            activities.add(activity);
            totalTime += activity.getDuration();
        }

        public int getTotalTime() {
            return totalTime;
        }

        public void setDailyTarget(int target) {
            this.dailyTarget = target;
        }

        public int getDailyTarget() {
            return dailyTarget;
        }

        public float getProgress() {
            return dailyTarget > 0 ? (float) totalTime / dailyTarget * 100 : 0;
        }

        public List<Activity> getActivities() {
            return activities;
        }

    void updateActivities(List<Activity> activities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
