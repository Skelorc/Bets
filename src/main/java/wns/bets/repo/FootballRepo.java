package wns.bets.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wns.bets.domain.Football;

import java.util.List;

@Repository
public interface FootballRepo extends JpaRepository<Football, Integer> {

    Football findAllById(int i);
    List<Football> findAllByIdBetween(int start, int end);


    @Query("select b from Football b where b.first_win_open = :first_win_open and b.draw_open = :draw_open and b.second_win_open = :second_win_open and b.name_base = :name_base")
    List<Football> findAllByMainParam(@Param("first_win_open") double first_win_open,
                                   @Param("draw_open") double draw_open,
                                   @Param("second_win_open") double second_win_open,
                                   @Param("name_base") String name_base);


    @Query("select b from Football b where b.first_win_close = :first_win_close and b.draw_close = :draw_close and b.second_win_close = :second_win_close and b.name_base = :name_base")
    List<Football> findBySecondParam(
            @Param("first_win_close") double first_win_close,
            @Param("draw_close") double draw_close,
            @Param("second_win_close") double second_win_close,
            @Param("name_base") String name_base);

    @Query("select b from Football b where b.first_win_open = :first_win_open and b.draw_open = :draw_open and b.second_win_open = :second_win_open and b.tb_small = :tb_small and b.tb_large = :tb_large and b.name_base = :name_base")
    List<Football> findByMainParamAndtb(
            @Param("first_win_open") double first_win_open,
            @Param("draw_open") double draw_open,
            @Param("second_win_open") double second_win_open,
            @Param("tb_large") double tb_large,
            @Param("tb_small") double tb_small,
            @Param("name_base") String name_base);

    @Query("select b from Football b where b.first_win_open = :first_win_open and b.draw_open = :draw_open and b.second_win_open = :second_win_open and b.first_win_close = :first_win_close and b.draw_close = :draw_close and b.second_win_close = :second_win_close and b.name_base = :name_base")
    List<Football> findByMainAndSecondParam(@Param("first_win_open") double first_win_open,
                                            @Param("draw_open") double draw_open,
                                            @Param("second_win_open") double second_win_open,
                                            @Param("first_win_close") double first_win_close,
                                            @Param("draw_close") double draw_close,
                                            @Param("second_win_close") double second_win_close,
                                            @Param("name_base") String name_base);

    @Query("select b from Football b where b.first_win_open = :first_win_open and b.draw_open = :draw_open and b.second_win_open = :second_win_open and b.first_win_close = :first_win_close and b.draw_close = :draw_close and b.second_win_close = :second_win_close and b.tb_small = :tb_small and b.tb_large = :tb_large and b.name_base = :name_base")
    List<Football> findByAllPAram(@Param("first_win_open") double first_win_open,
                                  @Param("draw_open") double draw_open,
                                  @Param("second_win_open") double second_win_open,
                                  @Param("first_win_close") double first_win_close,
                                  @Param("draw_close") double draw_close,
                                  @Param("second_win_close") double second_win_close,
                                  @Param("tb_large") double tb_large,
                                  @Param("tb_small") double tb_small,
                                  @Param("name_base") String name_base);
    }
