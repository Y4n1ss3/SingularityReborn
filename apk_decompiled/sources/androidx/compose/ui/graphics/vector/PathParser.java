package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import defpackage.ac;
import defpackage.q10;
import defpackage.ut;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathParser {
    public static final int $stable = 8;
    private float[] nodeData = new float[64];
    private ArrayList<PathNode> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    private final void resizeNodeData(int i) {
        float[] fArr = this.nodeData;
        if (i >= fArr.length) {
            float[] fArr2 = new float[i * 2];
            this.nodeData = fArr2;
            ac.N(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final PathParser addPathNodes(List<? extends PathNode> list) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final PathParser parsePathString(String str) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(str, arrayList);
        return this;
    }

    public final ArrayList<PathNode> pathStringToNodes(String str, ArrayList<PathNode> arrayList) {
        int i;
        char charAt;
        float intBitsToFloat;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && q10.h(str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && q10.h(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                charAt = str.charAt(i2);
                int i4 = charAt | ' ';
                if ((i4 - 122) * (i4 - 97) <= 0 && i4 != 101) {
                    break;
                }
                if (i >= length) {
                    charAt = 0;
                    break;
                }
                i2 = i;
            }
            if (charAt != 0) {
                int i5 = charAt | ' ';
                if (i5 != 122) {
                    while (i < length && q10.h(str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    boolean z = i5 == 97;
                    int i6 = 0;
                    do {
                        long nextFloat = (!z || 3 > i6 || i6 >= 5) ? FastFloatParserKt.nextFloat(str, i, length) : FastFloatParserKt.nextFloat(str, i, Math.min(i + 1, length));
                        i = (int) (nextFloat >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = this.nodeData;
                            int i7 = i6 + 1;
                            fArr[i6] = intBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                this.nodeData = fArr2;
                                ac.N(fArr, fArr2, 0, 0, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (q10.h(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i >= length) {
                            break;
                        }
                    } while (!Float.isNaN(intBitsToFloat));
                    i3 = i6;
                }
                PathNodeKt.addPathNodes(charAt, arrayList, this.nodeData, i3);
            }
            i2 = i;
        }
        return arrayList;
    }

    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : ut.d;
    }

    public final Path toPath(Path path) {
        Path path2;
        ArrayList<PathNode> arrayList = this.nodes;
        return (arrayList == null || (path2 = PathParserKt.toPath(arrayList, path)) == null) ? AndroidPath_androidKt.Path() : path2;
    }
}
