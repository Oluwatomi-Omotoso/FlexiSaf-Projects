// Outer class representing the Task Manager
public class TaskManager {
    // Private inner class representing a Task
    private class Task {
        private String description;
        private boolean completed;

        public Task(String description) {
            this.description = description;
            this.completed = false;
        }

        public void markComplete() {
            this.completed = true;
            logAction(new Action() {
                @Override
                public void execute() {
                    System.out.println("Task '" + description + "' marked as complete.");
                }
            });
        }

        public String getDescription() {
            return description;
        }

        public boolean isCompleted() {
            return completed;
        }
    }

    // Static nested class for logging actions
    public static class Logger {
        public static void log(String message) {
            System.out.println("[LOG] " + message);
        }
    }

    // Interface for actions (used for anonymous class)
    public interface Action {
        void execute();
    }

    // Method to log actions using Action interface
    private void logAction(Action action) {
        action.execute();
        Logger.log("Action executed.");
    }

    // Public method to create and complete a task
    public void createAndCompleteTask(String desc) {
        Task task = new Task(desc);
        System.out.println("Created task: " + task.getDescription());
        task.markComplete();
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.createAndCompleteTask("Submit internship deliverable");
    }
}
