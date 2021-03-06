package colosseum19.a300dpi.colosseum2k19.Model;

public class Score {

        private String event_name;
        private String game_name;
        private String teamA;
        private String teamB;
        private String roundNumChess;
        private String bestPhysiqueCategory;
        private String bestPhysiqueCollgeName;
        private String bestPhysiqueParticipantName;
        private String bestPhysiquePositioin;
        private String winner;
        private int score_teamA;
        private int score_teamB;

        public Score() {
        }

        public Score(String event_name, String game_name, String teamA, String teamB, String roundNumChess,
                      String bestPhysiqueCategory, String bestPhysiqueCollgeName, String bestPhysiqueParticipantName,
                      String bestPhysiquePositioin, String winner, int score_teamA, int score_teamB) {
            this.event_name = event_name;
            this.game_name = game_name;
            this.teamA = teamA;
            this.teamB = teamB;
            this.roundNumChess = roundNumChess;
            this.bestPhysiqueCategory = bestPhysiqueCategory;
            this.bestPhysiqueCollgeName = bestPhysiqueCollgeName;
            this.bestPhysiqueParticipantName = bestPhysiqueParticipantName;
            this.bestPhysiquePositioin = bestPhysiquePositioin;
            this.winner = winner;
            this.score_teamA = score_teamA;
            this.score_teamB = score_teamB;
        }

        public String getEvent_name() {
            return event_name;
        }

        public void setEvent_name(String event_name) {
            this.event_name = event_name;
        }

        public String getGame_name() {
            return game_name;
        }

        public void setGame_name(String game_name) {
            this.game_name = game_name;
        }

        public String getTeamA() {
            return teamA;
        }

        public void setTeamA(String teamA) {
            this.teamA = teamA;
        }

        public String getTeamB() {
            return teamB;
        }

        public void setTeamB(String teamB) {
            this.teamB = teamB;
        }

        public String getRoundNumChess() {
            return roundNumChess;
        }

        public void setRoundNumChess(String roundNumChess) {
            this.roundNumChess = roundNumChess;
        }

        public String getBestPhysiqueCategory() {
            return bestPhysiqueCategory;
        }

        public void setBestPhysiqueCategory(String bestPhysiqueCategory) {
            this.bestPhysiqueCategory = bestPhysiqueCategory;
        }

        public String getBestPhysiqueCollgeName() {
            return bestPhysiqueCollgeName;
        }

        public void setBestPhysiqueCollgeName(String bestPhysiqueCollgeName) {
            this.bestPhysiqueCollgeName = bestPhysiqueCollgeName;
        }

        public String getBestPhysiqueParticipantName() {
            return bestPhysiqueParticipantName;
        }

        public void setBestPhysiqueParticipantName(String bestPhysiqueParticipantName) {
            this.bestPhysiqueParticipantName = bestPhysiqueParticipantName;
        }

        public String getBestPhysiquePositioin() {
            return bestPhysiquePositioin;
        }

        public void setBestPhysiquePositioin(String bestPhysiquePositioin) {
            this.bestPhysiquePositioin = bestPhysiquePositioin;
        }

        public String getWinner() {
            return winner;
        }

        public void setWinner(String winner) {
            this.winner = winner;
        }

        public int getScore_teamA() {
            return score_teamA;
        }

        public void setScore_teamA(int score_teamA) {
            this.score_teamA = score_teamA;
        }

        public int getScore_teamB() {
            return score_teamB;
        }

        public void setScore_teamB(int score_teamB) {
            this.score_teamB = score_teamB;
        }
    }
