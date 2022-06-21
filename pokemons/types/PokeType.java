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
			if (target.getType2() != PokeType.NULL) {
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
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			}
			return adj;
		}
	},
	
	POISON
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(POISON, GROUND,ROCK, GHOST);
			final Set<PokeType> advantageTypes = Set.of(GRASS);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			} 
			return adj;
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
			if (target.getType2() != PokeType.NULL) {
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
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			} 
			return adj;
		}
	},
	
	BUG
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(FIRE, FIGHTING, POISON, FLYING, GHOST);
			final Set<PokeType> advantageTypes = Set.of(GRASS, PSYCHIC);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			} 
			return adj;
		}
	},
	
	PSYCHIC
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(PSYCHIC);
			final Set<PokeType> advantageTypes = Set.of(FIGHTING, POISON);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			} 
			return adj;
		}
	},
	
	FLYING
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(ELECTRIC, ROCK);
			final Set<PokeType> advantageTypes = Set.of(GRASS, FIGHTING, BUG);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
			} 
			return adj;
		}
	},
	
	ELECTRIC
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(ELECTRIC, GRASS, DRAGON);
			final Set<PokeType> advantageTypes = Set.of(WATER, FLYING);
			final Set<PokeType> zeroTypes = Set.of(GROUND);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
		}
	},
	
	GROUND
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(GRASS, BUG);
			final Set<PokeType> advantageTypes = Set.of(FIRE, ELECTRIC, POISON, ROCK);
			final Set<PokeType> zeroTypes = Set.of(FLYING);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
		}
	},
	
	FIGHTING
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(POISON, FLYING, PSYCHIC, BUG);
			final Set<PokeType> advantageTypes = Set.of(NORMAL, ICE, ROCK);
			final Set<PokeType> zeroTypes = Set.of(GHOST);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
		}
	},
	
	GHOST
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of();
			final Set<PokeType> advantageTypes = Set.of(PSYCHIC, GHOST);
			final Set<PokeType> zeroTypes = Set.of(NORMAL);
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
		}
	},
	
	ICE
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(FIRE, WATER, ICE);
			final Set<PokeType> advantageTypes = Set.of(GRASS, GROUND, FLYING, DRAGON);
			final Set<PokeType> zeroTypes = Set.of();
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
		}
	},
	
	ROCK
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of(FIGHTING, GROUND);
			final Set<PokeType> advantageTypes = Set.of(FIRE, ICE, FLYING, BUG);
			final Set<PokeType> zeroTypes = Set.of();
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
		}
	},
	
	DRAGON
	{
		@Override
		public double typeAdj(Pokemon target) {
			double adj = 1;
			final Set<PokeType> disadvantageTypes = Set.of();
			final Set<PokeType> advantageTypes = Set.of(DRAGON);
			final Set<PokeType> zeroTypes = Set.of();
			
			if (disadvantageTypes.contains(target.getType1())) adj = adj*0.75;
			if (advantageTypes.contains(target.getType1())) adj = adj*1.5;
			if (zeroTypes.contains(target.getType1())) adj = adj*0;
			if (target.getType2() != PokeType.NULL) {
				if (disadvantageTypes.contains(target.getType2())) adj = adj*0.75;
				if (advantageTypes.contains(target.getType2())) adj = adj*1.5;
				if (zeroTypes.contains(target.getType2())) adj = adj*0;
			} 
			return adj;
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
