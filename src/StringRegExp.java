public class StringRegExp
{
    public static void main(String[] args)
    {
        String[] months = {
                "January",
                "February",
                "Mart",
                "April",
                "May",
                "Jane",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        String result = "";

        for(int i = 0; i < months.length; i++)
        {
            result += months[i];

            if (i == months.length - 1)
                result += ".";
            else
                result += ", ";
        }

        System.out.print(result);
    }
}
