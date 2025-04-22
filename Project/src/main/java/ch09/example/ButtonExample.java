package ch09.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ButtonExample extends JFrame {
    // 필드 - UI 컴포넌트 선언
    private JTextField messegeField; // == input 태그 유사;
    private JButton sendButton; // button 유사

    /* 중첩 인터페이스 선언 */
    public  interface MessaageHandler {
        /**
         * 메시지를 처리하는 메서드
          */
        void printMessage(String message);
    }

    // 기본 생성자
    public ButtonExample(){
        // 기본 JFrame 설정
        setTitle("중첩 클래스, 익명 객체 예제");
        setSize(400, 100);
        setLocationRelativeTo(null); // 화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 버튼
        setLayout(new FlowLayout()); //가로로 흘러가는

        //UI 컴포넌트 초기화
        messegeField = new JTextField(20);
        sendButton = new JButton("콘솔에 출력");

        add(new JLabel("메시지: "));
        add(messegeField);
        add(sendButton);

        /**
         * 중첩 인터페이스를 익명 내부 클래스를 이용해서 구현
         */
        // 하나의 내부 인터페이스를 2가지 방법으로 구현
        MessaageHandler handlerA = new MessaageHandler() {
            @Override
            public void printMessage(String message) {
                System.out.println("메시지 = " + message);
            }
        };

        MessaageHandler handlerB = new MessaageHandler() {
            public void printMessage(String message) {
                // 현재 시간 + message
                String currentTime = LocalDateTime.now().format(
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                );
                System.out.printf("[%s] %s \n", currentTime, message);
            }

        };

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField에 작성된 값 얻어오기
                String message = messegeField.getText();

                if(message.isEmpty()){ // 미작성 시
                    // HTML alert() 와 비슷
                    JOptionPane.showMessageDialog(ButtonExample.this, "전송할 메시지를 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    // 메시지 입력 시
                    // 중첩 인터페이스를 구현한 방법을 이용해서 message 출력
                    handlerA.printMessage(message);
                    handlerB.printMessage(message);

                    // 메시지 필드 초기회
                    messegeField.setText("");
                }
            }
        });
    }
}
