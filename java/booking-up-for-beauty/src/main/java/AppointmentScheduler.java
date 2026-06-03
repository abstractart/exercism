import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.String.format;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayWeek = appointmentDate.getDayOfWeek().toString().toLowerCase();
        dayWeek = dayWeek.substring(0, 1).toUpperCase() + dayWeek.substring(1);

        String month = appointmentDate.getMonth().toString().toLowerCase();
        month = month.substring(0, 1).toUpperCase() + month.substring(1);

        return format(
                "You have an appointment on %s, %s %d, %d, at %d:%02d %s.",
                dayWeek,
                month,
                appointmentDate.getDayOfMonth(),
                appointmentDate.getYear(),
                appointmentDate.getHour() > 12 ? appointmentDate.getHour() % 12 : appointmentDate.getHour(),
                appointmentDate.getMinute(),
                appointmentDate.getHour() > 12 ? "PM" : "AM"
        );
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
