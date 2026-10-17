package androidx.compose.ui.platform;

import android.view.KeyEvent;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$dispatchKeyEvent$1 extends f30 implements iy {
    final /* synthetic */ KeyEvent $event;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$dispatchKeyEvent$1(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        super(0);
        this.this$0 = androidComposeView;
        this.$event = keyEvent;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        boolean dispatchKeyEvent;
        dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent(this.$event);
        return Boolean.valueOf(dispatchKeyEvent);
    }
}
