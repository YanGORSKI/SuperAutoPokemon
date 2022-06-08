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
	};
	
	public abstract void abilityCheck(Pokemon user);
	public abstract void abilityCheck(Pokemon user, Pokemon target);
	public abstract double abilityCheckDmg(Pokemon user, Move move);
	public abstract void abilityCheck(Pokemon user, Pokemon target, Move move);

}
