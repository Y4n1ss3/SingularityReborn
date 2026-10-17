package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import defpackage.bu;
import defpackage.lu0;
import defpackage.n20;
import defpackage.p01;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PathIterator extends Iterator<PathSegment>, n20 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ConicEvaluation {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ ConicEvaluation[] $VALUES;
        public static final ConicEvaluation AsConic = new ConicEvaluation("AsConic", 0);
        public static final ConicEvaluation AsQuadratics = new ConicEvaluation("AsQuadratics", 1);

        private static final /* synthetic */ ConicEvaluation[] $values() {
            return new ConicEvaluation[]{AsConic, AsQuadratics};
        }

        static {
            ConicEvaluation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private ConicEvaluation(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) $VALUES.clone();
        }
    }

    static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: calculateSize");
            return 0;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return pathIterator.calculateSize(z);
    }

    static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: next");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return pathIterator.next(fArr, i);
    }

    int calculateSize(boolean z);

    ConicEvaluation getConicEvaluation();

    Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    PathSegment.Type next(float[] fArr, int i);

    @Override // java.util.Iterator
    PathSegment next();
}
