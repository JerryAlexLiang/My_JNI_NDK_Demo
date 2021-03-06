package liang.com.my_jni_ndk_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.tv_content);
        Button button = (Button) findViewById(R.id.btn_java_to_jni);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringFromNDK = NDKTools.getStringFromNDK();
                textView.setText(stringFromNDK);
            }
        });
    }

}
