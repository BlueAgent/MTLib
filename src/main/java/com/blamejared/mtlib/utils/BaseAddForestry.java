package com.blamejared.mtlib.utils;

import forestry.api.recipes.ICraftingProvider;
import forestry.api.recipes.IForestryRecipe;

public abstract class BaseAddForestry<R extends IForestryRecipe> extends BaseAction {
    protected ICraftingProvider<R> provider;
    protected R recipe;

    protected BaseAddForestry(String name, ICraftingProvider<R> provider, R recipe) {
        super(name);
        this.provider = provider;
        this.recipe = recipe;
    }

    @Override
    public void apply() {
        provider.addRecipe(recipe);
    }
}
