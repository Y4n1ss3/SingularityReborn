package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.dq;
import defpackage.hm;
import defpackage.iy;
import defpackage.kl0;
import defpackage.ky;
import defpackage.ll0;
import defpackage.mb0;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new ll0(18), new kl0(22));
    private float accumulator;
    private final State canScrollBackward$delegate;
    private final State canScrollForward$delegate;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableIntState contentSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new mb0(this, 13));
    private final ScrollState$_scrollIndicatorState$1 _scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.ScrollState$_scrollIndicatorState$1
        @Override // androidx.compose.foundation.ScrollIndicatorState
        public int getContentSize() {
            return ScrollState.this.getContentSize$foundation();
        }

        @Override // androidx.compose.foundation.ScrollIndicatorState
        public int getScrollOffset() {
            return ScrollState.this.getValue();
        }

        @Override // androidx.compose.foundation.ScrollIndicatorState
        public int getViewportSize() {
            return ScrollState.this.getViewportSize();
        }
    };

    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.foundation.ScrollState$_scrollIndicatorState$1] */
    public ScrollState(int i) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        final int i2 = 0;
        this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new iy(this) { // from class: wl0
            public final /* synthetic */ ScrollState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                boolean canScrollForward_delegate$lambda$0;
                int i3 = i2;
                ScrollState scrollState = this.e;
                switch (i3) {
                    case 0:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollForward_delegate$lambda$0(scrollState);
                        break;
                    default:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollBackward_delegate$lambda$0(scrollState);
                        break;
                }
                return Boolean.valueOf(canScrollForward_delegate$lambda$0);
            }
        });
        final int i3 = 1;
        this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new iy(this) { // from class: wl0
            public final /* synthetic */ ScrollState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                boolean canScrollForward_delegate$lambda$0;
                int i32 = i3;
                ScrollState scrollState = this.e;
                switch (i32) {
                    case 0:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollForward_delegate$lambda$0(scrollState);
                        break;
                    default:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollBackward_delegate$lambda$0(scrollState);
                        break;
                }
                return Boolean.valueOf(canScrollForward_delegate$lambda$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer Saver$lambda$0(SaverScope saverScope, ScrollState scrollState) {
        return Integer.valueOf(scrollState.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollState Saver$lambda$1(int i) {
        return new ScrollState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i, AnimationSpec animationSpec, hm hmVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i, animationSpec, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canScrollBackward_delegate$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canScrollForward_delegate$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() < scrollState.getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrollableState$lambda$0(ScrollState scrollState, float f) {
        float value = scrollState.getValue() + f + scrollState.accumulator;
        float g = y80.g(value, 0.0f, scrollState.getMaxValue());
        boolean z = value == g;
        float value2 = g - scrollState.getValue();
        int round = Math.round(value2);
        scrollState.setValue(scrollState.getValue() + round);
        scrollState.accumulator = value2 - round;
        return !z ? value2 : f;
    }

    private final void setValue(int i) {
        this.value$delegate.setIntValue(i);
    }

    public final Object animateScrollTo(int i, AnimationSpec<Float> animationSpec, hm hmVar) {
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i - getValue(), animationSpec, hmVar);
        return animateScrollBy == vn.d ? animateScrollBy : w01.a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getContentSize$foundation() {
        return this.contentSize$delegate.getIntValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, myVar, hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    public final Object scrollTo(int i, hm hmVar) {
        return ScrollExtensionsKt.scrollBy(this, i - getValue(), hmVar);
    }

    public final void setContentSize$foundation(int i) {
        this.contentSize$delegate.setIntValue(i);
    }

    public final void setMaxValue$foundation(int i) {
        this._maxValueState.setIntValue(i);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i) {
                setValue(i);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void setViewportSize$foundation(int i) {
        this.viewportSize$delegate.setIntValue(i);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }

        private Companion() {
        }
    }
}
