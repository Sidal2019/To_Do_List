import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TaskManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagementSystemApplication.class, args);
    }
}

class Task {
    private String name;
    private String deadline;
    private String priority;
    private String label;

    public Task(String name, String deadline, String priority, String label) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
        this.label = label;
    }

    // Add getters and setters as needed
}

@RestController
class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Design website layout", "2023-10-20", "High", "Design"));
        tasks.add(new Task("Implement user authentication", "2023-10-25", "Medium", "Development"));
        tasks.add(new Task("Optimize website performance", "2023-10-30", "High", "Performance"));
        // Add more tasks as needed
        return tasks;
    }
}
