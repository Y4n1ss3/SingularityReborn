package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathEasing implements Easing {
    public static final int $stable = 0;
    private IntervalTree<PathSegment> intervals;
    private final Path path;

    public PathEasing(Path path) {
        this.path = path;
    }

    private final void initializeEasing() {
        float[] fArr = new float[5];
        IntervalTree<PathSegment> intervalTree = new IntervalTree<>();
        PathIterator it = this.path.iterator(PathIterator.ConicEvaluation.AsQuadratics, 2.0E-4f);
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PathSegment next = it.next();
            if (!(next.getType() != PathSegment.Type.Close)) {
                PreconditionsKt.throwIllegalArgumentException("The path cannot contain a close() command.");
            }
            if (next.getType() != PathSegment.Type.Move && next.getType() != PathSegment.Type.Done) {
                long computeHorizontalBounds$default = BezierKt.computeHorizontalBounds$default(next, fArr, 0, 4, null);
                intervalTree.addInterval(Float.intBitsToFloat((int) (computeHorizontalBounds$default >> 32)), Float.intBitsToFloat((int) (computeHorizontalBounds$default & 4294967295L)), next);
            }
        }
        if (!(intervalTree.contains(0.0f) && intervalTree.contains(1.0f))) {
            PreconditionsKt.throwIllegalArgumentException("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.intervals = intervalTree;
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (this.intervals == null) {
            initializeEasing();
        }
        IntervalTree<PathSegment> intervalTree = this.intervals;
        if (intervalTree == null) {
            q10.H("intervals");
            throw null;
        }
        Object data = IntervalTree.findFirstOverlap$default(intervalTree, f, 0.0f, 2, null).getData();
        if (data == null) {
            PreconditionsKt.throwIllegalStateExceptionForNullCheck("The easing path is invalid. Make sure it is continuous on the x axis.");
            o.j();
            return 0.0f;
        }
        PathSegment pathSegment = (PathSegment) data;
        float findFirstRoot = BezierKt.findFirstRoot(pathSegment, f);
        if (Float.isNaN(findFirstRoot)) {
            PreconditionsKt.throwIllegalStateException("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
        }
        return BezierKt.evaluateY(pathSegment, findFirstRoot);
    }
}
