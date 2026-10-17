package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends f30 implements ky {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    public final void invoke(MotionEvent motionEvent) {
        this.this$0.getOnTouchEvent().invoke(motionEvent);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return w01.a;
    }
}
