package serviceImpl;

import entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.QuestionRepository;
import services.QuestionService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Questions> getAllQuestions(){
        return questionRepository.findAll();
    }

    @Override
    public Optional<Questions> getQuestionById(Long id){
        return questionRepository.findById(id);
    }

    @Override
    public Questions addQuestion(Questions question){
        return questionRepository.save(question);
    }

    @Override
    public Questions updateQuestion(Long id, Questions updatedQuestion) {
        if (questionRepository.existsById(id)) {
            updatedQuestion.setId(id); // to be sure we are using same id which we ARE CHECKING IF it exists in db
            return questionRepository.save(updatedQuestion);
        } else{
            throw new RuntimeException("Question not found");
        }
    }

    @Override
    public void deleteQuestion(Long id) {
        if (questionRepository.existsById(id)) {
            questionRepository.deleteById(id);
        } else {
            throw new RuntimeException("Question not found");
        }
    }

}
