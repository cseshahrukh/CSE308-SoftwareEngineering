package com.company;

import java.io.File;
import java.io.IOException;

public class FileType {

    public void getSum(File file, String type) throws IOException {


        if(type.equals("space"))
        {
            SpaceFileAdaptee spaceFileAdaptee=new SpaceFileAdaptee();
            spaceFileAdaptee.getSum(file);
        }
        else if(type.equals("underscore"))
        {
            UnderscoreFileTarget underscoreFileTarget=new UnderscoreFileTarget();
            underscoreFileTarget.getSum(file);
        }
    }
}
