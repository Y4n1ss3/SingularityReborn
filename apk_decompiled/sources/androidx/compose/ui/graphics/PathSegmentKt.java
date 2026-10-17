package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathSegmentKt {
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new float[0], 0.0f);
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new float[0], 0.0f);

    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
