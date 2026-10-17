package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathHitTester {
    public static final int $stable = 8;
    private Rect bounds;
    private final float[] curves;
    private final IntervalTree<PathSegment> intervals;
    private Path path;
    private final float[] roots;
    private float tolerance;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PathHitTester() {
        Path path;
        path = PathHitTesterKt.EmptyPath;
        this.path = path;
        this.tolerance = 0.5f;
        this.bounds = Rect.Companion.getZero();
        this.intervals = new IntervalTree<>();
        this.curves = new float[20];
        this.roots = new float[2];
    }

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        pathHitTester.updatePath(path, f);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m5059containsk4lQ0M(long j) {
        int i;
        int lineWinding;
        if (!this.path.isEmpty() && this.bounds.m4542containsk4lQ0M(j)) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            IntervalTree<PathSegment>.Node node = intervalTree.root;
            if (node != intervalTree.terminator) {
                ArrayList<IntervalTree<PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(node);
                i = 0;
                while (arrayList.size() > 0) {
                    IntervalTree<PathSegment>.Node remove = arrayList.remove(arrayList.size() - 1);
                    if (remove.overlaps(intBitsToFloat2, intBitsToFloat2)) {
                        PathSegment data = remove.getData();
                        data.getClass();
                        PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        int i2 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i2 == 1) {
                            lineWinding = BezierKt.lineWinding(points, intBitsToFloat, intBitsToFloat2);
                        } else if (i2 == 2) {
                            lineWinding = BezierKt.quadraticWinding(points, intBitsToFloat, intBitsToFloat2, fArr, fArr2);
                        } else if (i2 == 3) {
                            lineWinding = BezierKt.cubicWinding(points, intBitsToFloat, intBitsToFloat2, fArr, fArr2);
                        }
                        i += lineWinding;
                    }
                    if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= intBitsToFloat2) {
                        arrayList.add(remove.getLeft());
                    }
                    if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= intBitsToFloat2) {
                        arrayList.add(remove.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i = 0;
            }
            if (PathFillType.m5053equalsimpl0(this.path.mo4649getFillTypeRgk1Os(), PathFillType.Companion.m5057getEvenOddRgk1Os())) {
                i &= 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(Path path, float f) {
        this.path = path;
        this.tolerance = f;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, f);
        while (it.hasNext()) {
            PathSegment next = it.next();
            int i = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                long computeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (computeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (computeVerticalBounds$default & 4294967295L)), next);
            } else if (i == 4) {
                return;
            }
        }
    }
}
