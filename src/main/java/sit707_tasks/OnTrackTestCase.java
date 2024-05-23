package sit707_tasks;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OnTrackTestCase {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date deadline = dateFormat.parse("2024-05-23 23:59:59");

            // Test Case 1: Meets requirements, 0% plagiarism, before deadline
            Date submissionTime1 = dateFormat.parse("2024-05-22 12:00:00");
            AssessmentSubmission submission1 = new AssessmentSubmission(0, true, submissionTime1, deadline);
            System.out.println(submission1.upload());

            // Test Case 2: Does not meet requirements, 0% plagiarism, before deadline
            Date submissionTime2 = dateFormat.parse("2024-05-22 12:00:00");
            AssessmentSubmission submission2 = new AssessmentSubmission(0, false, submissionTime2, deadline);
            System.out.println(submission2.upload());

            // Test Case 3: Meets requirements, some plagiarism, after deadline
            Date submissionTime3 = dateFormat.parse("2024-05-24 12:00:00");
            AssessmentSubmission submission3 = new AssessmentSubmission(20, true, submissionTime3, deadline);
            System.out.println(submission3.upload());

            // Test Case 4: Does not meet requirements, some plagiarism, after deadline
            Date submissionTime4 = dateFormat.parse("2024-05-24 12:00:00");
            AssessmentSubmission submission4 = new AssessmentSubmission(40, false, submissionTime4, deadline);
            System.out.println(submission4.upload());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
