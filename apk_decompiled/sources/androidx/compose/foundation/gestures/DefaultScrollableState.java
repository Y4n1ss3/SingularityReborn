package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultScrollableState implements ScrollableState {
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private final MutableState<Boolean> isScrollingState;
    private final ky onDelta;
    private final ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f) {
            MutableState mutableState;
            MutableState mutableState2;
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            float floatValue = ((Number) DefaultScrollableState.this.getOnDelta().invoke(Float.valueOf(f))).floatValue();
            mutableState = DefaultScrollableState.this.isLastScrollForwardState;
            mutableState.setValue(Boolean.valueOf(floatValue > 0.0f));
            mutableState2 = DefaultScrollableState.this.isLastScrollBackwardState;
            mutableState2.setValue(Boolean.valueOf(floatValue < 0.0f));
            return floatValue;
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();

    public DefaultScrollableState(ky kyVar) {
        this.onDelta = kyVar;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return ((Number) this.onDelta.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final ky getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object n = p10.n(new DefaultScrollableState$scroll$2(this, mutatePriority, myVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }
}
