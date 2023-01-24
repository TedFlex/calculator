import javax.swing.*;
import javax.swing.text.StringContent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main extends JFrame implements ActionListener {
    int a;
    JButton add;
    JTextField jtf;
    public static void main(String[] args) {
        // write your code here
        Main main=new Main();
        main.setSize(500,500);
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.setLayout(null);
        main.add=new JButton("add");
        main.add.setBounds(100,300,70,30);
        main.jtf=new JTextField();
        main.jtf.setBounds(150,100,100,40);
        main.add(main.jtf);
        main.add.addActionListener(main);
        main.add(main.add);
        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            String a=jtf.getText();
            int[]indices=new int[10];
            char [] ops=new char[5];
            String [] digits=a.split("\\+");
            System.out.println(Arrays.toString(digits));
//            StringCharacterIterator object=new StringCharacterIterator(a);
////    for (int i = object.getBeginIndex(); i<object.getEndIndex()-1 ; i++) {
//            if (object.current()=='+'){
//                System.out.println("hadddddd");
//            }
//            int i=0;
//            boolean flag=true;
//            while(i<object.getEndIndex()+1){
//                if (flag){
//                    System.out.println(object.current());
//                    flag=false;
//                }
//                System.out.println(object.next());
//                switch (object.next()){
//                    case '+':
//                        indices[i]=object.getIndex()+1;
//                        ops[i]=object.next();
//                    case '-':
//                        indices[i]= object.getIndex()+1;
//                }
//                i++;
//            }
//            String left = null;
//            boolean anotherflag=true;
//            for (int j = 0; j < indices[0]; j++) {
//                if (anotherflag){
//                    left+=object.current();
//                    anotherflag=false;
//                }
//                left+=object.next();
//            }
//            System.out.println(left);
////    }
//            StringTokenizer objj=new StringTokenizer(jtf.getText());
//            if (objj.nextElement()== "+"){
//                System.out.println("hah");
//            }
//    obj.getChars(1,3,Character);
        }
    }
}