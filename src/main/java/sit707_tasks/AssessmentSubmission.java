package sit707_tasks;

import java.util.Date;

public class AssessmentSubmission {
    private int plagiarismLevel;
    private boolean meetsRequirements;
    private Date submissionTime;
    private Date deadline;

    public AssessmentSubmission(int plagiarismLevel, boolean meetsRequirements, Date submissionTime, Date deadline) {
        this.plagiarismLevel = plagiarismLevel;
        this.meetsRequirements = meetsRequirements;
        this.submissionTime = submissionTime;
        this.deadline = deadline;
    }

    public int checkPlagiarism() {
        return plagiarismLevel;
    }

    public boolean checkRequirements() {
        return meetsRequirements;
    }

    public boolean checkDeadline() {
        return submissionTime.before(deadline) || submissionTime.equals(deadline);
    }

    public String upload() {
        if (checkDeadline()) {
            if (checkRequirements()) {
                return "Upload accepted. Plagiarism: " + plagiarismLevel + "%. Meets requirements: Yes. Submitted before deadline.";
            } else {
                return "Upload accepted. Plagiarism: " + plagiarismLevel + "%. Meets requirements: No. Submitted before deadline.";
            }
        } else {
            if (checkRequirements()) {
                return "Upload accepted. Plagiarism: " + plagiarismLevel + "%. Meets requirements: Yes. Submitted after deadline.";
            } else {
                return "Upload accepted. Plagiarism: " + plagiarismLevel + "%. Meets requirements: No. Submitted after deadline.";
            }
        }
    }
}
