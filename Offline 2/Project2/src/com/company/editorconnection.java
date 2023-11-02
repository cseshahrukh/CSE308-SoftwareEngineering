package com.company;

public class editorconnection {

    private editor e;


    public editorconnection(String name)
    {
        int size=name.length();
        String extension1="";

        if(name.charAt(size-1)=='c' && name.charAt(size-2)=='.')
        {
            extension1="c";
        }

        else if(name.charAt(size-1)=='p' && name.charAt(size-2)=='p'&& name.charAt(size-3)=='c')
        {
            extension1="cpp";
            //System.out.println("Cpp should print");
        }

        else if(name.charAt(size-1)=='y' && name.charAt(size-2)=='p')
        {
            extension1="py";
        }

        if(extension1.equals("py"))
        {
            python p=new python();
            consolas c=new consolas();
            windows w=new windows();
            e=new editor(p, c, w);
        }

        else if (extension1.equals("c"))
        {
            c p=new c();
            couriernew c=new couriernew();

            windows w=new windows();
            e=new editor(p, c, w);

        }
        else if(extension1.equals("cpp"))
        {
            //System.out.println("Cpp should print");
            cpp p=new cpp();
            monaco c=new monaco();

            windows w=new windows();
            e=new editor(p, c, w);

        }
        else
            e=null;



    }

    public editor getE()
    {
        return e;
    }
}
