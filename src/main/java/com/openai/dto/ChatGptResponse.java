package com.openai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class ChatGptResponse {

    private List<Choice> choices;
    
    

    @Override
	public String toString() {
		return "ChatGptResponse [choices=" + choices + "]";
	}



	public List<Choice> getChoices() {
		return choices;
	}



	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}



	public ChatGptResponse(List<Choice> choices) {
		super();
		this.choices = choices;
	}



	public ChatGptResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	
    public static class Choice {

        private int index;
        private Message message;
		public Choice() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Choice(int index, Message message) {
			super();
			this.index = index;
			this.message = message;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public Message getMessage() {
			return message;
		}
		public void setMessage(Message message) {
			this.message = message;
		}
		@Override
		public String toString() {
			return "Choice [index=" + index + ", message=" + message + "]";
		}
        
        

    }

}
