import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.MessageFormat;
import java.time.Month;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
	return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
	var now = LocalDateTime.now();
	return now.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
	var hour = appointmentDate.getHour();
	return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
	var dayOfWeek = appointmentDate.getDayOfWeek().toString();
	var dayOfWeekString = capitalize(dayOfWeek);
	var nameOfMonth = capitalize(appointmentDate.getMonth().toString());
	var day = appointmentDate.getDayOfMonth();
	var year = appointmentDate.getYear();
	var appointTime = formatTime(appointmentDate);
	return MessageFormat.format(
				    "You have an appointment on {0}, {1} {2}, {3,number,#}, at {4}.",
				       dayOfWeekString,
				       nameOfMonth,
				       day,
				       year,
				       appointTime		       
				       );
    }

    public LocalDate getAnniversaryDate() {
	return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
    }

    private String capitalize(String value) {
	value = value.toLowerCase();
	return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    private String formatTime(LocalDateTime dateTime) {
	var hour = dateTime.getHour();
	var hourFormatted = hour > 12 ? hour - 12 : hour;
	var minute = fillMinutes(dateTime.getMinute());
	var pmOrAm = dateTime.getHour() >= 12 ? "PM": "AM";
	return MessageFormat.format("{0}:{1} {2}", hourFormatted, minute, pmOrAm);
    }

    private String fillMinutes(int minute) {
	return minute <= 9 ? "0" + minute : String.valueOf(minute);
    }
}
