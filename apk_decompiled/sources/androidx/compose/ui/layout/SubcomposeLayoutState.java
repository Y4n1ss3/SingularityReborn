package androidx.compose.ui.layout;

import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.unit.IntSize;
import defpackage.er;
import defpackage.ky;
import defpackage.my;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final my setCompositionContext;
    private final my setMeasurePolicy;
    private final my setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* loaded from: classes.dex */
    public interface PausedPrecomposition {
        PrecomposedSlotHandle apply();

        void cancel();

        boolean isComplete();

        boolean resume(ShouldPauseCallback shouldPauseCallback);
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setCompositionContext = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        o.m("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public final PausedPrecomposition createPausedPrecomposition(Object obj, my myVar) {
        return getState().precomposePaused(obj, myVar);
    }

    public final void forceRecomposeChildren$ui() {
        getState().forceRecomposeChildren();
    }

    public final my getSetCompositionContext$ui() {
        return this.setCompositionContext;
    }

    public final my getSetMeasurePolicy$ui() {
        return this.setMeasurePolicy;
    }

    public final my getSetRoot$ui() {
        return this.setRoot;
    }

    public final PrecomposedSlotHandle precompose(Object obj, my myVar) {
        return getState().precompose(obj, myVar);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @er
    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: getSize-YEO4UFw */
        default long mo6261getSizeYEO4UFw(int i) {
            return IntSize.Companion.m7787getZeroYbymL2g();
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo6262premeasure0kLqBqw(int i, long j) {
        }

        default void traverseDescendants(Object obj, ky kyVar) {
        }
    }
}
