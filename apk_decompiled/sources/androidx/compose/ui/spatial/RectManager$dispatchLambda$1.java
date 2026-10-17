package androidx.compose.ui.spatial;

import android.os.Trace;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectManager$dispatchLambda$1 extends f30 implements iy {
    final /* synthetic */ RectManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectManager$dispatchLambda$1(RectManager rectManager) {
        super(0);
        this.this$0 = rectManager;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6854invoke() {
        this.this$0.dispatchToken = null;
        RectManager rectManager = this.this$0;
        Trace.beginSection("OnPositionedDispatch");
        try {
            rectManager.dispatchCallbacks();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6854invoke();
        return w01.a;
    }
}
