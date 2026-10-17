package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.er;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private ConsumedData _consumed;
    private List<HistoricalChange> _historical;
    private PointerInputChange consumedDelegate;
    private boolean downChange;
    private final long id;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final float scaleFactor;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7, int i2, dq dqVar) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & Fields.RotationY) != 0 ? PointerType.Companion.m6181getTouchT8wyACA() : i, (i2 & Fields.RotationZ) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j6, (i2 & Fields.CameraDistance) != 0 ? 1.0f : f2, (i2 & Fields.TransformOrigin) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j7, (dq) null);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m6084copy0GkPj7c$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6, int i2, Object obj) {
        long j7;
        long j8 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j9 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j10 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        long j11 = (i2 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j12 = (i2 & 32) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & Fields.RotationX) != 0 ? pointerInputChange.type : i;
        if ((i2 & Fields.RotationY) != 0) {
            j7 = pointerInputChange.scrollDelta;
            j8 = j8;
        } else {
            j7 = j6;
        }
        return pointerInputChange.m6091copy0GkPj7c(j8, j9, j10, z3, j11, j12, z4, consumedData, i3, j7);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m6086copyJKmWfYY$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j10 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j11 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        long j12 = (i2 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j13 = (i2 & 32) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & Fields.SpotShadowColor) != 0 ? pointerInputChange.type : i;
        if ((i2 & Fields.RotationX) != 0) {
            j7 = pointerInputChange.scrollDelta;
            j8 = j9;
        } else {
            j7 = j6;
            j8 = j9;
        }
        return pointerInputChange.m6093copyJKmWfYY(j8, j10, j11, z3, j12, j13, z4, i3, j7);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m6087copyOHpmEuE$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j9 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j10 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        long j11 = (i2 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j12 = (i2 & 32) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & Fields.SpotShadowColor) != 0 ? pointerInputChange.type : i;
        if ((i2 & Fields.RotationY) != 0) {
            j7 = pointerInputChange.scrollDelta;
            j8 = j8;
        } else {
            j7 = j6;
        }
        return pointerInputChange.m6094copyOHpmEuE(j8, j9, j10, z3, j11, j12, z4, i3, list, j7);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m6088copyTn9QgHE$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j10 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j11 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        float f2 = (i2 & 16) != 0 ? pointerInputChange.pressure : f;
        long j12 = (i2 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j13 = (i2 & 64) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & Fields.SpotShadowColor) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & Fields.RotationX) != 0 ? pointerInputChange.type : i;
        if ((i2 & Fields.RotationY) != 0) {
            j7 = pointerInputChange.scrollDelta;
            j8 = j9;
        } else {
            j7 = j6;
            j8 = j9;
        }
        return pointerInputChange.m6095copyTn9QgHE(j8, j10, j11, z3, f2, j12, j13, z4, i3, j7);
    }

    /* renamed from: copy-lGhnTh8$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m6089copylGhnTh8$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, int i2, Object obj) {
        long j8;
        float f3;
        long j9 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j10 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j11 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        float f4 = (i2 & 16) != 0 ? pointerInputChange.pressure : f;
        long j12 = (i2 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j13 = (i2 & 64) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & Fields.SpotShadowColor) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & Fields.RotationX) != 0 ? pointerInputChange.type : i;
        long j14 = j9;
        List historical = (i2 & Fields.RotationY) != 0 ? pointerInputChange.getHistorical() : list;
        long j15 = (i2 & Fields.RotationZ) != 0 ? pointerInputChange.scrollDelta : j6;
        float f5 = (i2 & Fields.CameraDistance) != 0 ? pointerInputChange.scaleFactor : f2;
        if ((i2 & Fields.TransformOrigin) != 0) {
            f3 = f5;
            j8 = pointerInputChange.panOffset;
        } else {
            j8 = j7;
            f3 = f5;
        }
        return pointerInputChange.m6096copylGhnTh8(j14, j10, j11, z3, f4, j12, j13, z4, i3, historical, j15, f3, j8);
    }

    /* renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m6090copywbzehF4$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        List list2;
        long j8 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j9 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j10 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        float f2 = (i2 & 16) != 0 ? pointerInputChange.pressure : f;
        long j11 = (i2 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j12 = (i2 & 64) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & Fields.SpotShadowColor) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & Fields.RotationX) != 0 ? pointerInputChange.type : i;
        long j13 = j8;
        List historical = (i2 & Fields.RotationY) != 0 ? pointerInputChange.getHistorical() : list;
        if ((i2 & Fields.RotationZ) != 0) {
            list2 = historical;
            j7 = pointerInputChange.scrollDelta;
        } else {
            j7 = j6;
            list2 = historical;
        }
        return pointerInputChange.m6097copywbzehF4(j13, j9, j10, z3, f2, j11, j12, z4, i3, list2, j7);
    }

    public final void consume() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.consume();
        }
    }

    @er
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m6091copy0GkPj7c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, this.pressure, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, getHistorical(), j6, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @er
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m6092copyEzrO64(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, this.pressure, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, getHistorical(), this.scrollDelta, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m6093copyJKmWfYY(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange m6097copywbzehF4 = pointerInputChange.m6097copywbzehF4(j, j2, j3, z, pointerInputChange.pressure, j4, j5, z2, i, pointerInputChange.getHistorical(), j6);
        PointerInputChange pointerInputChange2 = pointerInputChange.consumedDelegate;
        if (pointerInputChange2 != null) {
            pointerInputChange = pointerInputChange2;
        }
        m6097copywbzehF4.consumedDelegate = pointerInputChange;
        return m6097copywbzehF4;
    }

    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m6094copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange m6097copywbzehF4 = pointerInputChange.m6097copywbzehF4(j, j2, j3, z, pointerInputChange.pressure, j4, j5, z2, i, list, j6);
        PointerInputChange pointerInputChange2 = pointerInputChange.consumedDelegate;
        if (pointerInputChange2 != null) {
            pointerInputChange = pointerInputChange2;
        }
        m6097copywbzehF4.consumedDelegate = pointerInputChange;
        return m6097copywbzehF4;
    }

    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m6095copyTn9QgHE(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, pointerInputChange.getHistorical(), j6, pointerInputChange.scaleFactor, pointerInputChange.panOffset, pointerInputChange.originalEventPosition, null);
        PointerInputChange pointerInputChange3 = pointerInputChange.consumedDelegate;
        if (pointerInputChange3 != null) {
            pointerInputChange = pointerInputChange3;
        }
        pointerInputChange2.consumedDelegate = pointerInputChange;
        return pointerInputChange2;
    }

    /* renamed from: copy-lGhnTh8, reason: not valid java name */
    public final PointerInputChange m6096copylGhnTh8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6, float f2, long j7) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, list, j6, f2, j7, pointerInputChange.originalEventPosition, null);
        PointerInputChange pointerInputChange3 = pointerInputChange.consumedDelegate;
        if (pointerInputChange3 != null) {
            pointerInputChange = pointerInputChange3;
        }
        pointerInputChange2.consumedDelegate = pointerInputChange;
        return pointerInputChange2;
    }

    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m6097copywbzehF4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        PointerInputChange pointerInputChange = this;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, list, j6, pointerInputChange.scaleFactor, pointerInputChange.panOffset, pointerInputChange.originalEventPosition, null);
        PointerInputChange pointerInputChange3 = pointerInputChange.consumedDelegate;
        if (pointerInputChange3 != null) {
            pointerInputChange = pointerInputChange3;
        }
        pointerInputChange2.consumedDelegate = pointerInputChange;
        return pointerInputChange2;
    }

    public final ConsumedData getConsumed() {
        ConsumedData consumedData = this._consumed;
        if (consumedData != null) {
            return consumedData;
        }
        ConsumedData consumedData2 = new ConsumedData(this);
        this._consumed = consumedData2;
        return consumedData2;
    }

    public final PointerInputChange getConsumedDelegate$ui() {
        return this.consumedDelegate;
    }

    public final boolean getDownChange$ui() {
        return this.downChange;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? ut.d : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m6098getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m6099getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m6100getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m6101getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPositionChange$ui() {
        return this.positionChange;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m6102getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m6103getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m6104getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.isConsumed() : this.downChange || this.positionChange;
    }

    public final void setConsumedDelegate$ui(PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void setDownChange$ui(boolean z) {
        this.downChange = z;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui, reason: not valid java name */
    public final void m6105setOriginalEventPositionk4lQ0M$ui(long j) {
        this.originalEventPosition = j;
    }

    public final void setPositionChange$ui(boolean z) {
        this.positionChange = z;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m6082toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m4524toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m4524toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m6176toStringimpl(this.type)) + ", historical=" + getHistorical() + ", scrollDelta=" + ((Object) Offset.m4524toStringimpl(this.scrollDelta)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m4524toStringimpl(this.panOffset)) + ')';
    }

    @er
    public static /* synthetic */ void getConsumed$annotations() {
    }

    private static /* synthetic */ void get_consumed$annotations() {
    }

    @er
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, dq dqVar) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, float f2, long j7, long j8, dq dqVar) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<HistoricalChange>) list, j6, f2, j7, j8);
    }

    @er
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, dq dqVar) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f, long j7, dq dqVar) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, f, j7);
    }

    @er
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, dq dqVar) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.scaleFactor = f2;
        this.panOffset = j7;
        this.originalEventPosition = Offset.Companion.m4532getZeroF1C5BW0();
        this.downChange = z3;
        this.positionChange = z3;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7, dq dqVar) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f, long j7, int i2, dq dqVar) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & Fields.RotationX) != 0 ? PointerType.Companion.m6181getTouchT8wyACA() : i, (i2 & Fields.RotationY) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j6, (i2 & Fields.RotationZ) != 0 ? 1.0f : f, (i2 & Fields.CameraDistance) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j7, (dq) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f, long j7) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, z3, i, j6, f, j7, (dq) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, dq dqVar) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & Fields.RotationY) != 0 ? PointerType.Companion.m6181getTouchT8wyACA() : i, (i2 & Fields.RotationZ) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j6, (dq) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, 0.0f, 0L, 6144, (dq) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, dq dqVar) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & Fields.RotationX) != 0 ? PointerType.Companion.m6181getTouchT8wyACA() : i, (i2 & Fields.RotationY) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j6, (dq) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, 0.0f, 0L, 3072, (dq) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, dq dqVar) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, (i2 & Fields.RotationX) != 0 ? PointerType.Companion.m6181getTouchT8wyACA() : i, (dq) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, Offset.Companion.m4532getZeroF1C5BW0(), 0.0f, 0L, 6144, (dq) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7, (dq) null);
        this._historical = list;
        this.originalEventPosition = j8;
    }
}
