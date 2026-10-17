package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import defpackage.bv;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long panGestureOffset;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final float scaleGestureFactor;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7, int i2, dq dqVar) {
        this(j, j2, j3, j4, z, f, i, (i2 & Fields.SpotShadowColor) != 0 ? false : z2, (i2 & Fields.RotationX) != 0 ? new ArrayList() : list, (i2 & Fields.RotationY) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j5, f2, j6, (i2 & Fields.TransformOrigin) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j7, null);
    }

    /* renamed from: copy-hf9UmOk$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m6107copyhf9UmOk$default(PointerInputEventData pointerInputEventData, long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7, int i2, Object obj) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12 = (i2 & 1) != 0 ? pointerInputEventData.id : j;
        long j13 = (i2 & 2) != 0 ? pointerInputEventData.uptime : j2;
        long j14 = (i2 & 4) != 0 ? pointerInputEventData.positionOnScreen : j3;
        long j15 = (i2 & 8) != 0 ? pointerInputEventData.position : j4;
        boolean z3 = (i2 & 16) != 0 ? pointerInputEventData.down : z;
        float f3 = (i2 & 32) != 0 ? pointerInputEventData.pressure : f;
        int i3 = (i2 & 64) != 0 ? pointerInputEventData.type : i;
        boolean z4 = (i2 & Fields.SpotShadowColor) != 0 ? pointerInputEventData.activeHover : z2;
        List list2 = (i2 & Fields.RotationX) != 0 ? pointerInputEventData.historical : list;
        if ((i2 & Fields.RotationY) != 0) {
            j8 = j12;
            j9 = pointerInputEventData.scrollDelta;
        } else {
            j8 = j12;
            j9 = j5;
        }
        long j16 = j9;
        float f4 = (i2 & Fields.RotationZ) != 0 ? pointerInputEventData.scaleGestureFactor : f2;
        long j17 = (i2 & Fields.CameraDistance) != 0 ? pointerInputEventData.panGestureOffset : j6;
        if ((i2 & Fields.TransformOrigin) != 0) {
            j11 = j17;
            j10 = pointerInputEventData.originalEventPosition;
        } else {
            j10 = j7;
            j11 = j17;
        }
        return pointerInputEventData.m6115copyhf9UmOk(j8, j13, j14, j15, z3, f3, i3, z4, list2, j16, f4, j11, j10);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m6108component1J3iCeTQ() {
        return this.id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m6109component10F1C5BW0() {
        return this.scrollDelta;
    }

    public final float component11() {
        return this.scaleGestureFactor;
    }

    /* renamed from: component12-F1C5BW0, reason: not valid java name */
    public final long m6110component12F1C5BW0() {
        return this.panGestureOffset;
    }

    /* renamed from: component13-F1C5BW0, reason: not valid java name */
    public final long m6111component13F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m6112component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m6113component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m6114component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-hf9UmOk, reason: not valid java name */
    public final PointerInputEventData m6115copyhf9UmOk(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, float f2, long j6, long j7) {
        return new PointerInputEventData(j, j2, j3, j4, z, f, i, z2, list, j5, f2, j6, j7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m6080equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m4513equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m4513equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m6174equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && q10.b(this.historical, pointerInputEventData.historical) && Offset.m4513equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Float.compare(this.scaleGestureFactor, pointerInputEventData.scaleGestureFactor) == 0 && Offset.m4513equalsimpl0(this.panGestureOffset, pointerInputEventData.panGestureOffset) && Offset.m4513equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m6116getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m6117getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanGestureOffset-F1C5BW0, reason: not valid java name */
    public final long m6118getPanGestureOffsetF1C5BW0() {
        return this.panGestureOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m6119getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m6120getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final float getScaleGestureFactor() {
        return this.scaleGestureFactor;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m6121getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m6122getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return Offset.m4518hashCodeimpl(this.originalEventPosition) + ((Offset.m4518hashCodeimpl(this.panGestureOffset) + bv.a(this.scaleGestureFactor, (Offset.m4518hashCodeimpl(this.scrollDelta) + ((this.historical.hashCode() + kp0.c((PointerType.m6175hashCodeimpl(this.type) + bv.a(this.pressure, kp0.c((Offset.m4518hashCodeimpl(this.position) + ((Offset.m4518hashCodeimpl(this.positionOnScreen) + ((Long.hashCode(this.uptime) + (PointerId.m6081hashCodeimpl(this.id) * 31)) * 31)) * 31)) * 31, 31, this.down), 31)) * 31, 31, this.activeHover)) * 31)) * 31, 31)) * 31);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m6082toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m4524toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m4524toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m6176toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m4524toStringimpl(this.scrollDelta)) + ", scaleGestureFactor=" + this.scaleGestureFactor + ", panGestureOffset=" + ((Object) Offset.m4524toStringimpl(this.panGestureOffset)) + ", originalEventPosition=" + ((Object) Offset.m4524toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, float f2, long j6, long j7) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.activeHover = z2;
        this.historical = list;
        this.scrollDelta = j5;
        this.scaleGestureFactor = f2;
        this.panGestureOffset = j6;
        this.originalEventPosition = j7;
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7, dq dqVar) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, f2, j6, j7);
    }
}
