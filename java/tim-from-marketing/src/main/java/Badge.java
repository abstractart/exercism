class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder builder = new StringBuilder();

        if (id != null) {
            builder.append("[").append(id).append("] - ");
        }
        builder.append(name).append(" - ");

        if (department == null) {
            department = "OWNER";
        }

        builder.append(department.toUpperCase());
        return builder.toString();
    }
}
