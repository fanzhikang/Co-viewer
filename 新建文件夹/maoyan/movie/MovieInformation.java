package com.rsh.coviewer.movie.maoyan.movie;

import com.rsh.coviewer.movie.maoyan.Control;

/**
 * Created by wsk1103 on 2017/10/24.
 */
@lombok.Data
//电影详情
public class MovieInformation {
    private Control control;
    private int status;
    private Data data;
    public Data getData(){
        return data;
    }
}
