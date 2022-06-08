package pokemons.conditions;

import pokemons.Pokemon;

public enum Condition {
	POISONED {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
			int poisonDmg = (int) (pokemon.getBaseHP()/10);
			System.out.println(pokemon.getName() + " suffers " + poisonDmg + " poison damage");
			pokemon.takeDmg(poisonDmg);
			System.out.println(pokemon.getName()+"'s HP goes to " + pokemon.getHP());
		}

		@Override
		public
		double conditionDmgAdj(Pokemon pokemon) {
			return 1;
		}

		@Override
		public void conditionCheckEnding(Pokemon pokemon) {
		}

		@Override
		public void conditionCheckMove(Pokemon pokemon) {
		}

		@Override
		public double conditionFromUser(Pokemon affected, Pokemon source) {
			return 0;
		}
	},
	BURNING {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
			int burningDmg = (int) (pokemon.getBaseHP()/10);
			System.out.println(pokemon.getName() + " suffers " + burningDmg + " burning damage");
			pokemon.takeDmg(burningDmg);
			System.out.println(pokemon.getName()+"'s HP goes to " + pokemon.getHP());
		}

		@Override
		public
		double conditionDmgAdj(Pokemon pokemon) {
			return 0.5;
		}

		@Override
		public void conditionCheckEnding(Pokemon pokemon) {
		}

		@Override
		public void conditionCheckMove(Pokemon pokemon) {
		}

		@Override
		public double conditionFromUser(Pokemon affected, Pokemon source) {
			return 0;
		}
	},
    //TODO
	SEEDED {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
			int burningDmg = (int) (pokemon.getBaseHP()/10);
			System.out.println(pokemon.getName() + " suffers " + burningDmg + " burning damage");
			pokemon.takeDmg(burningDmg);
			System.out.println(pokemon.getName()+"'s HP goes to " + pokemon.getHP());
		}
		
		@Override
		public
		double conditionDmgAdj(Pokemon pokemon) {
			return 1;
		}
		
		@Override
		public void conditionCheckEnding(Pokemon pokemon) {
		}
		
		@Override
		public void conditionCheckMove(Pokemon pokemon) {
		}
		
		@Override
		public double conditionFromUser(Pokemon affected, Pokemon source) {
			return 0;
		}
	},

	FLINCHING {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
		}

		@Override
		public
		double conditionDmgAdj(Pokemon pokemon) {
			return 1;
		}

		@Override
		public void conditionCheckEnding(Pokemon pokemon) {
		}

		@Override
		public void conditionCheckMove(Pokemon pokemon) {
		}

		@Override
		public double conditionFromUser(Pokemon affected, Pokemon source) {
			return 0;
		}
	},
	
	CHARGING {

		@Override
		public void conditionCheckBegin(Pokemon pokemon) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void conditionCheckEnding(Pokemon pokemon) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void conditionCheckMove(Pokemon pokemon) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double conditionDmgAdj(Pokemon pokemon) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double conditionFromUser(Pokemon affected, Pokemon source) {
			// TODO Auto-generated method stub
			return 0;
		}},


	BOUND {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
		}

		@Override
		public
		double conditionDmgAdj(Pokemon pokemon) {
			return 1;
		}

		@Override
		public void conditionCheckEnding(Pokemon pokemon) {
		}

		@Override
		public void conditionCheckMove(Pokemon pokemon) {
		}

		@Override
		public double conditionFromUser(Pokemon affected, Pokemon source) {
			return 0;
		}
	};
	//CRIAR VALORES PRA DIFERENCIAR AS CONDITIONS
	

	public abstract void conditionCheckBegin(Pokemon pokemon);
	public abstract void conditionCheckEnding(Pokemon pokemon);
	public abstract void conditionCheckMove(Pokemon pokemon);
	public abstract double conditionDmgAdj(Pokemon pokemon);
	public abstract double conditionFromUser(Pokemon affected, Pokemon source);

}