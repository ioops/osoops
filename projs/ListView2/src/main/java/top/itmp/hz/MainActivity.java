package top.itmp.hz;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import android.app.ListActivity;
import android.widget.SimpleAdapter;


public class MainActivity extends ListActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SimpleAdapter adapter = new SimpleAdapter(this, getData(),
                                        R.layout.main,
                                        new String[]{"title", "info", "picture"},
                                          new int[]{R.id.title, R.id.info, R.id.picture});

        setListAdapter(adapter);
    }
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        private List<Map<String, Object>> getData() {
            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>
();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "图片");
        map.put("info", "美辰良景， 给你无限的瞎想， 让人感觉无限的温馨....");
        map.put("picture", R.drawable.photo);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "音乐");
        map.put("info", "轻慢音乐，令你如入仙境， 如痴如醉...");
        map.put("picture", R.drawable.music);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "视频");
        map.put("info", "震撼视频， 你的心灵被震撼了么....");
        map.put("picture", R.drawable.video);
        list.add(map);

        return list;
        }






}
