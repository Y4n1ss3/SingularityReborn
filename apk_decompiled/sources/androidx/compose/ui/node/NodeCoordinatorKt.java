package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import defpackage.ta0;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean compareEquals(ta0 ta0Var, Map<AlignmentLine, Integer> map) {
        if (ta0Var == null || ta0Var.e != map.size()) {
            return false;
        }
        Object[] objArr = ta0Var.b;
        int[] iArr = ta0Var.c;
        long[] jArr = ta0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        int i5 = iArr[i4];
                        Integer num = map.get((AlignmentLine) obj);
                        if (num != null && num.intValue() == i5) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nextUntil-hw7D004, reason: not valid java name */
    public static final Modifier.Node m6571nextUntilhw7D004(DelegatableNode delegatableNode, int i, int i2) {
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & i) == 0) {
            return null;
        }
        while (child$ui != null) {
            int kindSet$ui = child$ui.getKindSet$ui();
            if ((kindSet$ui & i2) != 0) {
                return null;
            }
            if ((kindSet$ui & i) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }
}
