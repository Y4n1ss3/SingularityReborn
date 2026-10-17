package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$derivedIsAttached$2 extends f30 implements iy {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$derivedIsAttached$2(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        boolean isAttached;
        isAttached = this.this$0.isAttached();
        return Boolean.valueOf(isAttached);
    }
}
