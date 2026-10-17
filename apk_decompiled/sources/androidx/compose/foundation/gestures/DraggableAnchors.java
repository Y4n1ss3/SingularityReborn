package androidx.compose.foundation.gestures;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T anchorAt(int i);

    T closestAnchor(float f);

    T closestAnchor(float f, boolean z);

    int getSize();

    boolean hasPositionFor(T t);

    float maxPosition();

    float minPosition();

    float positionAt(int i);

    float positionOf(T t);
}
