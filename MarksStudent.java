
/**
 * Write a description of class MarksStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MarksStudent
{
    public static void main (String name,
                             double phyMarks,
                             double chemMarks,
                             double bioMarks) 
    {
        String grade = "";
        double avg = 0.0;
        
        avg = (phyMarks + chemMarks + bioMarks) / 3;
        
        if (avg < 40)
        {
            grade = "FAIL";
        }
        else if (avg > 40 && avg < 45)
        {
            grade = "PASS";
        }
        else if (avg > 45 && avg < 60)
        {
            grade = "2nd DIVISION";
        }
        else if (avg < 60 && avg < 80)
        {
            grade = "1st DIVISION";
        }
        else if (avg > 80)
        {
            grade = "DISTINCTION";
        }
        
        System.out.println("Name\tAverage\tGrade\n");
        System.out.println("-----\t------\t------\n");
        
        System.out.println(name+"\t"+avg+"\t"+grade);
    }
}
