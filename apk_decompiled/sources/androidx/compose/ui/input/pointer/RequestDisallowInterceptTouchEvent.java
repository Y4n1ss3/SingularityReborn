package androidx.compose.ui.input.pointer;

import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RequestDisallowInterceptTouchEvent implements ky {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    public final PointerInteropFilter getPointerInteropFilter$ui() {
        return this.pointerInteropFilter;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return w01.a;
    }

    public final void setPointerInteropFilter$ui(PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.setDisallowIntercept$ui(z);
        }
    }
}
