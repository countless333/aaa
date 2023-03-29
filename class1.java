import java.util.List;

class freeboard {

    private int fboardno;
    private String fboardtitle;
    private String fboardcontent;

    public int getFboardno() {
        return fboardno;
    }

    public void setFboardno(int fboardno) {
        this.fboardno = fboardno;
    }

    public String getFboardtitle() {
        return fboardtitle;
    }

    public void setFboardtitle(String fboardtitle) {
        this.fboardtitle = fboardtitle;
    }

    public String getFboardcontent() {
        return fboardcontent;
    }

    public void setFboardcontent(String fboardcontent) {
        this.fboardcontent = fboardcontent;
    }

    @Override
    public String toString() {
        return "FreeBoard{" +
                "fboardno=" + fboardno +
                ", fboardtitle='" + fboardtitle + '\'' +
                ", fboardcontent='" + fboardcontent + '\'' +
                '}';
    }


}

class noticeboard {
    private int nboardno;
    private String nboardtitle;
    private String nboardcontent;

    public int getNboardno() {
        return nboardno;
    }

    public void setNboardno(int nboardno) {
        this.nboardno = nboardno;
    }

    public String getNboardtitle() {
        return nboardtitle;
    }

    public void setNboardtitle(String nboardtitle) {
        this.nboardtitle = nboardtitle;
    }

    public String getNboardcontent() {
        return nboardcontent;
    }

    public void setNboardcontent(String nboardcontent) {
        this.nboardcontent = nboardcontent;
    }


    @Override
    public String toString() {
        return "noticeboard{" +
                "nboardno=" + nboardno +
                ", nboardtitle='" + nboardtitle + '\'' +
                ", nboardcontent='" + nboardcontent + '\'' +
                '}';
    }
}

class boardfile<T> {
    private int boardno;
    private int tyte;
    private String boardfilenm;
    private T t;
    private List<T> tList;

    //ResponseEntity<T> 요청에 대한 응답을 보낼때 이런걸 만들게 됨. 제이슨으로 만들어서 리턴할수도 있고





    public int getBoardno() {
        return boardno;
    }

    public void setBoardno(int boardno) {
        this.boardno = boardno;
    }

    public int getTyte() {
        return tyte;
    }

    public void setTyte(int tyte) {
        this.tyte = tyte;
    }

    public String getBoardfilenm() {
        return boardfilenm;
    }

    public void setBoardfilenm(String boardfilenm) {
        this.boardfilenm = boardfilenm;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "boardfile{" +
                "boardno=" + boardno +
                ", tyte=" + tyte +
                ", boardfilenm='" + boardfilenm + '\'' +
                ", t=" + t +
                '}';
    }
}

public class class1 {
    public static void main(String[] args) {

        boardfile<freeboard> fboardfile = new boardfile<freeboard>();
        freeboard fboard = new freeboard();
        fboard.setFboardno(1);
        fboard.setFboardtitle("test");
        fboard.setFboardcontent("test입니다");
        fboardfile.setT(fboard);
        fboardfile.setBoardno(fboardfile.getT().getFboardno());

        System.out.println(fboardfile.getClass());
        //1. 자유게시펀, 2 공지사항
        fboardfile.setTyte(
                (fboardfile.getT().getClass().getSimpleName().equals("freeboard")) ? 1 : 2

        );

        fboardfile.setBoardfilenm("첨부파일");

//fboardfile.setT(new freeboard());
//이렇게 해도 되는데 다 초기화가 되버림. 변수가

        freeboard fboard2 = new freeboard();
        fboard2.setFboardno(2);
        fboard2.setFboardtitle("test");
        fboard2.setFboardcontent("test입니다");
        fboardfile.setT(fboard2);

        boardfile<noticeboard> notboard = new boardfile<noticeboard>();

noticeboard nb = new noticeboard();
nb.setNboardno(1);
nb.setNboardtitle("공지입니다");
nb.setNboardcontent("공지!! 학원붕괴!");
notboard.setT(nb);
////////이해해보지
notboard.setT(new noticeboard());
notboard.getT().setNboardno(2);
notboard.getT().setNboardtitle("공찌");
        notboard.getT().setNboardcontent("꽁찌야");
        notboard.setBoardno(notboard.getT().getNboardno());
        notboard.setTyte(notboard.getT().getClass().getSimpleName().equals("freeboard")?1:2);
        System.out.println(notboard);
        //번호2번 타입2번 노티스파일

    }


}
