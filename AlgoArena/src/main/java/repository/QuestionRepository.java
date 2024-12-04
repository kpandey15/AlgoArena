package repository;

import entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Questions , Long> {
    // long --> because primary key is id which is long
}
