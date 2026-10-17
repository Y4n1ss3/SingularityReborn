package androidx.compose.runtime;

import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GapCompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;
    private final Composition composition;

    public GapCompositionDataImpl(Composition composition) {
        this.composition = composition;
    }

    private final CompositionContext getContext(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getParent();
        }
        return null;
    }

    private final SlotStorage getSlotTable(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getSlotStorage$runtime();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GapCompositionDataImpl) && q10.b(this.composition, ((GapCompositionDataImpl) obj).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return getSlotTable().find(obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionGroup findContextGroup() {
        SlotStorage slotTable;
        SlotTable asGapBufferSlotTable;
        CompositionContext context;
        Integer findSubcompositionContextGroup;
        Composition parent = getParent(this.composition);
        if (parent == null || (slotTable = getSlotTable(parent)) == null || (asGapBufferSlotTable = SlotTableKt.asGapBufferSlotTable(slotTable)) == null || (context = getContext(this.composition)) == null || (findSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(asGapBufferSlotTable, context)) == null) {
            return null;
        }
        return SlotTableKt.compositionGroupOf(asGapBufferSlotTable, findSubcompositionContextGroup.intValue());
    }

    public final Composition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionInstance getParent() {
        Composition parent = getParent(this.composition);
        if (parent != null) {
            return new GapCompositionDataImpl(parent);
        }
        return null;
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return getSlotTable().isEmpty();
    }

    private final Composition getParent(Composition composition) {
        CompositionContext context = getContext(composition);
        if (context != null) {
            return context.getComposition$runtime();
        }
        return null;
    }

    private final SlotTable getSlotTable() {
        Composition composition = this.composition;
        composition.getClass();
        return SlotTableKt.asGapBufferSlotTable(((CompositionImpl) composition).getSlotStorage$runtime());
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionData getData() {
        return this;
    }
}
