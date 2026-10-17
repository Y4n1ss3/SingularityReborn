package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m7224updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m7056getLengthimpl;
        int m7058getMinimpl = TextRange.m7058getMinimpl(j);
        int m7057getMaximpl = TextRange.m7057getMaximpl(j);
        if (TextRange.m7062intersects5zctL8(j2, j)) {
            if (TextRange.m7050contains5zctL8(j2, j)) {
                m7058getMinimpl = TextRange.m7058getMinimpl(j2);
                m7057getMaximpl = m7058getMinimpl;
            } else {
                if (TextRange.m7050contains5zctL8(j, j2)) {
                    m7056getLengthimpl = TextRange.m7056getLengthimpl(j2);
                } else if (TextRange.m7051containsimpl(j2, m7058getMinimpl)) {
                    m7058getMinimpl = TextRange.m7058getMinimpl(j2);
                    m7056getLengthimpl = TextRange.m7056getLengthimpl(j2);
                } else {
                    m7057getMaximpl = TextRange.m7058getMinimpl(j2);
                }
                m7057getMaximpl -= m7056getLengthimpl;
            }
        } else if (m7057getMaximpl > TextRange.m7058getMinimpl(j2)) {
            m7058getMinimpl -= TextRange.m7056getLengthimpl(j2);
            m7056getLengthimpl = TextRange.m7056getLengthimpl(j2);
            m7057getMaximpl -= m7056getLengthimpl;
        }
        return TextRangeKt.TextRange(m7058getMinimpl, m7057getMaximpl);
    }
}
