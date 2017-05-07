package pl.laszkiewicz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.laszkiewicz.model.Task;
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
