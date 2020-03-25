package epam.UnitTesting;

public class ExcludeA {

    public String excludeA (String str)
    {
        StringBuilder res = new StringBuilder(str);
        int len = res.length();
        if (len >= 2)
        {
            byte num = 0;
            
            if (res.charAt(num) == 'A' || res.charAt(num) == 'a')
                res.deleteCharAt(num);
            else
                num++;

            if(res.charAt(num) == 'A' || res.charAt(num) == 'a')
                res.deleteCharAt(num);
        }
        else if (len == 1)
        {
            byte num = 0;
            
            if (res.charAt(num) == 'A' || res.charAt(num) == 'a')
                res.deleteCharAt(num);
        }
        return res.toString();
    }

}
