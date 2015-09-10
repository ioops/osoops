package top.itmp.hz;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.widget.Toast;


import android.content.DialogInterface;

public class Dialog extends Activity
{
    private  Button bt1 = null;
    private  Button bt2 = null;
    private  Button bt3 = null;
    private  Button bt4 = null;

        private int selectedCityIndex = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

             final String[] arrayCity = new String[] { "杭州", "纽约", "威尼斯", "北海道" };


        bt1 =  (Button)super.findViewById(R.id.button1);
        bt2 =  (Button)super.findViewById(R.id.button2);
        bt3 =  (Button)super.findViewById(R.id.button3);
        bt4 =  (Button)super.findViewById(R.id.button4);
        // alertdialog

        bt1.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    Builder adialog = new AlertDialog.Builder(Dialog.this);
                    adialog.setTitle("简单对话框");
                    adialog.setMessage("这是一个美丽的传说，精美的石头是唱歌...");
                    adialog.setIcon(R.drawable.ic_launcher);
                    adialog.create();
                    adialog.show();
                }
        });


        bt2.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v){
                    Builder adialog = new AlertDialog.Builder(Dialog.this);
                    adialog.setTitle("确定么？");
                    adialog.setMessage("Are you really want to do this?");
                    adialog.setIcon(R.drawable.ic_launcher);
                    adialog.setPositiveButton("确定", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            Toast.makeText(getApplicationContext(), "确定", Toast.LENGTH_SHORT).show();
                        }
                    });
                    adialog.setNegativeButton("取消", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            Toast.makeText(getApplicationContext(), "取消", Toast.LENGTH_SHORT).show();
                        }
                    });
                    adialog.setNeutralButton("查看详情", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            Toast.makeText(getApplicationContext(), "查看详情", Toast.LENGTH_SHORT).show();
                        }
                    });
                    adialog.create();
                    adialog.show();

                }
        });
        bt3.setOnClickListener(new OnClickListener(){
                public void onClick(View v){
                 new AlertDialog.Builder(Dialog.this).setTitle("你最喜欢哪个地方？").setIcon(R.drawable.ic_launcher).setSingleChoiceItems(arrayCity, selectedCityIndex, new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                            Toast.makeText(getApplicationContext(), arrayCity[which], Toast.LENGTH_SHORT).show();
                        selectedCityIndex = which;
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener(){
    public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), arrayCity[which], Toast.LENGTH_SHORT).show();
                        selectedCityIndex = which;
}
}).setPositiveButton("确认", new DialogInterface.OnClickListener(){
    public void onClick(DialogInterface dialog, int which){
                            Toast.makeText(getApplicationContext(), arrayCity[which], Toast.LENGTH_SHORT).show();
}
}).create().show();


                }
        });
        bt4.setOnClickListener(new OnClickListener(){
                public void onClick(View v){

                }
        });
    }
}
