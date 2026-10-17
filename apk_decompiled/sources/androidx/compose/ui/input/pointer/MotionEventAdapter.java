package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import defpackage.dq;
import defpackage.r60;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private Offset inferredCursorRawOffset;
    private boolean isInFakeFingerGesture;
    private boolean isReinterpretingFakeFingerGesture;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private final r60 previousIndirectPointerEventData = new r60();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* renamed from: convertToIndirectPointerEvent-k92h6UU$ui$default, reason: not valid java name */
    public static /* synthetic */ AndroidIndirectPointerEvent m6008convertToIndirectPointerEventk92h6UU$ui$default(MotionEventAdapter motionEventAdapter, MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, int i, Object obj) {
        if ((i & 2) != 0) {
            indirectPointerEventPrimaryDirectionalMotionAxis = null;
        }
        return motionEventAdapter.m6011convertToIndirectPointerEventk92h6UU$ui(motionEvent, indirectPointerEventPrimaryDirectionalMotionAxis);
    }

    /* renamed from: createPointerInputEventData-InuC1xA, reason: not valid java name */
    private final PointerInputEventData m6009createPointerInputEventDataInuC1xA(PositionCalculator positionCalculator, MotionEvent motionEvent, Offset offset, int i, boolean z) {
        long m4526unboximpl;
        long mo6184screenToLocalMKHz9U;
        float f;
        Float f2;
        long j;
        long m6010getComposePointerId_I2yYro = m6010getComposePointerId_I2yYro(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i)) << 32));
        if (i == 0) {
            m4526unboximpl = offset != null ? offset.m4526unboximpl() : Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32));
            mo6184screenToLocalMKHz9U = positionCalculator.mo6184screenToLocalMKHz9U(m4526unboximpl);
        } else {
            m4526unboximpl = offset != null ? offset.m4526unboximpl() : MotionEventHelper.INSTANCE.m6023toRawOffsetdBAh8RU(motionEvent, i);
            mo6184screenToLocalMKHz9U = positionCalculator.mo6184screenToLocalMKHz9U(m4526unboximpl);
        }
        int toolType = motionEvent.getToolType(i);
        int m6182getUnknownT8wyACA = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? PointerType.Companion.m6182getUnknownT8wyACA() : PointerType.Companion.m6178getEraserT8wyACA() : PointerType.Companion.m6179getMouseT8wyACA() : PointerType.Companion.m6180getStylusT8wyACA() : ComposeUiFlags.isTrackpadGestureHandlingEnabled ? ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.isInFakeFingerGesture || this.isReinterpretingFakeFingerGesture)) ? PointerType.Companion.m6179getMouseT8wyACA() : PointerType.Companion.m6181getTouchT8wyACA() : PointerType.Companion.m6181getTouchT8wyACA() : PointerType.Companion.m6182getUnknownT8wyACA();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i2 = 0;
        while (true) {
            if (i2 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i, i2);
            float historicalY = motionEvent.getHistoricalY(i, i2);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                j = m4526unboximpl;
            } else {
                j = m4526unboximpl;
                long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(historicalY) & 4294967295L) | (Float.floatToRawIntBits(historicalX) << 32));
                long historicalEventTime = motionEvent.getHistoricalEventTime(i2);
                Float valueOf = Float.valueOf(motionEvent.getHistoricalAxisValue(52, i, i2));
                f2 = valueOf.floatValue() > 0.0f ? valueOf : null;
                arrayList.add(new HistoricalChange(historicalEventTime, m4508constructorimpl2, f2 != null ? f2.floatValue() : 1.0f, motionEvent.getClassification() == 3 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i2)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i2)) << 32)) : Offset.Companion.m4532getZeroF1C5BW0(), m4508constructorimpl2, (dq) null));
            }
            i2++;
            m4526unboximpl = j;
        }
        long j2 = m4526unboximpl;
        long m4508constructorimpl3 = motionEvent.getActionMasked() == 8 ? Offset.m4508constructorimpl((Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << 32)) : Offset.Companion.m4532getZeroF1C5BW0();
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && motionEvent.getClassification() == 5) {
            Float valueOf2 = Float.valueOf(motionEvent.getAxisValue(52, i));
            f2 = valueOf2.floatValue() > 0.0f ? valueOf2 : null;
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return new PointerInputEventData(m6010getComposePointerId_I2yYro, motionEvent.getEventTime(), j2, mo6184screenToLocalMKHz9U, z, pressure, m6182getUnknownT8wyACA, this.activeHoverIds.get(motionEvent.getPointerId(i), false), arrayList, m4508constructorimpl3, f, (ComposeUiFlags.isTrackpadGestureHandlingEnabled && motionEvent.getClassification() == 3) ? Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << 32)) : Offset.Companion.m4532getZeroF1C5BW0(), m4508constructorimpl, null);
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m6010getComposePointerId_I2yYro(int i) {
        long j;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            this.motionEventToComposePointerIdMap.put(i, j2);
            j = j2;
        }
        return PointerId.m6078constructorimpl(j);
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(keyAt);
                }
            }
        }
    }

    private final void resetFakeFingerGesture() {
        this.isInFakeFingerGesture = false;
        this.isReinterpretingFakeFingerGesture = false;
        this.inferredCursorRawOffset = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* renamed from: convertToIndirectPointerEvent-k92h6UU$ui, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AndroidIndirectPointerEvent m6011convertToIndirectPointerEventk92h6UU$ui(MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        int i;
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        clearOnDeviceChange(motionEvent);
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        addFreshIds(motionEvent);
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        boolean z2 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i2 = 0;
        while (i2 < pointerCount) {
            long m6010getComposePointerId_I2yYro = m6010getComposePointerId_I2yYro(motionEvent.getPointerId(i2));
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getY(i2)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i2)) << 32));
            boolean z3 = i2 != actionIndex;
            IndirectPointerEventData indirectPointerEventData = (IndirectPointerEventData) this.previousIndirectPointerEventData.a(m6010getComposePointerId_I2yYro);
            if (i2 == actionIndex) {
                this.previousIndirectPointerEventData.d(m6010getComposePointerId_I2yYro);
            } else if (z2) {
                i = actionIndex;
                z = z2;
                this.previousIndirectPointerEventData.c(m6010getComposePointerId_I2yYro, IndirectPointerEventData.m6012boximpl(IndirectPointerEventData.m6014constructorimpl(motionEvent.getEventTime(), m4508constructorimpl, true)));
                arrayList.add(new IndirectPointerInputChange(m6010getComposePointerId_I2yYro, motionEvent.getEventTime(), m4508constructorimpl, z3, motionEvent.getPressure(i2), indirectPointerEventData == null ? IndirectPointerEventData.m6019getUptimeimpl(indirectPointerEventData.m6022unboximpl()) : motionEvent.getEventTime(), indirectPointerEventData == null ? IndirectPointerEventData.m6018getPositionF1C5BW0(indirectPointerEventData.m6022unboximpl()) : m4508constructorimpl, indirectPointerEventData == null ? IndirectPointerEventData.m6017getDownimpl(indirectPointerEventData.m6022unboximpl()) : false, null));
                i2++;
                actionIndex = i;
                z2 = z;
            }
            i = actionIndex;
            z = z2;
            arrayList.add(new IndirectPointerInputChange(m6010getComposePointerId_I2yYro, motionEvent.getEventTime(), m4508constructorimpl, z3, motionEvent.getPressure(i2), indirectPointerEventData == null ? IndirectPointerEventData.m6019getUptimeimpl(indirectPointerEventData.m6022unboximpl()) : motionEvent.getEventTime(), indirectPointerEventData == null ? IndirectPointerEventData.m6018getPositionF1C5BW0(indirectPointerEventData.m6022unboximpl()) : m4508constructorimpl, indirectPointerEventData == null ? IndirectPointerEventData.m6017getDownimpl(indirectPointerEventData.m6022unboximpl()) : false, null));
            i2++;
            actionIndex = i;
            z2 = z;
        }
        removeStaleIds(motionEvent);
        return new AndroidIndirectPointerEvent(arrayList, AndroidIndirectPointerEvent_androidKt.convertActionToIndirectPointerEventType(actionMasked), indirectPointerEventPrimaryDirectionalMotionAxis != null ? indirectPointerEventPrimaryDirectionalMotionAxis.m5589unboximpl() : AndroidIndirectPointerEvent_androidKt.indirectPrimaryDirectionalScrollAxis(motionEvent), motionEvent, null);
    }

    public final PointerInputEvent convertToPointerInputEvent$ui(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        MotionEventAdapter motionEventAdapter;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            resetFakeFingerGesture();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.isInFakeFingerGesture = true;
            }
        }
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3) {
            this.isReinterpretingFakeFingerGesture = true;
            if (motionEvent.getActionMasked() == 0) {
                this.inferredCursorRawOffset = Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(motionEvent.getRawY(0)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX(0)) << 32)));
            }
            motionEvent2 = motionEvent;
            motionEventAdapter = this;
            this.pointers.add(m6009createPointerInputEventDataInuC1xA(positionCalculator, motionEvent2, this.inferredCursorRawOffset, 0, false));
        } else {
            motionEventAdapter = this;
            PositionCalculator positionCalculator2 = positionCalculator;
            motionEventAdapter.isReinterpretingFakeFingerGesture = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                motionEventAdapter.pointers.add(motionEventAdapter.m6009createPointerInputEventDataInuC1xA(positionCalculator2, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
                positionCalculator2 = positionCalculator2;
            }
            motionEvent2 = motionEvent;
        }
        if (motionEvent2.getActionMasked() == 1) {
            motionEventAdapter.resetFakeFingerGesture();
        }
        motionEventAdapter.removeStaleIds(motionEvent2);
        return new PointerInputEvent(motionEvent2.getEventTime(), motionEventAdapter.pointers, motionEvent2);
    }

    public final void endStream(int i) {
        this.activeHoverIds.delete(i);
        this.motionEventToComposePointerIdMap.delete(i);
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui() {
        return this.motionEventToComposePointerIdMap;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class IndirectPointerEventData {
        public static final Companion Companion = new Companion(null);
        private final long packedValue;

        private /* synthetic */ IndirectPointerEventData(long j) {
            this.packedValue = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IndirectPointerEventData m6012boximpl(long j) {
            return new IndirectPointerEventData(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m6014constructorimpl(long j, long j2, boolean z) {
            return m6013constructorimpl(((j & 2147483647L) << 1) | (z ? 1L : 0L) | (Companion.packShorts((short) Float.intBitsToFloat((int) (j2 >> 32)), (short) Float.intBitsToFloat((int) (j2 & 4294967295L))) << 32));
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6015equalsimpl(long j, Object obj) {
            return (obj instanceof IndirectPointerEventData) && j == ((IndirectPointerEventData) obj).m6022unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6016equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* renamed from: getDown-impl, reason: not valid java name */
        public static final boolean m6017getDownimpl(long j) {
            return (j & 1) != 0;
        }

        /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public static final long m6018getPositionF1C5BW0(long j) {
            int i = (int) (j >>> 32);
            Companion companion = Companion;
            float unpackShort1 = companion.unpackShort1(i);
            float unpackShort2 = companion.unpackShort2(i);
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(unpackShort2) & 4294967295L) | (Float.floatToRawIntBits(unpackShort1) << 32));
        }

        /* renamed from: getUptime-impl, reason: not valid java name */
        public static final long m6019getUptimeimpl(long j) {
            return (j >> 1) & 2147483647L;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6020hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6021toStringimpl(long j) {
            return "IndirectPointerEventData(packedValue=" + j + ')';
        }

        public boolean equals(Object obj) {
            return m6015equalsimpl(this.packedValue, obj);
        }

        public final long getPackedValue() {
            return this.packedValue;
        }

        public int hashCode() {
            return m6020hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m6021toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m6022unboximpl() {
            return this.packedValue;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int packShorts(short s, short s2) {
                return (s << 16) | (65535 & s2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort1(int i) {
                return (short) (i >>> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort2(int i) {
                return (short) (65535 & i);
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m6013constructorimpl(long j) {
            return j;
        }
    }

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui$annotations() {
    }
}
