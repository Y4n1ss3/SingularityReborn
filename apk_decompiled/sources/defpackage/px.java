package defpackage;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class px implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ FontFamilyResolverImpl e;

    public /* synthetic */ px(FontFamilyResolverImpl fontFamilyResolverImpl, int i) {
        this.d = i;
        this.e = fontFamilyResolverImpl;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        Object createDefaultTypeface$lambda$0;
        TypefaceResult preload$lambda$1;
        int i = this.d;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.e;
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        switch (i) {
            case 0:
                createDefaultTypeface$lambda$0 = FontFamilyResolverImpl.createDefaultTypeface$lambda$0(fontFamilyResolverImpl, typefaceRequest);
                return createDefaultTypeface$lambda$0;
            default:
                preload$lambda$1 = FontFamilyResolverImpl.preload$lambda$1(fontFamilyResolverImpl, typefaceRequest);
                return preload$lambda$1;
        }
    }
}
