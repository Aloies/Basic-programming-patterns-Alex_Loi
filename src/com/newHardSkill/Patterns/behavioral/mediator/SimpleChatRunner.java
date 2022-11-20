package com.newHardSkill.Patterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat, "Alex_Loi");
        User user2 = new SimpleUser(chat, "Alex_Frost");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello world!!!");

        admin.sendMessage("Hello, i'm Admin");
    }
}
