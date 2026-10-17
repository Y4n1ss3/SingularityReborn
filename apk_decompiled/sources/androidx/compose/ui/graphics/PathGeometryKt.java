package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathSegment;
import defpackage.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathGeometryKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Path.Direction computeDirection(Path path) {
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type next$default = PathIterator.next$default(it, fArr, 0, 2, null);
        boolean z = true;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (next$default != PathSegment.Type.Done) {
            switch (WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                case 1:
                    if (!z) {
                        return f >= 0.0f ? Path.Direction.Clockwise : Path.Direction.CounterClockwise;
                    }
                    f4 = fArr[0];
                    f5 = fArr[1];
                    z = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 2:
                    float f6 = fArr[0];
                    float f7 = fArr[1];
                    float f8 = fArr[2];
                    float f9 = fArr[3];
                    f += BezierKt.cubicArea(f6, f7, f6, f7, f8, f9, f8, f9);
                    f2 = f8;
                    f3 = f9;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 3:
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    float f12 = fArr[2];
                    float f13 = fArr[3];
                    float f14 = fArr[4];
                    float f15 = fArr[5];
                    f += BezierKt.cubicArea(f10, f11, ((f12 - f10) * 0.6666667f) + f10, ((f13 - f11) * 0.6666667f) + f11, ((f12 - f14) * 0.6666667f) + f14, ((f13 - f15) * 0.6666667f) + f15, f14, f15);
                    f2 = f14;
                    f3 = f15;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 4:
                case 5:
                    f += BezierKt.cubicArea(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    float f16 = fArr[6];
                    f3 = fArr[7];
                    f2 = f16;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 6:
                    if (Math.abs(f2 - f4) >= 1.05E-6f || Math.abs(f3 - f5) >= 1.05E-6f) {
                        f += BezierKt.cubicArea(f2, f3, f2, f3, f4, f5, f4, f5);
                        f2 = f4;
                        f3 = f5;
                    }
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 7:
                    if (f >= 0.0f) {
                    }
                    break;
                default:
                    o.n();
                    return null;
            }
        }
        if (f >= 0.0f) {
        }
    }

    public static final List<Path> divide(Path path, List<Path> list) {
        Path Path = AndroidPath_androidKt.Path();
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type next$default = PathIterator.next$default(it, fArr, 0, 2, null);
        Path path2 = Path;
        boolean z = true;
        boolean z2 = true;
        while (next$default != PathSegment.Type.Done) {
            switch (WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                case 1:
                    if (!z && !z2) {
                        list.add(path2);
                        path2 = AndroidPath_androidKt.Path();
                    }
                    path2.moveTo(fArr[0], fArr[1]);
                    z = false;
                    z2 = true;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 2:
                    path2.lineTo(fArr[2], fArr[3]);
                    z2 = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 3:
                    path2.quadraticTo(fArr[2], fArr[3], fArr[4], fArr[5]);
                    z2 = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 4:
                case 7:
                case 5:
                    path2.cubicTo(fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    z2 = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                case 6:
                    path2.close();
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                default:
                    o.n();
                    return null;
            }
        }
        if (!z && !z2) {
            list.add(path2);
        }
        return list;
    }

    public static /* synthetic */ List divide$default(Path path, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return divide(path, list);
    }

    private static final int floatCountForType(PathSegment.Type type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            case 5:
                break;
            case 6:
            case 7:
                break;
            default:
                o.n();
                break;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Path reverse(Path path, Path path2) {
        boolean z;
        float[] fArr;
        PathIterator it = path.iterator();
        int calculateSize = it.calculateSize(false);
        ArrayList arrayList = new ArrayList(calculateSize);
        ArrayList arrayList2 = new ArrayList(calculateSize);
        float[] fArr2 = new float[8];
        for (PathSegment.Type next$default = PathIterator.next$default(it, fArr2, 0, 2, null); next$default != PathSegment.Type.Done; next$default = PathIterator.next$default(it, fArr2, 0, 2, null)) {
            arrayList.add(next$default);
            if (next$default != PathSegment.Type.Close) {
                arrayList2.add(Arrays.copyOf(fArr2, floatCountForType(next$default)));
            }
        }
        int size = arrayList2.size();
        boolean z2 = false;
        boolean z3 = true;
        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
            if (z3) {
                size--;
                fArr = (float[]) arrayList2.get(size);
                fArr.getClass();
                int length = fArr.length;
                path2.moveTo(fArr[length - 2], fArr[length - 1]);
                z = false;
            } else {
                z = z3;
                fArr = (float[]) arrayList2.get(size);
            }
            int i = size;
            switch (WhenMappings.$EnumSwitchMapping$0[((PathSegment.Type) arrayList.get(size2)).ordinal()]) {
                case 1:
                    if (z2) {
                        path2.close();
                        z2 = false;
                    }
                    z3 = true;
                    size = i;
                case 2:
                    float[] fArr3 = fArr;
                    path2.lineTo(fArr3[0], fArr3[1]);
                    i--;
                    size = i;
                    z3 = z;
                case 3:
                    float[] fArr4 = fArr;
                    path2.quadraticTo(fArr4[2], fArr4[3], fArr4[0], fArr4[1]);
                    i--;
                    size = i;
                    z3 = z;
                case 4:
                case 7:
                    size = i;
                    z3 = z;
                case 5:
                    float[] fArr5 = fArr;
                    path2.cubicTo(fArr[4], fArr[5], fArr[2], fArr5[3], fArr5[0], fArr5[1]);
                    i--;
                    size = i;
                    z3 = z;
                case 6:
                    z2 = true;
                    size = i;
                    z3 = z;
                default:
                    o.n();
                    return null;
            }
        }
        if (z2) {
            path2.close();
        }
        return path2;
    }

    public static /* synthetic */ Path reverse$default(Path path, Path path2, int i, Object obj) {
        if ((i & 1) != 0) {
            path2 = AndroidPath_androidKt.Path();
        }
        return reverse(path, path2);
    }
}
