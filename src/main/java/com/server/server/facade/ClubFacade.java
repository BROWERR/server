package com.server.server.facade;

import com.server.server.dto.ClubDTO;
import com.server.server.models.Club;
import org.springframework.stereotype.Component;

@Component
public class ClubFacade {

    public ClubDTO clubToClubDTO(Club club){
        ClubDTO clubDTO = new ClubDTO();
        clubDTO.setId(club.getId());
        clubDTO.setClub_name(club.getClubName());
        clubDTO.setClub_games(club.getClubGames());
        clubDTO.setClub_goals(club.getClubGoals());
        clubDTO.setClub_points(club.getClubPoints());
        return clubDTO;
    }
}
