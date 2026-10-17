package androidx.compose.ui.platform;

import android.view.MotionEvent;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$handleRotaryEvent$1 extends f30 implements iy {
    final /* synthetic */ MotionEvent $event;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$handleRotaryEvent$1(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        super(0);
        this.this$0 = androidComposeView;
        this.$event = motionEvent;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        boolean dispatchGenericMotionEvent;
        dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent(this.$event);
        return Boolean.valueOf(dispatchGenericMotionEvent);
    }
}
