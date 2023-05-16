package core.basesyntax.service.serviceimpl;

import core.basesyntax.service.ReportCreator;
import java.util.Map;

public class ReportCreatorImpl implements ReportCreator {
    public static final String FIRST_LINE_OF_REPORT = "fruit,quantity";

    @Override
    public String createReport(Map<String, Integer> fruits) {
        StringBuilder report = new StringBuilder(FIRST_LINE_OF_REPORT);
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            report.append(System.lineSeparator())
                    .append(entry.getKey()).append(",").append(entry.getValue());
        }
        return report.toString();
    }
}
