package com.example.student.photogalery;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView imageView;
    private static int RESULT_IMAGE_LOAD = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        imageView = (ImageView) findViewById(R.id.openimage);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        imageView.setImageURI(Uri.parse("/storage/emulated/0/Download/clock.jpg"));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                imageView.setImageResource(R.drawable.yollo);
                break;
            case R.id.button2:
                Picasso.with(getBaseContext()).load("http://khabarsoutheastasia.com/wp-content/uploads/2018/06/beautiful-hd-wallpapers-for-desktop-hd-wallpapers-wallpapers13-regarding-150-beautiful-buetifull-wallpapers-image-2018.jpg").into(imageView);
                break;
            case R.id.button3:
                /*Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, RESULT_IMAGE_LOAD);*/
                break;
                default:break;
        }
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);*/

       /* if (requestCode == RESULT_IMAGE_LOAD && null != data && resultCode == RESULT_OK) {*/
            /*Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();*/
            /*Toast.makeText(MainActivity.this, picturePath, Toast.LENGTH_LONG).show();*/



        /*}*/

    /*}*/

}
