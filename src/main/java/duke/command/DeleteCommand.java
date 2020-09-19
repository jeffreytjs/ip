package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;
//import duke.util.Helper;

public class DeleteCommand extends Command {
    private int taskIndex;
    public DeleteCommand(int taskIndex) {
            super();
            this.taskIndex = taskIndex;
        }

    @Override
    public void execute(Ui ui, Storage storage, TaskList tasks) {
            Task removedTask = tasks.get(this.taskIndex - 1);
            tasks.removeTask(this.taskIndex - 1);
            storage.saveData(tasks.getTasks());
            ui.taskDeleted(removedTask, tasks);
    }
}
