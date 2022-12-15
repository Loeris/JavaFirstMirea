package ru.mirea.task6.subtask1;

public interface INameable {
    public default String getName() {
        return this.getClass().getSimpleName();
    }
}
