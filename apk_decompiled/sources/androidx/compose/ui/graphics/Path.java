package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import defpackage.bu;
import defpackage.er;
import defpackage.lu0;
import defpackage.o;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m5046combinexh6zSI8(int i, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo4650opN5in7k0(path, path2, i)) {
                return Path;
            }
            o.m("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Direction {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction CounterClockwise = new Direction("CounterClockwise", 0);
        public static final Direction Clockwise = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private Direction(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: addOval");
            return;
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m5045addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            return;
        }
        if ((i & 2) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        path.mo4648addPathUv8p0NA(path2, j);
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: addRect");
            return;
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: addRoundRect");
            return;
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: iterator");
            return null;
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return path.iterator(conicEvaluation, f);
    }

    void addArc(Rect rect, float f, float f2);

    void addArcRad(Rect rect, float f, float f2);

    @er
    /* synthetic */ void addOval(Rect rect);

    void addOval(Rect rect, Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo4648addPathUv8p0NA(Path path, long j);

    @er
    /* synthetic */ void addRect(Rect rect);

    void addRect(Rect rect, Direction direction);

    @er
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(RoundRect roundRect, Direction direction);

    default Path and(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4650opN5in7k0(this, path, PathOperation.Companion.m5068getIntersectb3I0S0c());
        return Path;
    }

    void arcTo(Rect rect, float f, float f2, boolean z);

    default void arcToRad(Rect rect, float f, float f2, boolean z) {
        arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo4649getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    void lineTo(float f, float f2);

    default Path minus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4650opN5in7k0(this, path, PathOperation.Companion.m5067getDifferenceb3I0S0c());
        return Path;
    }

    void moveTo(float f, float f2);

    /* renamed from: op-N5in7k0 */
    boolean mo4650opN5in7k0(Path path, Path path2, int i);

    default Path or(Path path) {
        return plus(path);
    }

    default Path plus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4650opN5in7k0(this, path, PathOperation.Companion.m5070getUnionb3I0S0c());
        return Path;
    }

    @er
    void quadraticBezierTo(float f, float f2, float f3, float f4);

    default void quadraticTo(float f, float f2, float f3, float f4) {
        quadraticBezierTo(f, f2, f3, f4);
    }

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    @er
    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    default void relativeQuadraticTo(float f, float f2, float f3, float f4) {
        relativeQuadraticBezierTo(f, f2, f3, f4);
    }

    void reset();

    default void rewind() {
        reset();
    }

    /* renamed from: setFillType-oQ8Xj4U */
    void mo4651setFillTypeoQ8Xj4U(int i);

    /* renamed from: translate-k-4lQ0M */
    void mo4653translatek4lQ0M(long j);

    default Path xor(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4650opN5in7k0(this, path, PathOperation.Companion.m5071getXorb3I0S0c());
        return Path;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Path and(Path path, Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f, float f2, boolean z) {
            Path.super.arcToRad(rect, f, f2, z);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        public static Path or(Path path, Path path2) {
            return Path.super.or(path2);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static void quadraticTo(Path path, float f, float f2, float f3, float f4) {
            Path.super.quadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f, float f2, float f3, float f4) {
            Path.super.relativeQuadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void rewind(Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m5048transform58bKbWc(Path path, float[] fArr) {
            Path.super.mo4652transform58bKbWc(fArr);
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            return Path.super.xor(path2);
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
            return Path.super.iterator(conicEvaluation, f);
        }
    }

    default PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, f);
    }

    /* renamed from: transform-58bKbWc */
    default void mo4652transform58bKbWc(float[] fArr) {
    }
}
