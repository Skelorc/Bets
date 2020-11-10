package wns.bets.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wns.bets.domain.Hockey;

import java.util.List;

@Repository
public interface HockeyRepo extends JpaRepository<Hockey, Integer> {

    @Query("select h from Hockey h where h.first_win = :first_win and h.draw = :draw and h.second_win = :second_win")
    List<Hockey> findByMainParam(@Param("first_win") double first_win,
                                   @Param("draw") double draw,
                                   @Param("second_win") double second_win);
}
