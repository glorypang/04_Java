package ch09.example;

import javax.swing.*;

public class ButtonMain {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 애플리케이션 실행
                new ButtonExample().setVisible(true);
            }
        });
    }
}
