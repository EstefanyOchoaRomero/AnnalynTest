package org.factoriaf5annalyn.annalynspygame;

public class AnnalynGame {

        public static boolean canFastAttack(boolean knightIsAwake) {
            return !knightIsAwake;
        }

        public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
            return knightIsAwake || archerIsAwake || prisonerIsAwake;
        }

        public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
            return !archerIsAwake && prisonerIsAwake;
        }

        public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
            if (petDogIsPresent) {
                return !archerIsAwake;
            } else {
                return !knightIsAwake && !archerIsAwake && prisonerIsAwake;
            }

        }

        public static boolean canSignalPrisonerAlternative(boolean archerIsAwake, boolean prisonerIsAwake) {
            
            if (archerIsAwake && prisonerIsAwake) {
                return false;
            }
            return true;
        }


}
