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
}
