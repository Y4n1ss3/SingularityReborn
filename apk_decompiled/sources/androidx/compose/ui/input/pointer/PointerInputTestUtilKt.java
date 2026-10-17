package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import defpackage.ac;
import defpackage.dq;
import defpackage.ny;
import defpackage.o;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j, long j2, float f, float f2, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m6078constructorimpl(j), j2, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), true, 1.0f, j2, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), false, false, 0, 0L, 0.0f, 0L, 7680, (dq) null);
        return (list == null || list.isEmpty()) ? pointerInputChange : PointerInputChange.m6087copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j, long j2, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        float f3 = (i & 4) != 0 ? 0.0f : f;
        float f4 = (i & 8) != 0 ? 0.0f : f2;
        if ((i & 16) != 0) {
            list = null;
        }
        return down(j, j3, f3, f4, list);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m6153invokeOverAllPassesH0pRuoY(ny nyVar, PointerEvent pointerEvent, long j) {
        m6157invokeOverPasseshUlJWOE(nyVar, pointerEvent, (List<? extends PointerEventPass>) y80.E(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m6154invokeOverAllPassesH0pRuoY$default(ny nyVar, PointerEvent pointerEvent, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = IntSize.m7777constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m6153invokeOverAllPassesH0pRuoY(nyVar, pointerEvent, j);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m6155invokeOverPasshUlJWOE(ny nyVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        m6157invokeOverPasseshUlJWOE(nyVar, pointerEvent, (List<? extends PointerEventPass>) y80.D(pointerEventPass), j);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m6156invokeOverPasshUlJWOE$default(ny nyVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSize.m7777constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m6155invokeOverPasshUlJWOE(nyVar, pointerEvent, pointerEventPass, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m6157invokeOverPasseshUlJWOE(ny nyVar, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j) {
        if (pointerEvent.getChanges().isEmpty()) {
            o.m("invokeOverPasses called with no changes");
            return;
        }
        if (list.isEmpty()) {
            o.m("invokeOverPasses called with no passes");
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nyVar.invoke(pointerEvent, list.get(i), IntSize.m7774boximpl(j));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m6160invokeOverPasseshUlJWOE$default(ny nyVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSize.m7777constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m6158invokeOverPasseshUlJWOE(nyVar, pointerEvent, pointerEventPassArr, j);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j, float f, float f2) {
        long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long m6101getPositionF1C5BW0 = pointerInputChange.m6101getPositionF1C5BW0();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j;
        float intBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.m6101getPositionF1C5BW0() >> 32)) + f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.m6101getPositionF1C5BW0() & 4294967295L)) + f2;
        return new PointerInputChange(m6098getIdJ3iCeTQ, uptimeMillis2, Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), true, 1.0f, uptimeMillis, m6101getPositionF1C5BW0, pressed, false, 0, 0L, 0.0f, 0L, 7680, (dq) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveBy(pointerInputChange, j, f, f2);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j, float f, float f2) {
        return new PointerInputChange(pointerInputChange.m6098getIdJ3iCeTQ(), j, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.m6101getPositionF1C5BW0(), pointerInputChange.getPressed(), false, 0, 0L, 0.0f, 0L, 7680, (dq) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveTo(pointerInputChange, j, f, f2);
    }

    public static final PointerInputChange up(PointerInputChange pointerInputChange, long j) {
        long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m6098getIdJ3iCeTQ, j, pointerInputChange.m6101getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m6101getPositionF1C5BW0(), pressed, false, 0, 0L, 0.0f, 0L, 7680, (dq) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m6159invokeOverPasseshUlJWOE$default(ny nyVar, PointerEvent pointerEvent, List list, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSize.m7777constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        }
        m6157invokeOverPasseshUlJWOE(nyVar, pointerEvent, (List<? extends PointerEventPass>) list, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m6158invokeOverPasseshUlJWOE(ny nyVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j) {
        m6157invokeOverPasseshUlJWOE(nyVar, pointerEvent, (List<? extends PointerEventPass>) ac.n0(pointerEventPassArr), j);
    }
}
