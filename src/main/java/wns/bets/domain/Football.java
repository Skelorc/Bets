package wns.bets.domain;

import javax.persistence.*;

@Entity
@Table(name = "football")
public class Football {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "first_win_open")
    private double first_win_open;

    @Column (name = "draw_open")
    private double draw_open;

    @Column (name = "second_win_open")
    private double second_win_open;

    @Column (name = "first_win_close")
    private double first_win_close;

    @Column (name = "draw_close")
    private double draw_close;

    @Column (name = "second_win_close")
    private double second_win_close;

    @Column (name = "first_count")
    private int first_count;

    @Column (name = "second_count")
    private int second_count;

    @Column (name = "tb_large")
    private double tb_large;

    @Column (name = "tb_small")
    private double tb_small;

    @Column (name = "name_base")
    private String name_base;

    public Football(double first_win_open, double draw_open, double second_win_open,
                    double first_win_close, double draw_close, double second_win_close,
                    int first_count, int second_count, double tb_large, double tb_small, String name_base) {
        this.first_win_open = first_win_open;
        this.draw_open = draw_open;
        this.second_win_open = second_win_open;
        this.first_win_close = first_win_close;
        this.draw_close = draw_close;
        this.second_win_close = second_win_close;
        this.first_count = first_count;
        this.second_count = second_count;
        this.tb_large = tb_large;
        this.tb_small = tb_small;
        this.name_base = name_base;
    }

    public String getName_base() {
        return name_base;
    }

    public void setName_base(String name_base) {
        this.name_base = name_base;
    }

    public Football() {
    }

    public Football(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFirst_win_open() {
        return first_win_open;
    }

    public void setFirst_win_open(double first_win_open) {
        this.first_win_open = first_win_open;
    }

    public double getDraw_open() {
        return draw_open;
    }

    public void setDraw_open(double draw_open) {
        this.draw_open = draw_open;
    }

    public double getSecond_win_open() {
        return second_win_open;
    }

    public void setSecond_win_open(double second_win_open) {
        this.second_win_open = second_win_open;
    }

    public double getFirst_win_closed() {
        return first_win_close;
    }

    public void setFirst_win_closed(double first_win_closed) {
        this.first_win_close = first_win_closed;
    }

    public double getDraw_closed() {
        return draw_close;
    }

    public void setDraw_closed(double draw_closed) {
        this.draw_close = draw_closed;
    }

    public double getSecond_win_closed() {
        return second_win_close;
    }

    public void setSecond_win_closed(double second_win_closed) {
        this.second_win_close = second_win_closed;
    }

    public float getFirst_count() {
        return first_count;
    }

    public void setFirst_count(int first_count) {
        this.first_count = first_count;
    }

    public float getSecond_count() {
        return second_count;
    }

    public void setSecond_count(int second_count) {
        this.second_count = second_count;
    }

    public double getTb_large() {
        return tb_large;
    }

    public void setTb_large(double tb_large) {
        this.tb_large = tb_large;
    }

    public double getTb_small() {
        return tb_small;
    }

    public void setTb_small(double tb_small) {
        this.tb_small = tb_small;
    }
}
