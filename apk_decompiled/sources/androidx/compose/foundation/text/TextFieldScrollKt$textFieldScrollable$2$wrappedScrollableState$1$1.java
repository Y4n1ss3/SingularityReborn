package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 implements ScrollableState {
    private final /* synthetic */ ScrollableState $$delegate_0;
    private final State canScrollBackward$delegate;
    private final State canScrollForward$delegate;

    public TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(ScrollableState scrollableState, final TextFieldScrollerPosition textFieldScrollerPosition) {
        this.$$delegate_0 = scrollableState;
        final int i = 0;
        this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new iy() { // from class: fu0
            @Override // defpackage.iy
            public final Object invoke() {
                boolean canScrollForward_delegate$lambda$0;
                int i2 = i;
                TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                switch (i2) {
                    case 0:
                        canScrollForward_delegate$lambda$0 = TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.canScrollForward_delegate$lambda$0(textFieldScrollerPosition2);
                        break;
                    default:
                        canScrollForward_delegate$lambda$0 = TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.canScrollBackward_delegate$lambda$1(textFieldScrollerPosition2);
                        break;
                }
                return Boolean.valueOf(canScrollForward_delegate$lambda$0);
            }
        });
        final int i2 = 1;
        this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new iy() { // from class: fu0
            @Override // defpackage.iy
            public final Object invoke() {
                boolean canScrollForward_delegate$lambda$0;
                int i22 = i2;
                TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                switch (i22) {
                    case 0:
                        canScrollForward_delegate$lambda$0 = TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.canScrollForward_delegate$lambda$0(textFieldScrollerPosition2);
                        break;
                    default:
                        canScrollForward_delegate$lambda$0 = TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.canScrollBackward_delegate$lambda$1(textFieldScrollerPosition2);
                        break;
                }
                return Boolean.valueOf(canScrollForward_delegate$lambda$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canScrollBackward_delegate$lambda$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        return textFieldScrollerPosition.getOffset() > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canScrollForward_delegate$lambda$0(TextFieldScrollerPosition textFieldScrollerPosition) {
        return textFieldScrollerPosition.getOffset() < textFieldScrollerPosition.getMaximum();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.$$delegate_0.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.$$delegate_0.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.$$delegate_0.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this.$$delegate_0.getScrollIndicatorState();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.$$delegate_0.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        return this.$$delegate_0.scroll(mutatePriority, myVar, hmVar);
    }
}
