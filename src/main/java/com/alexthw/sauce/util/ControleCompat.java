package com.alexthw.sauce.util;

import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;
import com.hollingsworth.arsnouveau.api.spell.IFilter;
import dev.qther.ars_controle.spell.filter.FilterBinary;
import dev.qther.ars_controle.spell.filter.FilterUnary;

import java.util.List;

public class ControleCompat {
    public static int checkAdaptiveFilters(List<AbstractSpellPart> subList, int i, IFilter filter) {
        if (filter instanceof FilterBinary) {
            return Math.min(i + 2, subList.size());
        } else if (filter instanceof FilterUnary) {
            return Math.min(i + 1, subList.size());
        } else return i;
    }
}
