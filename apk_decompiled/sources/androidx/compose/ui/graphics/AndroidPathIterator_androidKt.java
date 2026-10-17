package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import defpackage.ff0;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidPathIterator_androidKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ff0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PathIterator PathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        return new AndroidPathIterator(path, conicEvaluation, f);
    }

    public static /* synthetic */ PathIterator PathIterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            conicEvaluation = PathIterator.ConicEvaluation.AsQuadratics;
        }
        if ((i & 4) != 0) {
            f = 0.25f;
        }
        return PathIterator(path, conicEvaluation, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathSegment.Type toPathSegmentType(ff0 ff0Var) {
        switch (WhenMappings.$EnumSwitchMapping$0[ff0Var.ordinal()]) {
            case 1:
                return PathSegment.Type.Move;
            case 2:
                return PathSegment.Type.Line;
            case 3:
                return PathSegment.Type.Quadratic;
            case 4:
                return PathSegment.Type.Conic;
            case 5:
                return PathSegment.Type.Cubic;
            case 6:
                return PathSegment.Type.Close;
            case 7:
                return PathSegment.Type.Done;
            default:
                o.n();
                return null;
        }
    }
}
