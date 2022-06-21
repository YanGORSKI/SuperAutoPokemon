package pokemons.conditions;

import pokemons.Pokemon;

public enum Condition {
	POISONED {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
			int poisonDmg = (int) (pokemon.getBaseHP()/15);
			System.out.println(pokemon.getNickname() + " suffers " + poisonDmg + " poison damage");
			pokemon.takeDmg(poisonDmg);
			System.out.println(pokemon.getNickname()+"'s HP goes to " + pokemon.getHP());
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
		public void conditionFromUser(Pokemon affected, Pokemon source) {
		}
	},

	BURNING {
		@Override
		public
		void conditionCheckBegin(Pokemon pokemon) {
			int burningDmg = (int) (pokemon.getBaseHP()/15);
			System.out.println(pokemon.getNickname() + " suffers " + burningDmg + " burning damage");
			pokemon.takeDmg(burningDmg);
			System.out.println(pokemon.getNickname()+"'s HP goes to " + pokemon.getHP());
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
		public void conditionFromUser(Pokemon affected, Pokemon source) {
		}
	},

	SEEDED {
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
		public void conditionFromUser(Pokemon affected, Pokemon source) {
			int leechingDmg = (int) (affected.getBaseHP()/15);
			System.out.println(source.getNickname() + " leeches " + leechingDmg + " HP from " + affected.getNickname());
			affected.takeDmg(leechingDmg);
			source.healDmg(leechingDmg);
			System.out.println(source.getNickname() + " heals to " + source.getHP() + " HP and " + affected.getNickname() + "'s HP goes to " + affected.getHP());
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
		public void conditionFromUser(Pokemon affected, Pokemon source) {
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
			return 1;
		}

		@Override
		public void conditionFromUser(Pokemon affected, Pokemon source) {
		}
	},

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
		public void conditionFromUser(Pokemon affected, Pokemon source) {
		}
	},
	
	PARALYZED {
		@Override
		public void conditionCheckBegin(Pokemon pokemon) {
			pokemon.changeSPD(-(pokemon.getSPD()*0.75));	
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
			return 1;
		}

		@Override
		public void conditionFromUser(Pokemon affected, Pokemon source) {
			// TODO Auto-generated method stub
			
		}
	};
	

	public abstract void conditionCheckBegin(Pokemon pokemon);
	public abstract void conditionCheckEnding(Pokemon pokemon);
	public abstract void conditionCheckMove(Pokemon pokemon);
	public abstract double conditionDmgAdj(Pokemon pokemon);
	public abstract void conditionFromUser(Pokemon affected, Pokemon source);

}