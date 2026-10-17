package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState transformedTextFieldState, int i, ny nyVar) {
        long m1361mapFromTransformedjx7JFs = transformedTextFieldState.m1361mapFromTransformedjx7JFs(i);
        long m1364mapToTransformedGEjPoXI = transformedTextFieldState.m1364mapToTransformedGEjPoXI(m1361mapFromTransformedjx7JFs);
        return (R) nyVar.invoke((TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) && TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) || TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? (!TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) || TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, TextRange.m7048boximpl(m1361mapFromTransformedjx7JFs), TextRange.m7048boximpl(m1364mapToTransformedGEjPoXI));
    }
}
