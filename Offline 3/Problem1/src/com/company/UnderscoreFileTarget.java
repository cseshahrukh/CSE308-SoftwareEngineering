package com.company;

import java.io.File;
import java.io.IOException;

public class UnderscoreFileTarget {
    FileAdapter fileAdapter;

    public void getSum(File filename) throws IOException {
        fileAdapter=new FileAdapter();
        fileAdapter.getSum(filename);


    }
}
