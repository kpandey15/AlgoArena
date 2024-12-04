package controller;

import entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.QuestionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public List<Questions> getAllQuestions() {
        return questionService.getAllQuestions();
    }
    @GetMapping("/{id}")
    public Optional<Questions> getQuestionById(@PathVariable Long id) {
        // path variable is send in api only like --> /
        return questionService.getQuestionById(id);
    }
    @PostMapping("/addQuestion")
    public Questions addQuestion(@RequestBody Questions question){
        return questionService.addQuestion(question);
    }

    @PutMapping("/updateQuestion/{id}")
    public Questions updateQuestion(@PathVariable Long id , @RequestBody Questions question){
        return questionService.updateQuestion(id , question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id ){
        questionService.deleteQuestion(id);
    }

}
