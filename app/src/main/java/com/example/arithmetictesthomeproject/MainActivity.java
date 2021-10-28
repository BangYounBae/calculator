package com.example.arithmetictesthomeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num1,num2,num3;
    int operator1;
    int operator2;
    int Bracket;
    int ans,user_ans;
    int sel1,sel2,sel3;
    int user_sel1,user_sel2,user_sel3;
    final Random myRandom = new Random();
    private TextView Num1,Num2,Num3,Op1,Op2,Ans,Log,Log2;
    private RadioButton Plus,Minus,Multi,Plus2,Minus2,Multi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = (TextView)findViewById(R.id.num1);
        Num2 = (TextView)findViewById(R.id.num2);
        Num3 = (TextView)findViewById(R.id.num3);
        Op1 = (TextView)findViewById(R.id.op1);
        Op2 = (TextView)findViewById(R.id.op2);
        Ans = (TextView)findViewById(R.id.ans);
        Log = (TextView)findViewById(R.id.log);
        Log2 = (TextView)findViewById(R.id.log2);

        Plus =(RadioButton)findViewById(R.id.plus);
        Minus =(RadioButton)findViewById(R.id.minus);
        Multi =(RadioButton)findViewById(R.id.multi);
        Plus2 =(RadioButton)findViewById(R.id.plus2);
        Minus2 =(RadioButton)findViewById(R.id.minus2);
        Multi2 =(RadioButton)findViewById(R.id.multi2);


    }
    public void click_generate(View view){
        num1 = myRandom.nextInt(10);
        num2 = myRandom.nextInt(10);
        num3 = myRandom.nextInt(10);
        Bracket = myRandom.nextInt(3);
        operator1 = myRandom.nextInt(3);
        operator2 = myRandom.nextInt(3);
        Num1.setText(String.valueOf(num1));
        Num2.setText(String.valueOf(num2));
        Num3.setText(String.valueOf(num3));
        Op1.setText("");
        Op2.setText("");
        user_sel3 = 3;
        Plus.setChecked(false);
        Minus.setChecked(false);
        Multi.setChecked(false);
        Plus2.setChecked(false);
        Minus2.setChecked(false);
        Multi2.setChecked(false);
        if(Bracket == 0){
            sel3 = 3;
            if(operator1 == 0)
            {
                sel1 = 0;
                if(operator2 == 0){
                    ans = num1 + num2 + num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = num1 + num2 - num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 =1;
                }
                else if(operator2 == 2){
                    ans = num1 + num2 *num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }
            }
            else if(operator1 == 1){
                sel1 = 1;
                if(operator2 == 0){
                    ans = num1 - num2 + num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = num1 - num2 - num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = num1 - num2 *num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }

            }
            else if(operator1 == 2){
                sel1 =2;
                if(operator2 == 0){
                    ans = num1 * num2 + num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = num1 * num2 - num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = num1 * num2 *num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }
            }

        }
        else if(Bracket == 1){
            sel3 =1;
            if(operator1 == 0)
            {
                sel1 = 0;
                if(operator2 == 0){
                    ans = (num1 + num2) + num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = (num1 + num2) - num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = (num1 + num2) *num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }
            }
            else if(operator1 == 1){
                sel1 = 1;
                if(operator2 == 0){
                    ans = (num1 - num2) + num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 =0;
                }
                else if(operator2 == 1){
                    ans = (num1 - num2) - num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 =1;
                }
                else if(operator2 == 2){
                    ans = (num1 - num2) *num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }

            }
            else if(operator1 == 2){
                sel1 = 2;
                if(operator2 == 0){
                    ans = (num1 * num2) + num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = (num1 * num2) - num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = (num1 * num2) *num3;
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }
            }

        }
        else if(Bracket == 2){
            sel3 =2;
            if(operator1 == 0)
            {
                sel1 = 0;
                if(operator2 == 0){
                    ans = num1 + (num2 + num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = num1 + (num2 - num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = num1 + (num2 *num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }
            }
            else if(operator1 == 1){
                sel1 = 1;
                if(operator2 == 0){
                    ans = num1 - (num2 + num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = num1 - (num2 - num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = num1 - (num2 *num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }

            }
            else if(operator1 == 2){
                sel1 =2;
                if(operator2 == 0){
                    ans = num1 * (num2 + num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 0;
                }
                else if(operator2 == 1){
                    ans = num1 * (num2 - num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 1;
                }
                else if(operator2 == 2){
                    ans = num1 * (num2 *num3);
                    Ans.setText(String.valueOf(ans));
                    sel2 = 2;
                }
            }
        }
        Log.setText("Log: br"+String.valueOf(sel3)+":oper"+String.valueOf(operator1)+","+String.valueOf(operator2));
    }
    public void click_plus(View view){
        user_sel1 = 0;
        Minus.setChecked(false);
        Multi.setChecked(false);
        Op1.setText("+");

    }
    public  void click_minus(View view){
        user_sel1 = 1;
        Plus.setChecked(false);
        Multi.setChecked(false);
        Op1.setText("-");
    }
    public void click_multi(View view){
        user_sel1 = 2;
        Plus.setChecked(false);
        Minus.setChecked(false);
        Op1.setText("*");
    }
    public void click_plus2(View view){
        user_sel2 = 0;
        Minus2.setChecked(false);
        Multi2.setChecked(false);
        Op2.setText("+");

    }
    public  void click_minus2(View view){
        user_sel2 = 1;
        Plus2.setChecked(false);
        Multi2.setChecked(false);
        Op2.setText("-");
    }
    public void click_multi2(View view){
        user_sel2 = 2;
        Plus2.setChecked(false);
        Minus2.setChecked(false);
        Op2.setText("*");
    }

    public void click_br_btn1(View view){
        user_sel3 = 1;
        Num1.setText("("+String.valueOf(num1));
        Num2.setText(String.valueOf(num2)+")");
    }
    public void click_br_btn2(View view){
        user_sel3 = 2;
        Num1.setText(String.valueOf(num1));
        Num2.setText("("+String.valueOf(num2));
        Num3.setText(String.valueOf(num3)+")");
    }
    public void click_br_btn3(View view){
        user_sel3 = 3;
        Num1.setText(String.valueOf(num1));
        Num2.setText(String.valueOf(num2));
        Num3.setText(String.valueOf(num3));
    }
    public void  click_check(View view){
        if(user_sel3 == 3){
            if(user_sel1 == 0){
                if(user_sel2 == 0){
                    user_ans = num1 + num2 + num3;
                }
                else if(user_sel2 == 1){
                    user_ans = num1 + num2 -num3;
                }
                else if(user_sel2 == 2){
                    user_ans = num1 + num2 * num3;
                }

            }
            else if(user_sel1 == 1){
                if(user_sel2 == 0){
                    user_ans = num1 - num2 + num3;
                }
                else if(user_sel2 == 1){
                    user_ans = num1 - num2 -num3;
                }
                else if(user_sel2 == 2){
                    user_ans = num1 - num2 * num3;
                }
            }
            else if(user_sel1 == 2){
                if(user_sel2 == 0){
                    user_ans = num1 * num2 + num3;
                }
                else if(user_sel2 == 1){
                    user_ans = num1 * num2 -num3;
                }
                else if(user_sel2 == 2){
                    user_ans = num1 * num2 * num3;
                }
            }
        }
        else if(user_sel3 == 2){
            if(user_sel1 == 0){
                if(user_sel2 == 0){
                    user_ans = num1 + (num2 + num3);
                }
                else if(user_sel2 == 1){
                    user_ans = num1 + (num2 -num3);
                }
                else if(user_sel2 == 2){
                    user_ans = num1 + (num2 * num3);
                }

            }
            else if(user_sel1 == 1){
                if(user_sel2 == 0){
                    user_ans = num1 - (num2 + num3);
                }
                else if(user_sel2 == 1){
                    user_ans = num1 - (num2 -num3);
                }
                else if(user_sel2 == 2){
                    user_ans = num1 - (num2 * num3);
                }
            }
            else if(user_sel1 == 2){
                if(user_sel2 == 0){
                    user_ans = num1 * (num2 + num3);
                }
                else if(user_sel2 == 1){
                    user_ans = num1 * (num2 -num3);
                }
                else if(user_sel2 == 2){
                    user_ans = num1 * (num2 * num3);
                }
            }
        }
        else if(user_sel3 == 1){
            if(user_sel1 == 0){
                if(user_sel2 == 0){
                    user_ans = (num1 + num2) + num3;
                }
                else if(user_sel2 == 1){
                    user_ans = (num1 + num2) -num3;
                }
                else if(user_sel2 == 2){
                    user_ans = (num1 + num2) * num3;
                }

            }
            else if(user_sel1 == 1){
                if(user_sel2 == 0){
                    user_ans = (num1 - num2) + num3;
                }
                else if(user_sel2 == 1){
                    user_ans = (num1 - num2) -num3;
                }
                else if(user_sel2 == 2){
                    user_ans = (num1 - num2) * num3;
                }
            }
            else if(user_sel1 == 2){
                if(user_sel2 == 0){
                    user_ans = (num1 * num2) + num3;
                }
                else if(user_sel2 == 1){
                    user_ans = (num1 * num2) -num3;
                }
                else if(user_sel2 == 2){
                    user_ans = (num1 * num2) * num3;
                }
            }
        }
        if(user_ans == ans ){
            Log2.setText("Correct");
        }
        else{
            Log2.setText("Wrong:"+String.valueOf(user_ans));
        }
    }
    public void click_clear(View view){
        Plus.setChecked(false);
        Minus.setChecked(false);
        Multi.setChecked(false);
        Plus2.setChecked(false);
        Minus2.setChecked(false);
        Multi2.setChecked(false);
        Num1.setText(String.valueOf(num1));
        Num2.setText(String.valueOf(num2));
        Num3.setText(String.valueOf(num3));
        Op1.setText("");
        Op2.setText("");
    }

}