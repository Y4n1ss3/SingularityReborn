package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.ky;
import defpackage.q10;
import defpackage.ut;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {
    private final float[] anchors;
    private final List<T> keys;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ut] */
    public DefaultDraggableAnchors(List<? extends T> list, float[] fArr) {
        Object obj;
        this.keys = list;
        this.anchors = fArr;
        if (!(list.size() == fArr.length)) {
            StringBuilder sb = new StringBuilder("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ");
            sb.append(list);
            sb.append(" | Anchors: ");
            fArr.getClass();
            int length = fArr.length;
            if (length == 0) {
                obj = ut.d;
            } else if (length != 1) {
                obj = new ArrayList(fArr.length);
                for (float f : fArr) {
                    obj.add(Float.valueOf(f));
                }
            } else {
                obj = y80.D(Float.valueOf(fArr[0]));
            }
            sb.append(obj);
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        this.size = this.anchors.length;
    }

    private final float maxOrNaN(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    private final float minOrNaN(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.min(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T anchorAt(int i) {
        return (T) yi.r0(this.keys, i);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float f, boolean z) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.keys.get(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        return q10.b(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasPositionFor(T t) {
        return this.keys.indexOf(t) != -1;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.anchors) + (this.keys.hashCode() * 31)) * 31) + getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxPosition() {
        return maxOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        return minOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int i) {
        ky kyVar;
        float[] fArr = this.anchors;
        kyVar = AnchoredDraggableKt.GetOrNan;
        return (i < 0 || i >= fArr.length) ? ((Number) kyVar.invoke(Integer.valueOf(i))).floatValue() : fArr[i];
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t) {
        ky kyVar;
        int indexOf = this.keys.indexOf(t);
        float[] fArr = this.anchors;
        kyVar = AnchoredDraggableKt.GetOrNan;
        return (indexOf < 0 || indexOf >= fArr.length) ? ((Number) kyVar.invoke(Integer.valueOf(indexOf))).floatValue() : fArr[indexOf];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(anchorAt(i));
            sb2.append('=');
            sb2.append(positionAt(i));
            sb.append(sb2.toString());
            if (i < getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        return sb.toString();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float f) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.keys.get(i2);
    }
}
