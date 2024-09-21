package ponomarenko;

import java.util.ArrayList;
import java.util.List;

class ScheduleManager {
    private List<Schedule> schedules;

    public ScheduleManager() {
        schedules = new ArrayList<>();
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void displaySchedules() {
        for (Schedule schedule : schedules) {
            System.out.println(schedule);
        }
    }
}

