package services;

import entity.Questions;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Questions> getAllQuestions();
    Optional<Questions> getQuestionById(Long id);
    Questions addQuestion(Questions Questions);
    Questions updateQuestion(Long id , Questions Questions);
    void deleteQuestion(Long id);
}
