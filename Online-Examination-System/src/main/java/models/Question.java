package models;

import java.util.List;

public class Question {
	private Long id;
    private String text;
    private List<Option> options;
    private Option correctOption;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public Option getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(Option correctOption) {
		this.correctOption = correctOption;
	}
}
