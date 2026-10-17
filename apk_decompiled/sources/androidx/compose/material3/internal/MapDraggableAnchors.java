package androidx.compose.material3.internal;

import defpackage.q10;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final Map<T, Float> anchors;

    public MapDraggableAnchors(Map<T, Float> map) {
        this.anchors = map;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public T closestAnchor(float f, boolean z) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? floatValue - f : f - floatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? floatValue2 - f : f - floatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDraggableAnchors) {
            return q10.b(this.anchors, ((MapDraggableAnchors) obj).anchors);
        }
        return false;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public int getSize() {
        return this.anchors.size();
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public boolean hasAnchorFor(T t) {
        return this.anchors.containsKey(t);
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public float maxAnchor() {
        Float valueOf;
        Collection<Float> values = this.anchors.values();
        values.getClass();
        Iterator<T> it = values.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public float minAnchor() {
        Float valueOf;
        Collection<Float> values = this.anchors.values();
        values.getClass();
        Iterator<T> it = values.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public float positionOf(T t) {
        Float f = this.anchors.get(t);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public T closestAnchor(float f) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }
}
