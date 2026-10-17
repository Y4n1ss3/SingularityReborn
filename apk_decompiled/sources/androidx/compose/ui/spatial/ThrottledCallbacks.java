package androidx.compose.ui.spatial;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.unit.IntOffset;
import defpackage.h10;
import defpackage.ky;
import defpackage.na0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private Entry globalChangeEntries;
    private long minDebounceDeadline;
    private final na0 rectChangedMap;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;
    private long windowSize;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final ky callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis = Long.MIN_VALUE;
        private long lastUninvokedFireMillis = -1;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        public Entry(int i, long j, long j2, DelegatableNode delegatableNode, ky kyVar) {
            this.id = i;
            this.throttleMillis = j;
            this.debounceMillis = j2;
            this.node = delegatableNode;
            this.callback = kyVar;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m6872fire9b9wPM(long j, long j2, long j3, long j4, float[] fArr) {
            RelativeLayoutBounds m6873rectInfoForDg36KO4 = ThrottledCallbacksKt.m6873rectInfoForDg36KO4(this.node, j, j2, j3, j4, ThrottledCallbacks.this.getWindowSize(), fArr);
            if (m6873rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(m6873rectInfoForDg36KO4);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final ky getCallback() {
            return this.callback;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final int getId() {
            return this.id;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j) {
            this.bottomRight = j;
        }

        public final void setLastInvokeMillis(long j) {
            this.lastInvokeMillis = j;
        }

        public final void setLastUninvokedFireMillis(long j) {
            this.lastUninvokedFireMillis = j;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j) {
            this.topLeft = j;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    public ThrottledCallbacks() {
        na0 na0Var = h10.a;
        this.rectChangedMap = new na0();
        this.minDebounceDeadline = -1L;
        IntOffset.Companion companion = IntOffset.Companion;
        this.windowOffset = companion.m7750getZeronOccac();
        this.screenOffset = companion.m7750getZeronOccac();
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m6863debounceEntryb8qMvQI(Entry entry, long j, long j2, float[] fArr, long j3, long j4) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return j4;
        }
        if (j3 - entry.getLastUninvokedFireMillis() < entry.getDebounceMillis()) {
            return Math.min(j4, entry.getDebounceMillis() + entry.getLastUninvokedFireMillis());
        }
        entry.setLastInvokeMillis(j3);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m6872fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j, j2, fArr);
        return j4;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m6864fireWY9HvpM(Entry entry, long j, long j2, float[] fArr, long j3) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean z = j3 - lastInvokeMillis > entry.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(j3);
        if (z && z2) {
            entry.setLastInvokeMillis(j3);
            entry.m6872fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j4 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + j3;
        if (j4 <= 0 || debounceMillis >= j4) {
            return;
        }
        this.minDebounceDeadline = j4;
    }

    private final void linkedForEach(Entry entry, ky kyVar) {
        while (entry != null) {
            kyVar.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(na0 na0Var, ky kyVar) {
        Object[] objArr = na0Var.c;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        for (Entry entry = (Entry) objArr[(i << 3) + i3]; entry != null; entry = entry.getNext()) {
                            kyVar.invoke(entry);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final Entry multiPut(na0 na0Var, int i, Entry entry) {
        Object b = na0Var.b(i);
        if (b == null) {
            na0Var.i(i, entry);
            b = entry;
        }
        Entry entry2 = (Entry) b;
        if (entry2 != entry) {
            while (entry2.getNext() != null) {
                entry2 = entry2.getNext();
                entry2.getClass();
            }
            entry2.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean multiRemove(na0 na0Var, int i, Entry entry) {
        Entry entry2 = (Entry) na0Var.g(i);
        if (entry2 == null) {
            return false;
        }
        if (entry2 != entry) {
            int d = na0Var.d(i);
            Object[] objArr = na0Var.c;
            Object obj = objArr[d];
            na0Var.b[d] = i;
            objArr[d] = entry2;
            while (entry2 != null) {
                Entry next = entry2.getNext();
                if (next == null) {
                    return false;
                }
                if (next == entry) {
                    entry2.setNext(entry.getNext());
                    entry.setNext(null);
                    return true;
                }
                entry2 = entry2.getNext();
            }
        } else {
            Entry next2 = entry.getNext();
            entry.setNext(null);
            if (next2 != null) {
                int d2 = na0Var.d(i);
                Object[] objArr2 = na0Var.c;
                Object obj2 = objArr2[d2];
                na0Var.b[d2] = i;
                objArr2[d2] = next2;
                return true;
            }
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(entry.getNode().getNode());
            if (requireLayoutNode.getAddedToRectList$ui()) {
                LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().unsetHasCallbacksFor(requireLayoutNode);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeFromGlobalEntries(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.setNext(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = entry2;
            entry2 = next;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry3 != null) {
                    entry3.setNext(entry2.getNext());
                }
                entry.setNext(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    private final long roundDownToMultipleOf8(long j) {
        return (j >> 3) << 3;
    }

    private final void runFor(na0 na0Var, int i, ky kyVar) {
        Entry entry = (Entry) na0Var.b(i);
        while (entry != null) {
            Entry next = entry.getNext();
            kyVar.invoke(entry);
            entry = next;
        }
    }

    public final void fireGlobalChangeEntries(long j) {
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry entry2 = entry; entry2 != null; entry2 = entry2.getNext()) {
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(entry2.getNode());
                entry2.setTopLeft(LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().m6852getOffsetFromRectListForBjo55l4(requireLayoutNode));
                entry2.setBottomRight(((requireLayoutNode.getWidth() + IntOffset.m7739getXimpl(r7)) << 32) | ((requireLayoutNode.getHeight() + IntOffset.m7740getYimpl(r7)) & 4294967295L));
                m6864fireWY9HvpM(entry2, j2, j3, fArr, j);
            }
        }
    }

    public final void fireOnRectChangedEntries(long j) {
        ThrottledCallbacks throttledCallbacks = this;
        long j2 = throttledCallbacks.windowOffset;
        long j3 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        na0 na0Var = throttledCallbacks.rectChangedMap;
        Object[] objArr = na0Var.c;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                long j5 = j4;
                int i3 = 0;
                while (i3 < i2) {
                    if ((j5 & 255) < 128) {
                        Entry entry = (Entry) objArr[(i << 3) + i3];
                        while (entry != null) {
                            int i4 = i3;
                            Entry entry2 = entry;
                            throttledCallbacks.m6864fireWY9HvpM(entry2, j2, j3, fArr, j);
                            entry = entry2.getNext();
                            throttledCallbacks = this;
                            i3 = i4;
                        }
                    }
                    j5 >>= 8;
                    i3++;
                    throttledCallbacks = this;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            }
            i++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int i, long j, long j2, long j3) {
        Entry entry = (Entry) this.rectChangedMap.b(i);
        while (true) {
            Entry entry2 = entry;
            if (entry2 == null) {
                return;
            }
            entry = entry2.getNext();
            fireWithUpdatedRect$ui(entry2, j, j2, j3);
        }
    }

    public final void fireWithUpdatedRect$ui(Entry entry, long j, long j2, long j3) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = j3 - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = debounceMillis == 0;
        boolean z3 = throttleMillis == 0;
        entry.setTopLeft(j);
        entry.setBottomRight(j2);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(j3);
            entry.m6872fire9b9wPM(j, j2, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            entry.setLastUninvokedFireMillis(j3);
            long j4 = this.minDebounceDeadline;
            long j5 = j3 + debounceMillis;
            if (j4 <= 0 || j5 >= j4) {
                return;
            }
            this.minDebounceDeadline = j4;
        }
    }

    public final void forEachNewCallbackNeverInvoked(ky kyVar) {
        na0 rectChangedMap = getRectChangedMap();
        Object[] objArr = rectChangedMap.c;
        long[] jArr = rectChangedMap.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Entry entry = (Entry) objArr[(i << 3) + i3];
                        for (Entry entry2 = entry; entry2 != null; entry2 = entry2.getNext()) {
                            if (entry.getLastInvokeMillis() == Long.MIN_VALUE) {
                                kyVar.invoke(entry);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final na0 getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name */
    public final long m6865getScreenOffsetnOccac() {
        return this.screenOffset;
    }

    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name */
    public final float[] m6866getViewToWindowMatrix3i98HWw() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name */
    public final long m6867getWindowOffsetnOccac() {
        return this.windowOffset;
    }

    public final long getWindowSize() {
        return this.windowSize;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int i, long j, long j2, DelegatableNode delegatableNode, ky kyVar) {
        Entry entry = new Entry(i, j, j2 == 0 ? j : j2, delegatableNode, kyVar);
        addToGlobalEntries(entry);
        return entry;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int i, long j, long j2, DelegatableNode delegatableNode, ky kyVar) {
        return multiPut(this.rectChangedMap, i, new Entry(i, j, j2 == 0 ? j : j2, delegatableNode, kyVar));
    }

    public final void setGlobalChangeEntries(Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j) {
        this.minDebounceDeadline = j;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m6868setScreenOffsetgyyYBs(long j) {
        this.screenOffset = j;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m6869setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m6870setWindowOffsetgyyYBs(long j) {
        this.windowOffset = j;
    }

    public final void setWindowSize(long j) {
        this.windowSize = j;
    }

    public final void triggerDebounced(long j) {
        long j2;
        long j3;
        int i;
        if (this.minDebounceDeadline > j) {
            return;
        }
        long j4 = this.windowOffset;
        long j5 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        na0 na0Var = this.rectChangedMap;
        Object[] objArr = na0Var.c;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            j3 = SnapshotId_jvmKt.SnapshotIdMax;
            while (true) {
                long j6 = jArr[i2];
                j2 = SnapshotId_jvmKt.SnapshotIdMax;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    long j7 = j6;
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j7 & 255) < 128) {
                            Entry entry = (Entry) objArr[(i2 << 3) + i4];
                            while (entry != null) {
                                int i5 = i2;
                                Entry entry2 = entry;
                                j3 = m6863debounceEntryb8qMvQI(entry2, j4, j5, fArr, j, j3);
                                i4 = i4;
                                entry = entry2.getNext();
                                i2 = i5;
                            }
                            i = i4;
                        } else {
                            i = i4;
                        }
                        j7 >>= 8;
                        i4 = i + 1;
                        i2 = i2;
                    }
                    int i6 = i2;
                    if (i3 != 8) {
                        break;
                    } else {
                        i2 = i6;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            j2 = SnapshotId_jvmKt.SnapshotIdMax;
            j3 = Long.MAX_VALUE;
        }
        Entry entry3 = this.globalChangeEntries;
        if (entry3 != null) {
            long j8 = j3;
            while (entry3 != null) {
                j8 = m6863debounceEntryb8qMvQI(entry3, j4, j5, fArr, j, j8);
                entry3 = entry3.getNext();
            }
            j3 = j8;
        }
        if (j3 == j2) {
            j3 = -1;
        }
        this.minDebounceDeadline = j3;
    }

    /* renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m6871updateOffsetsLDcG7Xg(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (IntOffset.m7738equalsimpl0(j2, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = j2;
            z = true;
        }
        if (!IntOffset.m7738equalsimpl0(j, this.screenOffset)) {
            this.screenOffset = j;
            z = true;
        }
        if (fArr != null) {
            this.viewToWindowMatrix = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.windowSize) {
            return z;
        }
        this.windowSize = j3;
        return true;
    }
}
