package org.factoriaf5annalyn.annalynspygame;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AnnalynGameTest {

    
    @Test
    public void canFastAttack_KnightAsleep_ReturnsTrue() {
        boolean knightIsAwake = false;
        boolean result = AnnalynGame.canFastAttack(knightIsAwake);
        assertTrue(result);
    }

    @Test
    public void canFastAttack_KnightAwake_ReturnsFalse() {
        boolean knightIsAwake = true;
        boolean result = AnnalynGame.canFastAttack(knightIsAwake);
        assertFalse(result);
    }


    @Test
    public void canSpy_KnightAwake_ReturnsTrue() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean result = AnnalynGame.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        assertTrue(result);
    }

    @Test
    public void canSpy_ArcherAwake_ReturnsTrue() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean result = AnnalynGame.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        assertTrue(result);
    }

    @Test
    public void canSpy_PrisonerAwake_ReturnsTrue() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean result = AnnalynGame.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        assertTrue(result);
    }

    @Test
    public void canSpy_AllAsleep_ReturnsFalse() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean result = AnnalynGame.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        assertFalse(result);
    }

    
    @Test
    public void canSignalPrisoner_ArcherAsleepPrisonerAwake_ReturnsTrue() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean result = AnnalynGame.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        assertTrue(result);
    }

    @Test
    public void canSignalPrisoner_ArcherAwakePrisonerAsleep_ReturnsFalse() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean result = AnnalynGame.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        assertFalse(result);
    }

    @Test
    public void canSignalPrisoner_BothAsleep_ReturnsFalse() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean result = AnnalynGame.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        assertFalse(result);
    }

    @Test
    public void canSignalPrisoner_ArcherAwakePrisonerAwake_ReturnsFalse() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean result = AnnalynGame.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        assertFalse(result);
    }

    
    @Test
    public void canFreePrisoner_DogPresentArcherAsleep_ReturnsTrue() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;
        boolean result = AnnalynGame.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        assertTrue(result);
    }

    @Test
    public void canFreePrisoner_DogPresentArcherAwake_ReturnsFalse() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;
        boolean result = AnnalynGame.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        assertFalse(result);
    }

    @Test
    public void canFreePrisoner_DogAbsentPrisonerAwakeKnightsAsleep_ReturnsTrue() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        boolean result = AnnalynGame.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        assertTrue(result);
    }

    @Test
    public void canFreePrisoner_DogAbsentEveryoneAsleep_ReturnsFalse() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        boolean result = AnnalynGame.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        assertFalse(result);
    }

    @Test
    public void canFreePrisoner_DogAbsentKnightAwake_ReturnsFalse() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        boolean result = AnnalynGame.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        assertFalse(result);
    }

    @Test
    public void canFreePrisoner_DogAbsentArcherAwake_ReturnsFalse() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        boolean result = AnnalynGame.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        assertFalse(result);
    }

    @Test
    public void canSignalPrisonerAlternative_ArcherAwakePrisonerAwake_ReturnsFalse() {
        
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;

    
        boolean result = AnnalynGame.canSignalPrisonerAlternative(archerIsAwake, prisonerIsAwake);

    
        assertFalse(result);
    }

    @Test
    public void canSignalPrisonerAlternative_ArcherAwakePrisonerAsleep_ReturnsTrue() {
        
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;

    
        boolean result = AnnalynGame.canSignalPrisonerAlternative(archerIsAwake, prisonerIsAwake);

        
        assertTrue(result);
    }

    @Test
    public void canSignalPrisonerAlternative_ArcherAsleepPrisonerAwake_ReturnsTrue() {
        
        AnnalynGame annalynGame = new AnnalynGame();
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;

        
        boolean result = annalynGame.canSignalPrisonerAlternative(archerIsAwake, prisonerIsAwake);

        
        assertTrue(result);
    }

    @Test
    public void canSignalPrisonerAlternative_ArcherAsleepPrisonerAsleep_ReturnsTrue() {
        
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;

    
        boolean result = AnnalynGame.canSignalPrisonerAlternative(archerIsAwake, prisonerIsAwake);

        
        assertTrue(result);
    }
}
