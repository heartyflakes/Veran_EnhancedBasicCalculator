package mcm.edu.ph.veran_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd,btnSub,btnDiv,btnMulti,btnMod;

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDivide);
        btnMulti = findViewById(R.id.btnMulti);
        btnMod = findViewById(R.id.btnModulo);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnMod.setOnClickListener(this);


    }
    @Override
    public void onClick(View view){
        double operand1=0;
        double operand2=0;

        EditText op1 = findViewById(R.id.txtOperand1);
        EditText op2 = findViewById(R.id.txtOperand2);
        TextView ans = findViewById(R.id.txtAnswer);

        operand1 = Double.parseDouble(op1.getText().toString());
        operand2 = Double.parseDouble(op2.getText().toString());

        switch(view.getId()) {
            case R.id.btnAdd:
                ans.setText(Double.toString(doAddition(operand1,operand2)));
                break;
            case R.id.btnSub:
                ans.setText(Double.toString(doSubtraction(operand1,operand2)));
                break;
            case R.id.btnDivide:
                ans.setText(Double.toString(doDivision(operand1,operand2)));
                break;
            case R.id.btnMulti:
                ans.setText(Double.toString(doMultiplication(operand1,operand2)));
                break;
            case R.id.btnModulo:
                ans.setText(Double.toString(doModulo(operand1,operand2)));
                break;


        }

    }
    public static double doAddition(double x, double y){
        double answer =0.0;
        answer = x + y;
        return answer;

    }
    public static double doSubtraction(double x, double y) {
        double answer = 0.0;
        answer = x - y;
        return answer;
    }
    public static double doDivision(double x, double y) {
        double answer = 0.0;
        answer = x / y;
        return answer;

    }
    public static double doMultiplication(double x, double y) {
        double answer = 0.0;
        answer = x * y;
        return answer;

    }
    public static double doModulo(double x, double y) {
        double answer = 0.0;
        answer = x % y;
        return answer;

    }
}