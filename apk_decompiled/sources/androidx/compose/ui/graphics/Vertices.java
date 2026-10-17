package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Vertices {
    public static final int $stable = 8;
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int i, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        this.vertexMode = i;
        if (list2.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = list4.get(i2).intValue();
            if (intValue < 0 || intValue >= list.size()) {
                InlineClassHelperKt.throwIllegalArgumentException("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            sArr[i3] = (short) list4.get(i3).intValue();
        }
        this.indices = sArr;
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m4815toArgb8_81llA(list.get(i).m4771unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long m4526unboximpl = list.get(i / 2).m4526unboximpl();
            fArr[i] = i % 2 == 0 ? Float.intBitsToFloat((int) (m4526unboximpl >> 32)) : Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L));
        }
        return fArr;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m5186getVertexModec2xauaI() {
        return this.vertexMode;
    }

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, dq dqVar) {
        this(i, list, list2, list3, list4);
    }
}
