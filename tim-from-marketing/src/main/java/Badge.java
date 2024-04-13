import java.text.MessageFormat;

class Badge {
    public String print(Integer id, String name, String department) {
	return MessageFormat.format("{0}{1}{2}", formatId(id), formatName(name), formatDepartment(department));
    }

    private String formatId(Integer id) {
	return id == null ? "" : MessageFormat.format("[{0}] - ", id);
    }

    private String formatName(String name) {return name;};

    private String formatDepartment(String department) {
	return department == null ? " - OWNER" : MessageFormat.format(" - {0}", department.toUpperCase());
    }
}
