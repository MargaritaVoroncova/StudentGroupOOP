package terminal.executable;

import terminal.Command;

public interface CommandExecutableFactory {
    CreateStudentExecutable command(Command command);
}