package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import defpackage.bu;
import defpackage.dq;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class SelectionMode {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Vertical = new SelectionMode("Vertical", 0) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        {
            dq dqVar = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation */
        public int mo1539compare3MmeM6k$foundation(long j, Rect rect) {
            if (SelectionManagerKt.m1535containsInclusiveUv8p0NA(rect, j)) {
                return 0;
            }
            int i = (int) (4294967295L & j);
            if (Float.intBitsToFloat(i) < rect.getTop()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j >> 32)) >= rect.getLeft() || Float.intBitsToFloat(i) >= rect.getBottom()) ? 1 : -1;
        }
    };
    public static final SelectionMode Horizontal = new SelectionMode("Horizontal", 1) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        {
            dq dqVar = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation */
        public int mo1539compare3MmeM6k$foundation(long j, Rect rect) {
            if (SelectionManagerKt.m1535containsInclusiveUv8p0NA(rect, j)) {
                return 0;
            }
            int i = (int) (j >> 32);
            if (Float.intBitsToFloat(i) < rect.getLeft()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j & 4294967295L)) >= rect.getTop() || Float.intBitsToFloat(i) >= rect.getRight()) ? 1 : -1;
        }
    };

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        SelectionMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    public /* synthetic */ SelectionMode(String str, int i, dq dqVar) {
        this(str, i);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1538containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* renamed from: compare-3MmeM6k$foundation, reason: not valid java name */
    public abstract int mo1539compare3MmeM6k$foundation(long j, Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation, reason: not valid java name */
    public final boolean m1540isSelected2x9bVx0$foundation(Rect rect, long j, long j2) {
        if (m1538containsInclusiveUv8p0NA(rect, j) || m1538containsInclusiveUv8p0NA(rect, j2)) {
            return true;
        }
        return (mo1539compare3MmeM6k$foundation(j, rect) > 0) ^ (mo1539compare3MmeM6k$foundation(j2, rect) > 0);
    }

    private SelectionMode(String str, int i) {
    }
}
