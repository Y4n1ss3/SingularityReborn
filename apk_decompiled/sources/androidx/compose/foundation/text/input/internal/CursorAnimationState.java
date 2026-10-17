package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import defpackage.hm;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;
    private AtomicReference<z10> animationJob = new AtomicReference<>(null);
    private final MutableFloatState cursorAlpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f) {
        this.cursorAlpha$delegate.setFloatValue(f);
    }

    public final void cancelAndHide() {
        z10 andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha$delegate.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(hm hmVar) {
        Object n = p10.n(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), hmVar);
        return n == vn.d ? n : w01.a;
    }
}
