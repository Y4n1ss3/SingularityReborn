package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextLinkScope e;
    public final /* synthetic */ ky f;

    public /* synthetic */ kd(TextLinkScope textLinkScope, ky kyVar, int i) {
        this.d = i;
        this.e = textLinkScope;
        this.f = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0;
        DisposableEffectResult StyleAnnotation$lambda$0$0;
        int i = this.d;
        ky kyVar = this.f;
        TextLinkScope textLinkScope = this.e;
        switch (i) {
            case 0:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0(textLinkScope, kyVar, (TextLayoutResult) obj);
                return LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0;
            default:
                StyleAnnotation$lambda$0$0 = TextLinkScope.StyleAnnotation$lambda$0$0(textLinkScope, kyVar, (DisposableEffectScope) obj);
                return StyleAnnotation$lambda$0$0;
        }
    }
}
