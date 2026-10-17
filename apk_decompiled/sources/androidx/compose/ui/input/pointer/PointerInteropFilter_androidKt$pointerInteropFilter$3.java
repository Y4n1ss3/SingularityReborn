package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends f30 implements ky {
    final /* synthetic */ AndroidViewHolder $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$view = androidViewHolder;
    }

    @Override // defpackage.ky
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean dispatchTouchEvent;
        int actionMasked = motionEvent.getActionMasked();
        AndroidViewHolder androidViewHolder = this.$view;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
