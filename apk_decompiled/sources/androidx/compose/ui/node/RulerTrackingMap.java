package androidx.compose.ui.node;

import androidx.compose.ui.layout.Ruler;
import defpackage.ac;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.sl0;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RulerTrackingMap {
    private gb0 layoutNodes;
    private final gb0 newRulers;
    private int size;
    private Ruler[] rulers = new Ruler[32];
    private float[] values = new float[32];
    private byte[] accessFlags = new byte[32];

    public RulerTrackingMap() {
        gb0 gb0Var = sl0.a;
        this.layoutNodes = new gb0();
        this.newRulers = new gb0();
    }

    public final void clear() {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.rulers[i2] = null;
            this.values[i2] = Float.NaN;
            this.accessFlags[i2] = 0;
        }
        this.size = 0;
    }

    public final boolean contains(Ruler ruler) {
        return ac.L(this.rulers, ruler);
    }

    public final float getOrDefault(Ruler ruler, float f) {
        int g0 = ac.g0(this.rulers, ruler);
        return g0 < 0 ? f : this.values[g0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void notifyChanged(boolean z, LookaheadCapablePlaceable lookaheadCapablePlaceable, fb0 fb0Var) {
        char c;
        char c2;
        long j;
        long j2;
        LayoutNode layoutNode;
        char c3;
        char c4;
        char c5;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.accessFlags[i2];
            if (b == 3) {
                gb0 gb0Var = this.newRulers;
                Ruler ruler = this.rulers[i2];
                ruler.getClass();
                gb0Var.l(ruler);
            } else if (b != 0 && fb0Var != null) {
                Ruler ruler2 = this.rulers[i2];
                ruler2.getClass();
                gb0 gb0Var2 = (gb0) fb0Var.j(ruler2);
                if (gb0Var2 != null) {
                    this.layoutNodes.k(gb0Var2);
                }
            }
        }
        int i3 = this.size;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            c = 2;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr = this.accessFlags;
            if (bArr[i4] == 2) {
                i5++;
            } else if (i5 > 0) {
                Ruler[] rulerArr = this.rulers;
                rulerArr[i4 - i5] = rulerArr[i4];
            }
            bArr[i4] = 2;
            i4++;
        }
        int i6 = this.size;
        for (int i7 = i6 - i5; i7 < i6; i7++) {
            this.rulers[i7] = null;
        }
        this.size -= i5;
        LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
        gb0 gb0Var3 = this.newRulers;
        Object[] objArr = gb0Var3.b;
        long[] jArr = gb0Var3.a;
        int length = jArr.length - 2;
        char c6 = 7;
        if (length >= 0) {
            int i8 = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i8];
                j2 = 255;
                if ((((~j3) << c6) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j3 & 255) < 128) {
                            c4 = c;
                            c5 = c6;
                            (parent == null ? lookaheadCapablePlaceable : parent).invalidateChildrenOfDefiningRuler$ui((Ruler) objArr[(i8 << 3) + i10]);
                        } else {
                            c4 = c;
                            c5 = c6;
                        }
                        j3 >>= 8;
                        i10++;
                        c = c4;
                        c6 = c5;
                    }
                    c3 = c;
                    c2 = c6;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c3 = c;
                    c2 = c6;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c = c3;
                c6 = c2;
            }
        } else {
            c2 = 7;
            j = 128;
            j2 = 255;
        }
        this.newRulers.f();
        gb0 gb0Var4 = this.layoutNodes;
        Object[] objArr2 = gb0Var4.b;
        long[] jArr2 = gb0Var4.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j4 = jArr2[i11];
                if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j4 & j2) < j && (layoutNode = (LayoutNode) ((WeakReference) objArr2[(i11 << 3) + i13]).get()) != null) {
                            if (z) {
                                layoutNode.requestLookaheadRelayout$ui(false);
                            } else {
                                layoutNode.requestRelayout$ui(false);
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length2) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.layoutNodes.f();
    }

    public final void set(Ruler ruler, float f) {
        int g0 = ac.g0(this.rulers, ruler);
        if (g0 >= 0) {
            float[] fArr = this.values;
            if (fArr[g0] != f) {
                fArr[g0] = f;
                this.accessFlags[g0] = 1;
                return;
            } else {
                byte[] bArr = this.accessFlags;
                if (bArr[g0] == 2) {
                    bArr[g0] = 0;
                    return;
                }
                return;
            }
        }
        int i = this.size;
        Ruler[] rulerArr = this.rulers;
        if (i == rulerArr.length) {
            int i2 = i * 2;
            this.rulers = (Ruler[]) Arrays.copyOf(rulerArr, i2);
            this.values = Arrays.copyOf(this.values, i2);
            this.accessFlags = Arrays.copyOf(this.accessFlags, i2);
        }
        this.rulers[i] = ruler;
        this.accessFlags[i] = 3;
        this.values[i] = f;
        this.size++;
    }
}
