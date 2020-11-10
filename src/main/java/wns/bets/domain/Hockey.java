package wns.bets.domain;


import javax.persistence.*;

@Entity
@Table(name = "hockey")
public class Hockey {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "first_win")
    private double first_win;

    @Column (name = "draw")
    private double draw;

    @Column (name = "second_win")
    private double second_win;

    @Column (name = "first_count")
    private int first_count;

    @Column (name = "second_count")
    private int second_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getFirst_win() {
        return first_win;
    }

    public void setFirst_win(double first_win) {
        this.first_win = first_win;
    }

    public double getDraw() {
        return draw;
    }

    public void setDraw(double draw) {
        this.draw = draw;
    }

    public double getSecond_win() {
        return second_win;
    }

    public void setSecond_win(double second_win) {
        this.second_win = second_win;
    }

    public int getFirst_count() {
        return first_count;
    }

    public void setFirst_count(int first_count) {
        this.first_count = first_count;
    }

    public int getSecond_count() {
        return second_count;
    }

    public void setSecond_count(int second_count) {
        this.second_count = second_count;
    }

    public Hockey() {
    }

    public Hockey(double first_win, double draw, double second_win, int first_count, int second_count) {
        this.first_win = first_win;
        this.draw = draw;
        this.second_win = second_win;
        this.first_count = first_count;
        this.second_count = second_count;
    }
}
