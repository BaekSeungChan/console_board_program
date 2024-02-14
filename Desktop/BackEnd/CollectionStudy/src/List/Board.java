package List;

import java.util.Objects;

public class Board {
    private int id;
    private String subject;
    private String content;
    private String writer;

    public Board(int id){
        this(id, "", "", "");
//        this.id = id; // 이런식으로 작성하는 것보다 this()로 작성하는거랑 같다.
    }

    public Board(int id, String subject, String content, String writer) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return id == board.id;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
