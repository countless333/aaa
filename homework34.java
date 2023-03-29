import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

class member{
    private int no;
    private String id;
    private String name;

    private String lastLoginDate;
    private String status;
 public member(int no, String name, String lastLoginDate, String status){
    this.no = no;
    this.name = name;
    this.lastLoginDate = lastLoginDate;
    this.status = status;

}

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "member{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastLoginDate='" + lastLoginDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

public class homework34 {


    public static void main(String[] args) throws ParseException {


        ArrayList<member> mm = new ArrayList<>();

        mm.add(new member(1,"김은석", "1991-11-21", "Y"));
        mm.add(new member(2,"aaa", "1991-11-21", "Y"));

        mm.add(new member(3,"bbb", "2023-03-25", "Y"));

        mm.add(new member(4,"ccc", "2022-11-21", "Y"));

        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        for(int i=0;i<mm.size();i++){
            Date d2 = format.parse(mm.get(i).getLastLoginDate());
            long dif = (d.getTime()-d2.getTime())/1000;
            long dif2 = dif/(60*60*24);
            if(dif2>365){
                mm.get(i).setStatus("N");
            }



        }

for(member member:mm){
    System.out.println(member);

}
    }



}
