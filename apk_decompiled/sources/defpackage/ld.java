package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextLinkScope e;

    public /* synthetic */ ld(TextLinkScope textLinkScope, int i) {
        this.d = i;
        this.e = textLinkScope;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0;
        int i = this.d;
        TextLinkScope textLinkScope = this.e;
        switch (i) {
            case 0:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0(textLinkScope);
                break;
            case 1:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$8$0(textLinkScope);
                break;
            default:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = TextLinkScope._get_shouldMeasureLinks_$lambda$0(textLinkScope);
                break;
        }
        return Boolean.valueOf(LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0);
    }
}
