package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import defpackage.fi0;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ AnnotatedString.Range e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g(Object obj, AnnotatedString.Range range, Object obj2, int i) {
        this.d = i;
        this.f = obj;
        this.e = range;
        this.g = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        AnnotatedString.Range replaceStyle$lambda$0;
        w01 LinksComposables$lambda$0$5$0;
        int i = this.d;
        Object obj2 = this.g;
        AnnotatedString.Range range = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                replaceStyle$lambda$0 = TextAnnotatorScope.replaceStyle$lambda$0((fi0) obj3, range, (SpanStyle) obj2, (AnnotatedString.Range) obj);
                return replaceStyle$lambda$0;
            default:
                LinksComposables$lambda$0$5$0 = TextLinkScope.LinksComposables$lambda$0$5$0((TextLinkScope) obj3, range, (LinkStateInteractionSourceObserver) obj2, (TextAnnotatorScope) obj);
                return LinksComposables$lambda$0$5$0;
        }
    }
}
