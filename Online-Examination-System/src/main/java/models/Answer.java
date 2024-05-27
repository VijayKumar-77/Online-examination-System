package models;

public class Answer {
	 	private Long id;
	    private Question question;
	    private Option chosenOption;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Question getQuestion() {
			return question;
		}
		public void setQuestion(Question question) {
			this.question = question;
		}
		public Option getChosenOption() {
			return chosenOption;
		}
		public void setChosenOption(Option chosenOption) {
			this.chosenOption = chosenOption;
		}
}
