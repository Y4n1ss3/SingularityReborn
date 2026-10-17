package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import defpackage.bf0;
import defpackage.lu0;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidPathIterator implements PathIterator {
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final bf0 implementation;
    private final Path path;
    private final float[] segmentPoints = new float[8];
    private final float tolerance;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f;
        Path path2 = getPath();
        if (!(path2 instanceof AndroidPath)) {
            lu0.a("Unable to obtain android.graphics.Path");
            throw null;
        }
        android.graphics.Path internalPath = ((AndroidPath) path2).getInternalPath();
        int i = WhenMappings.$EnumSwitchMapping$0[getConicEvaluation().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                o.n();
                throw null;
            }
        }
        this.implementation = new bf0(internalPath, i2, getTolerance());
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public int calculateSize(boolean z) {
        return this.implementation.d.a(z);
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public float getTolerance() {
        return this.tolerance;
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.d.b();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PathSegment next() {
        PathSegment.Type pathSegmentType;
        float[] fArr;
        float[] fArr2;
        float[] fArr3 = this.segmentPoints;
        if (fArr3.length < 8) {
            return PathSegmentKt.getDoneSegment();
        }
        bf0 bf0Var = this.implementation;
        bf0Var.getClass();
        pathSegmentType = AndroidPathIterator_androidKt.toPathSegmentType(bf0Var.d.c(fArr3, 0));
        if (pathSegmentType == PathSegment.Type.Done) {
            return PathSegmentKt.getDoneSegment();
        }
        if (pathSegmentType == PathSegment.Type.Close) {
            return PathSegmentKt.getCloseSegment();
        }
        int i = WhenMappings.$EnumSwitchMapping$1[pathSegmentType.ordinal()];
        if (i == 1) {
            fArr = new float[]{fArr3[0], fArr3[1]};
        } else if (i == 2) {
            fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3]};
        } else if (i == 3) {
            fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5]};
        } else if (i == 4) {
            fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5]};
        } else {
            if (i != 5) {
                fArr2 = new float[0];
                return new PathSegment(pathSegmentType, fArr2, pathSegmentType != PathSegment.Type.Conic ? fArr3[6] : 0.0f);
            }
            fArr = new float[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5], fArr3[6], fArr3[7]};
        }
        fArr2 = fArr;
        return new PathSegment(pathSegmentType, fArr2, pathSegmentType != PathSegment.Type.Conic ? fArr3[6] : 0.0f);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathSegment.Type next(float[] fArr, int i) {
        PathSegment.Type pathSegmentType;
        bf0 bf0Var = this.implementation;
        bf0Var.getClass();
        fArr.getClass();
        pathSegmentType = AndroidPathIterator_androidKt.toPathSegmentType(bf0Var.d.c(fArr, i));
        return pathSegmentType;
    }
}
