package io.github.mcroteau;

import io.github.mcroteau.Parakeet;
import io.github.mcroteau.resources.access.Accessor;
import io.github.mcroteau.resources.access.impl.MockAccessor;

public class ParakeetFactory {

    Parakeet parakeet;
    Accessor mockAccessor;

    public ParakeetFactory(){
        mockAccessor = new MockAccessor();
        parakeet = new Parakeet(mockAccessor);
    }

    public Parakeet getParakeet(){
        return this.parakeet;
    }

}