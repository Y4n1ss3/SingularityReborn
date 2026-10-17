package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long calculateNextCursorPositionAndWedgeAffinity(int i, int i2, TransformedTextFieldState transformedTextFieldState) {
        if (i == -1) {
            return CursorAndWedgeAffinity.m1376constructorimpl(i2);
        }
        boolean z = i > i2;
        long m1361mapFromTransformedjx7JFs = transformedTextFieldState.m1361mapFromTransformedjx7JFs(i);
        long m1364mapToTransformedGEjPoXI = transformedTextFieldState.m1364mapToTransformedGEjPoXI(m1361mapFromTransformedjx7JFs);
        int i3 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) && TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) || TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? (!TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) || TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i3 == 1) {
            return CursorAndWedgeAffinity.m1377constructorimpl(i, z ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i3 == 2) {
            return CursorAndWedgeAffinity.m1376constructorimpl(i);
        }
        if (i3 == 3) {
            return z ? CursorAndWedgeAffinity.m1377constructorimpl(TextRange.m7055getEndimpl(m1364mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m1377constructorimpl(TextRange.m7060getStartimpl(m1364mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i3 == 4) {
            return z ? i == TextRange.m7060getStartimpl(m1364mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m1377constructorimpl(i, WedgeAffinity.Start) : CursorAndWedgeAffinity.m1377constructorimpl(TextRange.m7055getEndimpl(m1364mapToTransformedGEjPoXI), WedgeAffinity.End) : i == TextRange.m7055getEndimpl(m1364mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m1377constructorimpl(i, WedgeAffinity.End) : CursorAndWedgeAffinity.m1377constructorimpl(TextRange.m7060getStartimpl(m1364mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        o.n();
        return 0L;
    }
}
