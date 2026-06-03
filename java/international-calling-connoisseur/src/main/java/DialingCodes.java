import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> dialogCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialogCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialogCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialogCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialogCodes.containsKey(code)) {
            if (findDialingCode(country) == null) {
                setDialingCode(code, country);
            }
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialogCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if (oldCode != null) {
            dialogCodes.remove(oldCode);
            setDialingCode(code, country);
        }
    }
}
