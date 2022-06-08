package pokemons.types;

import java.util.Set;

import pokemons.Pokemon;

public enum PokeType {
	NORMAL
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(ROCK);
			final Set<PokeType> zeroTypes = Set.of(GHOST);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != null) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			}
			return adj;
		}
	},
	GRASS
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(FIRE, GRASS, POISON, FLYING, BUG, DRAGON);
			final Set<PokeType> advantageTypes = Set.of(WATER, GROUND, ROCK);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != null) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			}
			return adj;
		}
	},
	POISON
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	FIRE
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(FIRE, WATER, ROCK, DRAGON);
			final Set<PokeType> advantageTypes = Set.of(GRASS, ICE, BUG);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != null) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			}
			return adj;
		}
	},
	WATER
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(WATER, GRASS, DRAGON);
			final Set<PokeType> advantageTypes = Set.of(FIRE, GROUND, ROCK);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != null) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			} 
			return adj;
		}
	},
	BUG
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	PSYCHIC
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	FLYING
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	ELECTRIC
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	GROUND
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	FIGHTING
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	GHOST
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	ICE
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	ROCK
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	DRAGON
	{
		public double typeAdj(Pokemon target) {
			return 0.0;
		}
	},
	NULL
	{
		public double typeAdj(Pokemon target) {
			return 1.0;
		}
	};
	
	public abstract double typeAdj(Pokemon target);

	@Override
	public String toString() {
		if (this.equals(PokeType.NULL)) {
			return "";
		} else {
			return "["+this.name()+"]";
		}
	}
	
}
