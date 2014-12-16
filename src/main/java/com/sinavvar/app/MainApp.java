package com.sinavvar.app;

import com.sinavvar.domain.Question;

public class MainApp {

    public static void main(String[] args) {
        
        System.out.println("Haydi bismilla...");

        Question question = new Question();
        question.setQuestion("What's the result of 2+2?");
        question.setAnswer("4");

        System.out.println(question.getQuestion());
        System.out.println(question.getAnswer());
        
    }

}
