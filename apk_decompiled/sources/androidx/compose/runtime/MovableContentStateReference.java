package androidx.compose.runtime;

import defpackage.xe0;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;
    private final Anchor anchor;
    private final ControlledComposition composition;
    private final MovableContent<Object> content;
    private List<? extends xe0> invalidations;
    private final PersistentCompositionLocalMap locals;
    private final List<MovableContentStateReference> nestedReferences;
    private final Object parameter;
    private final SlotStorage slotStorage;

    public MovableContentStateReference(MovableContent<Object> movableContent, Object obj, ControlledComposition controlledComposition, SlotStorage slotStorage, Anchor anchor, List<? extends xe0> list, PersistentCompositionLocalMap persistentCompositionLocalMap, List<MovableContentStateReference> list2) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotStorage = slotStorage;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }

    public final Anchor getAnchor$runtime() {
        return this.anchor;
    }

    public final ControlledComposition getComposition$runtime() {
        return this.composition;
    }

    public final MovableContent<Object> getContent$runtime() {
        return this.content;
    }

    public final List<xe0> getInvalidations$runtime() {
        return this.invalidations;
    }

    public final PersistentCompositionLocalMap getLocals$runtime() {
        return this.locals;
    }

    public final List<MovableContentStateReference> getNestedReferences$runtime() {
        return this.nestedReferences;
    }

    public final Object getParameter$runtime() {
        return this.parameter;
    }

    public final SlotStorage getSlotStorage$runtime() {
        return this.slotStorage;
    }

    public final void setInvalidations$runtime(List<? extends xe0> list) {
        this.invalidations = list;
    }

    public final void transferPendingInvalidations$runtime() {
        if (this.anchor.getValid()) {
            List<? extends xe0> list = this.invalidations;
            ControlledComposition controlledComposition = this.composition;
            controlledComposition.getClass();
            this.invalidations = yi.A0(list, ((CompositionImpl) controlledComposition).extractInvalidationsOf$runtime(this.anchor));
        }
    }
}
