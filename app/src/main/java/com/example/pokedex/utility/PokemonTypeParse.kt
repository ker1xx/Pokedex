package com.example.pokedex.utility

import androidx.compose.ui.graphics.Color
import com.example.pokedex.data.remote.responses.Stat
import com.example.pokedex.data.remote.responses.Type
import com.example.pokedex.ui.theme.AttackColor
import com.example.pokedex.ui.theme.BugType
import com.example.pokedex.ui.theme.DarkType
import com.example.pokedex.ui.theme.DefenceColor
import com.example.pokedex.ui.theme.DragonType
import com.example.pokedex.ui.theme.ElectricType
import com.example.pokedex.ui.theme.FairyType
import com.example.pokedex.ui.theme.FightingType
import com.example.pokedex.ui.theme.FireType
import com.example.pokedex.ui.theme.FlyingType
import com.example.pokedex.ui.theme.GhostType
import com.example.pokedex.ui.theme.GrassType
import com.example.pokedex.ui.theme.GroundType
import com.example.pokedex.ui.theme.HPColor
import com.example.pokedex.ui.theme.IceType
import com.example.pokedex.ui.theme.NormalType
import com.example.pokedex.ui.theme.PoisonType
import com.example.pokedex.ui.theme.PsychicType
import com.example.pokedex.ui.theme.RockType
import com.example.pokedex.ui.theme.SpecialAttackColor
import com.example.pokedex.ui.theme.SpecialDefenceColor
import com.example.pokedex.ui.theme.SpeedColor
import com.example.pokedex.ui.theme.SteelType
import com.example.pokedex.ui.theme.WaterType
import java.util.Locale

fun parseTypeToColor(type: Type) : Color {
    return when (type.type.name){
        "grass" -> GrassType
        "poison" -> PoisonType
        "fire" -> FireType
        "flying" -> FlyingType
        "water" -> WaterType
        "bug" -> BugType
        "normal" -> NormalType
        "electric" -> ElectricType
        "ground" -> GroundType
        "fairy" -> FairyType
        "fighting" -> FightingType
        "psychic" -> PsychicType
        "rock" -> RockType
        "steel" -> SteelType
        "ice" -> IceType
        "ghost" -> GhostType
        "dragon" -> DragonType
        "dark" -> DarkType
        else -> NormalType
    }
}

fun parseStatToAbbr(stat: Stat) : String{
    return when (stat.stat.name.toLowerCase(Locale.ROOT)){
       "hp" -> "HP"
       "attack" -> "Attack"
       "defense" -> "Defense"
       "special-attack" -> "Special Attack"
       "special-defense" -> "Special Defence"
       "speed" -> "Speed"
       else -> ""
    }
}

fun parseStatToColor(stat: Stat): Color{
    return when (stat.stat.name.toLowerCase(Locale.ROOT)){
        "hp" -> HPColor
        "attack" -> AttackColor
        "defense" -> DefenceColor
        "special-attack" -> SpecialAttackColor
        "special-defense" -> SpecialDefenceColor
        "speed" -> SpeedColor
        else -> Color.White
    }
}