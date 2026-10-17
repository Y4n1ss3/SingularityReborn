package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InlineTextContentKt {
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(AnnotatedString.Builder builder, String str, String str2) {
        if (!(str2.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
        builder.append(str2);
        builder.pop();
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
