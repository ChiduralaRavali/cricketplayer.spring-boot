package com.example.player;
import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();
    Player getPlayerById(int playerId);

    Player addPlayer(Player player);

    void updatePlayer(int playerId, Player player);

    void deletePlayer(int playerId);
}

