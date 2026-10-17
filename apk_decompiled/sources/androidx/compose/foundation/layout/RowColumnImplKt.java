package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Placeable;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, my myVar, my myVar2, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(((Number) myVar.invoke(intrinsicMeasurable, Integer.MAX_VALUE)).intValue(), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i3 = Math.max(i3, ((Number) myVar2.invoke(intrinsicMeasurable, Integer.valueOf(min2))).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i3 = Math.max(i3, ((Number) myVar2.invoke(intrinsicMeasurable2, Integer.valueOf(round != Integer.MAX_VALUE ? Math.round(round * weight2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i3;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, my myVar, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int intValue = ((Number) myVar.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
            if (weight == 0.0f) {
                i4 += intValue;
            } else if (weight > 0.0f) {
                f += weight;
                i3 = Math.max(i3, Math.round(intValue / weight));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(i3 * f) + i4;
    }

    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout();
        }
        return false;
    }

    public static final RowColumnParentData getRowColumnParentData(Placeable placeable) {
        Object parentData = placeable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }
}
