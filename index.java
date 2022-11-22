import java.util.*;
class Main
{
	public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String male = s.next();
        String female = s.next();
        ArrayList <Character> male_list = new ArrayList <> ();
        ArrayList <Character> female_list = new ArrayList <> ();
        for(int i = 0 ; i < male.length() ; i++)
        {
            char ch = male.charAt(i);
            male_list.add(ch);
        }
        for(int i = 0 ; i < female.length() ; i++)
        {
            char ch = female.charAt(i);
            female_list.add(ch);
        }
        for(int i = 0 ; i < male_list.size() ; i++)
        {
            for(int j = 0 ; j < female_list.size() ; j++)
            {
                char ch = male_list.get(i);
                if(ch == female_list.get(j))
                {
                    male_list.remove(i);
                    female_list.remove(j);
                    i--;
                    break;
                }
            }
        }
        int non_repeating_length = male_list.size() + female_list.size();
        // System.out.print(non_repeating_length);
        char ch = flames(non_repeating_length);
        if(ch == 'f')
        {
            System.out.print("Friends");
        }
        else if(ch == 'l')
        {
            System.out.print("Love");
        }
        else if(ch == 'a')
        {
            System.out.print("Affection");
        }
        else if(ch == 'm')
        {
            System.out.print("Marriage");
        }
        else if(ch == 'e')
        {
            System.out.print("Enemy");
        }
        else
        {
            System.out.print("Sister");
        }       
    }
    public static char flames(int non_repeating_length)
    {
        ArrayList <Character> result = new ArrayList <> ();
        result.add('f');
        result.add('l');
        result.add('a');
        result.add('m');
        result.add('e');
        result.add('s');
        int count = 1;
        for(int i = 0 ; i < result.size() ; i++)
        {
            if(count == non_repeating_length)
            {
                result.remove(i);
                i--;
                count = 0;
            }
            if(i == (result.size() - 1))
            {
                i = 0;
                i--;
            }
            count++;
            if(result.size() == 1)
            {
                return result.get(0);
            }
        }
        return '0';
    }
}