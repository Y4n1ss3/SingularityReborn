package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerEvent lastEventDispatchedToInitialPass;
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent, boolean z) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                stopDispatching(pointerEvent);
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui = getLayoutCoordinates$ui();
        if (layoutCoordinates$ui == null) {
            o.f("layoutCoordinates not set");
            return;
        }
        PointerInteropUtils_androidKt.m6162toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui.mo6245localToRootMKHz9U(Offset.Companion.m4532getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this, this.this$0));
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
            }
            InternalPointerEvent internalPointerEvent$ui = pointerEvent.getInternalPointerEvent$ui();
            if (internalPointerEvent$ui != null) {
                internalPointerEvent$ui.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui());
            }
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui(false);
        this.lastEventDispatchedToInitialPass = null;
    }

    private final void stopDispatching(PointerEvent pointerEvent) {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            LayoutCoordinates layoutCoordinates$ui = getLayoutCoordinates$ui();
            if (layoutCoordinates$ui == null) {
                o.f("layoutCoordinates not set");
                return;
            }
            PointerInteropUtils_androidKt.m6161toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui.mo6245localToRootMKHz9U(Offset.Companion.m4532getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$stopDispatching$1(this.this$0));
        }
        this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.this$0));
            reset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117 A[ORIG_RETURN, RETURN] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6126onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = changes.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!changes.get(i2).isConsumed()) {
                }
            }
            z2 = true;
            if (!this.this$0.getDisallowIntercept$ui()) {
                int size3 = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        PointerInputChange pointerInputChange2 = changes.get(i3);
                        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
                if (pointerEventPass == PointerEventPass.Initial && z3) {
                    this.lastEventDispatchedToInitialPass = pointerEvent;
                    dispatchToView(pointerEvent, !z || this.this$0.getDisallowIntercept$ui());
                }
                if (pointerEventPass == PointerEventPass.Main && z && pointerEvent == this.lastEventDispatchedToInitialPass && this.this$0.getDisallowIntercept$ui()) {
                    int size4 = changes.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        changes.get(i4).consume();
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && !z3 && pointerEvent != this.lastEventDispatchedToInitialPass) {
                    dispatchToView(pointerEvent, true);
                }
            }
            if (pointerEventPass != PointerEventPass.Final) {
                int size5 = changes.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        reset();
                        break;
                    } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (pointerEvent == this.lastEventDispatchedToInitialPass && z) {
                    int size6 = changes.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!changes.get(i6).isConsumed()) {
                            i6++;
                        } else if (!this.this$0.getDisallowIntercept$ui()) {
                            stopDispatching(pointerEvent);
                            return;
                        }
                    }
                    int size7 = changes.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        changes.get(i7).consume();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (!this.this$0.getDisallowIntercept$ui()) {
        }
        z3 = true;
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
        }
        if (pointerEventPass != PointerEventPass.Final) {
        }
    }
}
