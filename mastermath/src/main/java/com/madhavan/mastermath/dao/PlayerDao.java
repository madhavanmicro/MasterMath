package com.madhavan.mastermath.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.madhavan.mastermath.model.player.Player;



@Repository
public interface PlayerDao extends JpaRepository<Player,String>{


	@Query("UPDATE Player  SET highScore = :score WHERE mobileNumber = :mobileNumber")
	int updateScore(@Param("score") int score, @Param("mobileNumber") String mobileNumber);
    
    @Query("SELECT distinct highScore FROM Player ORDER BY highScore DESC limit 3")
    List<Integer> topThreeHighScore();
    
    @Query("SELECT name FROM Player WHERE highScore =:highScore")
    List<String> getNamesForHighScore(@Param("highScore") int highScore);

}
