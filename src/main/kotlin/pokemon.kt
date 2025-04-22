fun main(){
    val pokemons = mapOf(
        "Bulbasaur" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Ivysaur" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Venusaur" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Charmander" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Charmeleon" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Charizard" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Squirtle" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Wartortle" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Blastoise" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Caterpie" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio")
        ),
        "Metapod" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio")
        ),
        "Butterfree" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Weedle" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Kakuna" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Beedrill" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Pidgey" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Pidgeotto" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Pidgeot" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Rattata" to mapOf(
            "Normal" to emptyList()
        ),
        "Raticate" to mapOf(
            "Normal" to emptyList()
        ),
        "Spearow" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Fearow" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Ekans" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Arbok" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Pikachu" to mapOf(
            "Elétrico" to listOf("Água", "Voador")
        ),
        "Raichu" to mapOf(
            "Elétrico" to listOf("Água", "Voador")
        ),
        "Sandshrew" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Sandslash" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Nidoran♀" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Nidorina" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Nidoqueen" to mapOf(
            "Veneno" to listOf("Grama", "Fada"),
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Nidoking" to mapOf(
            "Veneno" to listOf("Grama", "Fada"),
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Clefairy" to mapOf(
            "Fada" to listOf("Lutador", "Dragão", "Sombrio")
        ),
        "Clefable" to mapOf(
            "Fada" to listOf("Lutador", "Dragão", "Sombrio")
        ),
        "Vulpix" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Ninetales" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Jigglypuff" to mapOf(
            "Normal" to emptyList(),
            "Fada" to listOf("Lutador", "Dragão", "Sombrio")
        ),
        "Wigglytuff" to mapOf(
            "Normal" to emptyList(),
            "Fada" to listOf("Lutador", "Dragão", "Sombrio")
        ),
        "Zubat" to mapOf(
            "Veneno" to listOf("Grama", "Fada"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Golbat" to mapOf(
            "Veneno" to listOf("Grama", "Fada"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Oddish" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Gloom" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Vileplume" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Paras" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Grama" to listOf("Água", "Terra", "Pedra")
        ),
        "Parasect" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Grama" to listOf("Água", "Terra", "Pedra")
        ),
        "Venonat" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Venomoth" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Diglett" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Dugtrio" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Meowth" to mapOf(
            "Normal" to emptyList()
        ),
        "Persian" to mapOf(
            "Normal" to emptyList()
        ),
        "Psyduck" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Golduck" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Mankey" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Primeape" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Growlithe" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Arcanine" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Poliwag" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Poliwhirl" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Poliwrath" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Abra" to mapOf(
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Kadabra" to mapOf(
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Alakazam" to mapOf(
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Machop" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Machoke" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Machamp" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Bellsprout" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Weepinbell" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Victreebel" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Tentacool" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Tentacruel" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Geodude" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Graveler" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Golem" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Ponyta" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Rapidash" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Slowpoke" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Slowbro" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Magnemite" to mapOf(
            "Elétrico" to listOf("Água", "Voador"),
            "Metal" to listOf("Fada", "Pedra", "Gelo")
        ),
        "Magneton" to mapOf(
            "Elétrico" to listOf("Água", "Voador"),
            "Metal" to listOf("Fada", "Pedra", "Gelo")
        ),
        "Farfetch'd" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Doduo" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Dodrio" to mapOf(
            "Normal" to emptyList(),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Seel" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Dewgong" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Gelo" to listOf("Grama", "Terra", "Dragão", "Voador")
        ),
        "Grimer" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Muk" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Shellder" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Cloyster" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Gelo" to listOf("Grama", "Terra", "Dragão", "Voador")
        ),
        "Gastly" to mapOf(
            "Fantasma" to listOf("Fantasma", "Psíquico"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Haunter" to mapOf(
            "Fantasma" to listOf("Fantasma", "Psíquico"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Gengar" to mapOf(
            "Fantasma" to listOf("Fantasma", "Psíquico"),
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Onix" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Drowzee" to mapOf(
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Hypno" to mapOf(
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Krabby" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Kingler" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Voltorb" to mapOf(
            "Elétrico" to listOf("Água", "Voador")
        ),
        "Electrode" to mapOf(
            "Elétrico" to listOf("Água", "Voador")
        ),
        "Exeggcute" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Exeggutor" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra"),
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Cubone" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Marowak" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra")
        ),
        "Hitmonlee" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Hitmonchan" to mapOf(
            "Lutador" to listOf("Normal", "Gelo", "Pedra", "Sombrio", "Metal")
        ),
        "Lickitung" to mapOf(
            "Normal" to emptyList()
        ),
        "Koffing" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Weezing" to mapOf(
            "Veneno" to listOf("Grama", "Fada")
        ),
        "Rhyhorn" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra"),
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador")
        ),
        "Rhydon" to mapOf(
            "Terra" to listOf("Fogo", "Elétrico", "Metal", "Veneno", "Pedra"),
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador")
        ),
        "Chansey" to mapOf(
            "Normal" to emptyList()
        ),
        "Tangela" to mapOf(
            "Grama" to listOf("Água", "Terra", "Pedra")
        ),
        "Kangaskhan" to mapOf(
            "Normal" to emptyList()
        ),
        "Horsea" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Seadra" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Goldeen" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Seaking" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Staryu" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Starmie" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Mr. Mime" to mapOf(
            "Psíquico" to listOf("Lutador", "Veneno"),
            "Fada" to listOf("Lutador", "Dragão", "Sombrio")
        ),
        "Scyther" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Jynx" to mapOf(
            "Gelo" to listOf("Grama", "Terra", "Dragão", "Voador"),
            "Psíquico" to listOf("Lutador", "Veneno")
        ),
        "Electabuzz" to mapOf(
            "Elétrico" to listOf("Água", "Voador")
        ),
        "Magmar" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Pinsir" to mapOf(
            "Inseto" to listOf("Grama", "Psíquico", "Sombrio")
        ),
        "Tauros" to mapOf(
            "Normal" to emptyList()
        ),
        "Magikarp" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Gyarados" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Lapras" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra"),
            "Gelo" to listOf("Grama", "Terra", "Dragão", "Voador")
        ),
        "Ditto" to mapOf(
            "Normal" to emptyList()
        ),
        "Eevee" to mapOf(
            "Normal" to emptyList()
        ),
        "Vaporeon" to mapOf(
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Jolteon" to mapOf(
            "Elétrico" to listOf("Água", "Voador")
        ),
        "Flareon" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal")
        ),
        "Porygon" to mapOf(
            "Normal" to emptyList()
        ),
        "Omanyte" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Omastar" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Kabuto" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Kabutops" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Água" to listOf("Fogo", "Terra", "Pedra")
        ),
        "Aerodactyl" to mapOf(
            "Pedra" to listOf("Fogo", "Gelo", "Inseto", "Voador"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Snorlax" to mapOf(
            "Normal" to emptyList()
        ),
        "Articuno" to mapOf(
            "Gelo" to listOf("Grama", "Terra", "Dragão", "Voador"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Zapdos" to mapOf(
            "Elétrico" to listOf("Água", "Voador"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Moltres" to mapOf(
            "Fogo" to listOf("Grama", "Gelo", "Inseto", "Metal"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        ),
        "Dratini" to mapOf(
            "Dragão" to listOf("Dragão")
        ),
        "Dragonair" to mapOf(
            "Dragão" to listOf("Dragão")
        ),
        "Dragonite" to mapOf(
            "Dragão" to listOf("Dragão"),
            "Voador" to listOf("Grama", "Inseto", "Lutador")
        )
    )
}
