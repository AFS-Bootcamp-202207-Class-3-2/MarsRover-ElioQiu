package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    public MarsRover marsRover;
    @Test
    void should_move_2_3_N_when_executeCommands_given_2_2_N_M() {
        // given
        marsRover = new MarsRover(2, 2, Constant.N);
        // when
        marsRover.executeCommands(Constant.M);
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(3, marsRover.getyIndex());
        assertEquals(Constant.N, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_E_L() {
        // given
        marsRover = new MarsRover(2, 2, Constant.E);
        // when
        marsRover.executeCommands(Constant.L);
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.N, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_W_R() {
        // given
        marsRover = new MarsRover(2, 2, Constant.W);
        // when
        marsRover.executeCommands(Constant.R);
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.N, marsRover.getDirection());
    }

    @Test
    void should_move_3_2_S_when_executeCommands_given_2_2_S_LMR() {
        // given
        marsRover = new MarsRover(2, 2, Constant.S);
        // when
        marsRover.executeCommands("LMR");
        // then
        assertEquals(3, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.S, marsRover.getDirection());
    }

    @Test
    void should_move_1_2_S_when_executeCommands_given_2_2_S_RML() {
        // given
        marsRover = new MarsRover(2, 2, Constant.S);
        // when
        marsRover.executeCommands("RML");
        // then
        assertEquals(1, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.S, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_W_MLR() {
        // given
        marsRover = new MarsRover(2, 2, Constant.W);
        // when
        marsRover.executeCommands("MLR");
        // then
        assertEquals(1, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.W, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_W_MRL() {
        // given
        marsRover = new MarsRover(2, 2, Constant.W);
        // when
        marsRover.executeCommands("MRL");
        // then
        assertEquals(1, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.W, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_E_RLM() {
        // given
        marsRover = new MarsRover(2, 2, Constant.E);
        // when
        marsRover.executeCommands("RLM");
        // then
        assertEquals(3, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.E, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_E_RML() {
        // given
        marsRover = new MarsRover(2, 2, Constant.E);
        // when
        marsRover.executeCommands("RML");
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(1, marsRover.getyIndex());
        assertEquals(Constant.E, marsRover.getDirection());
    }

    @Test
    void should_move_2_0_S_when_executeCommands_given_2_2_N_LLMM() {
        // given
        marsRover = new MarsRover(2, 2, Constant.N);
        // when
        marsRover.executeCommands("LLMM");
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(0, marsRover.getyIndex());
        assertEquals(Constant.S, marsRover.getDirection());
    }

    @Test
    void should_move_2_4_S_when_executeCommands_given_2_2_N_MMRR() {
        // given
        marsRover = new MarsRover(2, 2, Constant.N);
        // when
        marsRover.executeCommands("MMRR");
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(4, marsRover.getyIndex());
        assertEquals(Constant.S, marsRover.getDirection());
    }

    @Test
    void should_move_2_2_N_when_executeCommands_given_2_2_N_LRLR() {
        // given
        marsRover = new MarsRover(2, 2, Constant.N);
        // when
        marsRover.executeCommands("LRLR");
        // then
        assertEquals(2, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.N, marsRover.getDirection());
    }

    @Test
    void should_move_1_2_W_when_executeCommands_given_2_2_N_LMLR() {
        // given
        marsRover = new MarsRover(2, 2, Constant.N);
        // when
        marsRover.executeCommands("LMLR");
        // then
        assertEquals(1, marsRover.getxIndex());
        assertEquals(2, marsRover.getyIndex());
        assertEquals(Constant.W, marsRover.getDirection());
    }
}
