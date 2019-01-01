package cn.edu.nju.software.judge.beans;

import java.io.Serializable;

public class Custominput implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _custominput.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer submissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _custominput.input_text
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String inputText;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _custominput
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _custominput.submission_id
     *
     * @return the value of _custominput.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSubmissionId() {
        return submissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _custominput.submission_id
     *
     * @param submissionId the value for _custominput.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _custominput.input_text
     *
     * @return the value of _custominput.input_text
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getInputText() {
        return inputText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _custominput.input_text
     *
     * @param inputText the value for _custominput.input_text
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _custominput
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Custominput other = (Custominput) that;
        return (this.getSubmissionId() == null ? other.getSubmissionId() == null : this.getSubmissionId().equals(other.getSubmissionId()))
            && (this.getInputText() == null ? other.getInputText() == null : this.getInputText().equals(other.getInputText()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _custominput
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubmissionId() == null) ? 0 : getSubmissionId().hashCode());
        result = prime * result + ((getInputText() == null) ? 0 : getInputText().hashCode());
        return result;
    }
}