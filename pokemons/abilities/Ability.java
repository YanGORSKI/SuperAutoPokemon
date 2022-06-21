package pokemons.abilities;

import pokemons.Pokemon;
import pokemons.moves.Move;
import pokemons.types.PokeType;

public enum Ability {
	OVERGROW {
		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			if(user.getHP() <= (user.getBaseHP()/3) && move.getType() == PokeType.GRASS) {
				System.out.println(user.getName() + "'s GRASS moves are enhanced!");
				return 1.5;
			}
			return 1.0;
		}

		@Override
		public
		void abilityCheck(Pokemon user) {}
		@Override
		public
		void abilityCheck(Pokemon user, Pokemon target) {}
		@Override
		public
		void abilityCheck(Pokemon user, Pokemon target, Move move) {}
	}
	,
	BLAZE{
		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			if(user.getHP() <= (user.getBaseHP()/3) && move.getType() == PokeType.FIRE) {
				System.out.println(user.getName() + "'s FIRE moves are enhanced!");
				return 1.5;
			}
			return 1.0;
		}

		@Override
		public
		void abilityCheck(Pokemon user) {}
		@Override
		public
		void abilityCheck(Pokemon user, Pokemon target) {}
		@Override
		public
		void abilityCheck(Pokemon user, Pokemon target, Move move) {}
	},
	
	TORRENT{
		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			if(user.getHP() <= (user.getBaseHP()/3) && move.getType() == PokeType.WATER) {
				System.out.println(user.getName() + "'s WATER moves are enhanced!");
				return 1.5;
			}
			return 1.0;
		}

		@Override
		public
		void abilityCheck(Pokemon user) {}
		@Override
		public
		void abilityCheck(Pokemon user, Pokemon target) {}
		@Override
		public
		void abilityCheck(Pokemon user, Pokemon target, Move move) {}
	},
	
	SNIPER {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	
	KEEN_EYE {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	GUTS {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	LIGHTNING_ROD {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	STATIC {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	INTIMIDATE {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	TANGLED_FEET {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	HUSTLE {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	SHED_SKIN {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	},
	
	SHIELD_DUST {

		@Override
		public void abilityCheck(Pokemon user) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public double abilityCheckDmg(Pokemon user, Move move) {
			// TODO Auto-generated method stub
			return 1.0;
		}

		@Override
		public void abilityCheck(Pokemon user, Pokemon target, Move move) {
			// TODO Auto-generated method stub
			
		}

	}
	;
	
	public abstract void abilityCheck(Pokemon user);
	public abstract void abilityCheck(Pokemon user, Pokemon target);
	public abstract double abilityCheckDmg(Pokemon user, Move move);
	public abstract void abilityCheck(Pokemon user, Pokemon target, Move move);

}
