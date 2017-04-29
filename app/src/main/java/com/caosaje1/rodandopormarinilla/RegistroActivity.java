package com.caosaje1.rodandopormarinilla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    EditText eRegusername, eRegcontraseña, eRegconfcontraseña, eCorreo;
    Button bRegistrarse, bRegcancelar;
    String username, password, repPassword, correo;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        eRegusername = (EditText) findViewById(R.id.eRegusername);
        eRegcontraseña = (EditText) findViewById(R.id.eRegcontraseña);
        eRegconfcontraseña = (EditText) findViewById(R.id.eRegconfcontraseña);
        eCorreo = (EditText) findViewById(R.id.eCorreo);
        bRegistrarse = (Button) findViewById(R.id.bRegistrarse);
        bRegcancelar = (Button) findViewById(R.id.bRegcancelar);


        bRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //validar que todos los campos esten llenos

                if (eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") &&  eRegconfcontraseña.getText().toString().equals("") &&  eCorreo.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    if (!eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                    } else {
                        if (eRegusername.getText().toString().equals("") && !eRegcontraseña.getText().toString().equals("") && eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                            Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                        } else {
                            if (eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                                Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                            } else {
                                if (eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && eRegconfcontraseña.getText().toString().equals("") && !eCorreo.getText().toString().equals("")) {
                                    Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                } else {
                                    if (!eRegusername.getText().toString().equals("") && !eRegcontraseña.getText().toString().equals("") && eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                                        Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                    } else {
                                        if (!eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                                            Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                        } else {
                                            if (!eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && eRegconfcontraseña.getText().toString().equals("") && !eCorreo.getText().toString().equals("")) {
                                                Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                            } else {
                                                if (eRegusername.getText().toString().equals("") && !eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                                                    Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                                } else {
                                                    if (eRegusername.getText().toString().equals("") && !eRegcontraseña.getText().toString().equals("") && eRegconfcontraseña.getText().toString().equals("") && !eCorreo.getText().toString().equals("")) {
                                                        Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                                    } else {
                                                        if (eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && !eCorreo.getText().toString().equals("")) {
                                                            Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                                        } else {
                                                            if (!eRegusername.getText().toString().equals("") && !eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && eCorreo.getText().toString().equals("")) {
                                                                Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                                            } else {
                                                                if (!eRegusername.getText().toString().equals("") && eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && !eCorreo.getText().toString().equals("")) {
                                                                    Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                                                } else {
                                                                    if (eRegusername.getText().toString().equals("") && !eRegcontraseña.getText().toString().equals("") && !eRegconfcontraseña.getText().toString().equals("") && !eCorreo.getText().toString().equals("")) {
                                                                        Toast.makeText(getApplicationContext(), "Debe diligenciar todos los campos", Toast.LENGTH_SHORT).show();
                                                                    } else {
                                                                        username = eRegusername.getText().toString();
                                                                        password = eRegcontraseña.getText().toString();
                                                                        repPassword = eRegconfcontraseña.getText().toString();
                                                                        correo = eCorreo.getText().toString();
                                                                        intent = new Intent();

                                                                        if (eRegcontraseña.getText().toString().equals(repPassword) ) {

                                                                            intent.putExtra("username", username);
                                                                            intent.putExtra("password", password);
                                                                            intent.putExtra("correo", correo);
                                                                            setResult(RESULT_OK, intent);
                                                                            finish();


                                                                        } else {
                                                                            Toast.makeText(getApplicationContext(), "Contraseñas diferentes", Toast.LENGTH_SHORT).show();
                                                                        }





                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        });

        bRegcancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent();
                setResult(RESULT_CANCELED,intent);
                finish();

            }
        });


    }

}
