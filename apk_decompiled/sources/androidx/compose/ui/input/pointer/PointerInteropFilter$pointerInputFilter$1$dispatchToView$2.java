package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$2 extends f30 implements ky {
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    final /* synthetic */ PointerInteropFilter this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    public final void invoke(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            this.this$1.getOnTouchEvent().invoke(motionEvent);
        } else {
            this.this$0.state = ((Boolean) this.this$1.getOnTouchEvent().invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return w01.a;
    }
}
