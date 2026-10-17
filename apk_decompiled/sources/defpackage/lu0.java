package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu0 implements TextInclusionStrategy, tf0, VisualTransformation {
    public final /* synthetic */ int a;

    public /* synthetic */ lu0(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        TransformedText None$lambda$0;
        None$lambda$0 = VisualTransformation.Companion.None$lambda$0(annotatedString);
        return None$lambda$0;
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        boolean overlaps;
        boolean ContainsAll$lambda$0;
        boolean ContainsCenter$lambda$0;
        switch (this.a) {
            case 0:
                overlaps = rect.overlaps(rect2);
                return overlaps;
            case 1:
                ContainsAll$lambda$0 = TextInclusionStrategy.Companion.ContainsAll$lambda$0(rect, rect2);
                return ContainsAll$lambda$0;
            default:
                ContainsCenter$lambda$0 = TextInclusionStrategy.Companion.ContainsCenter$lambda$0(rect, rect2);
                return ContainsCenter$lambda$0;
        }
    }
}
