package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import defpackage.dq;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidIndirectPointerEvent implements PlatformIndirectPointerEvent {
    public static final int $stable = 8;
    private final List<IndirectPointerInputChange> changes;
    private final MotionEvent nativeEvent;
    private final int primaryDirectionalMotionAxis;
    private final int type;

    private AndroidIndirectPointerEvent(List<IndirectPointerInputChange> list, int i, int i2, MotionEvent motionEvent) {
        this.changes = list;
        this.type = i;
        this.primaryDirectionalMotionAxis = i2;
        this.nativeEvent = motionEvent;
        if (getChanges().isEmpty()) {
            o.m("changes cannot be empty");
            throw null;
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    public List<IndirectPointerInputChange> getChanges() {
        return this.changes;
    }

    public final MotionEvent getNativeEvent$ui() {
        return this.nativeEvent;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public int mo5579getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getType-4ZHQPSE, reason: not valid java name */
    public int mo5580getType4ZHQPSE() {
        return this.type;
    }

    public /* synthetic */ AndroidIndirectPointerEvent(List list, int i, int i2, MotionEvent motionEvent, dq dqVar) {
        this(list, i, i2, motionEvent);
    }
}
