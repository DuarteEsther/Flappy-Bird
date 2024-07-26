package com.gcstudios.world;

import com.gcstudios.entities.Entity;
import com.gcstudios.entities.Tubo;
import com.gcstudios.main.Game;

public class TuboGenerator {

	public int time =0;
	public int targetTime = 60;
	
	public void tick() {
		time++;
		if(time == 60) {
			//AQUI CRIAMOS NOSSO TUBO NOVO E RESETAMOS NOSSO CONTADOR.
			
			int altura1 = Entity.rand.nextInt(80 - 60)+ 60;  //TAMANHO DO TUBO
			Tubo tubo1 = new Tubo(Game.WIDTH,0,20,altura1,1, Game.spritesheet.getSprite(16, 16, 16, 16));
			
		
			
			//TUBO DE BAIXO
			int altura2 = Entity.rand.nextInt(80 - 60)+ 60;  //TAMANHO DO TUBO
			Tubo tubo2 = new Tubo(Game.WIDTH,Game.HEIGHT-altura2,20,altura2,1,Game.spritesheet.getSprite(32, 32, 16, 16));
			
			Game.entities.add(tubo1);
			Game.entities.add(tubo2);
			time= 0;
		}
	}
}
