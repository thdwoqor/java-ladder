package controller;

import domain.*;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        Users usersName = settingUsers();
        Item item = new Item(inputView.inputResult(),usersName.getCount());
        Ladders ladders = new Ladders(usersName.getCount(),settingHeight(), new RandomGenerator());

        outputView.printUsers(usersName);
        outputView.printLadders(ladders);
    }

    private Users settingUsers() {
        try {
            List<String> userNames = inputView.inputUsername();
            return new Users(makeUsers(userNames));
        } catch (IllegalArgumentException e) {
            outputView.printExceptionMessage(e.getMessage());
            return settingUsers();
        }
    }

    private List<User> makeUsers(List<String> userNames) {
        return userNames.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    private Height settingHeight() {
        try {
            int height = inputView.inputLadderHeight();
            return new Height(height);
        } catch (IllegalArgumentException e) {
            outputView.printExceptionMessage(e.getMessage());
            return settingHeight();
        }
    }
}
