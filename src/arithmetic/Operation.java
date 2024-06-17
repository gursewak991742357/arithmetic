package arithmetic;

public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    public static Operation fromString(String operation) {
        switch (operation.toUpperCase()) {
            case "PLUS":
                return PLUS;
            case "MINUS":
                return MINUS;
            case "TIMES":
                return TIMES;
            case "DIVIDE":
                return DIVIDE;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
