package br.edu.calculadora;

import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt0,
           bt1,
           bt2,
           bt3,
           bt4,
           bt5,
           bt6,
           bt7,
           bt8,
           bt9,
           btPonto,
           btIgual,
           btSoma,
           btSubtrair,
           btMultiplicar,
           btDivisao,
           btLimpar,
           btDesligar;

    EditText edtCalculo,
           edtConcatenar;

    double numero1,
           numero2,
           resultado;

    String operador;

    boolean btVirgula;

    public void Corrigi(){
        numero1 = 0;
        numero2 = 0;
        edtCalculo.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btVirgula = false;

        btLimpar = (Button) findViewById(R.id.btLimpar);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btPonto = (Button) findViewById(R.id.btPonto);
        btIgual = (Button) findViewById(R.id.btIgual);
        btSoma = (Button) findViewById(R.id.btSomar);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);
        btDivisao = (Button) findViewById(R.id.btDividir);
        btDesligar = (Button) findViewById(R.id.btDesligar);

        edtCalculo = (EditText) findViewById(R.id.edtCalculo);
        edtConcatenar = (EditText) findViewById(R.id.edtCalculo);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "0");
                edtCalculo.setError(null);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "1");
                edtCalculo.setError(null);

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "2");
                edtCalculo.setError(null);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "3");
                edtCalculo.setError(null);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "4");
                edtCalculo.setError(null);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "5");
                edtCalculo.setError(null);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "6");
                edtCalculo.setError(null);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "7");
                edtCalculo.setError(null);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "8");
                edtCalculo.setError(null);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "9");
                edtCalculo.setError(null);
            }
        });
        btPonto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (btVirgula == false) {
                        edtCalculo.setText(edtConcatenar.getText().toString() + ".");
                        btVirgula = true;
                    }
                }
            });
        btIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero2 = Double.parseDouble(edtConcatenar.getText().toString());
                if (operador.equals("+")) {
                    edtCalculo.setText("");
                    resultado = numero1 + numero2;
                    edtCalculo.setText(String.valueOf(resultado));
                }
                if (operador.equals("-")) {
                    edtCalculo.setText("");
                    resultado = numero1 - numero2;
                    edtCalculo.setText(String.valueOf(resultado));
                }
                if (operador.equals("*")) {
                    edtCalculo.setText("");
                    resultado = numero1 * numero2;
                    edtCalculo.setText(String.valueOf(resultado));
                }
                if (operador.equals("/")) {
                    edtCalculo.setText("");
                    if (numero2 == 0.0) {

                        edtCalculo.setError("Error!");
                        Corrigi();
                        return;

                    } else {
                        resultado = numero1 / numero2;
                    }
                    edtCalculo.setText(String.valueOf(resultado));
                }
                //if (operador.equals("%")) {
                //  edtCalculo.setText("");
                // resultado = numero2 * (numero1 / 100.0);
                // }
                //  edtCalculo.setText(String.valueOf(resultado));
                }
                });

        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                numero1 = Double.parseDouble(edtConcatenar.getText().toString());
                edtCalculo.setText("");
            }
        });
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                numero1 = Double.parseDouble(edtConcatenar.getText().toString());
                edtCalculo.setText("");
            }
        });
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                numero1 = Double.parseDouble(edtConcatenar.getText().toString());
                edtCalculo.setText("");
            }
        });
        btDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                numero1 = Double.parseDouble(edtConcatenar.getText().toString());
                edtCalculo.setText("");
            }
        });
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Corrigi();
            }
        });
        btDesligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculo.setText(edtConcatenar.getText().toString() + "");

                finish();
            }
        });
    }
}
