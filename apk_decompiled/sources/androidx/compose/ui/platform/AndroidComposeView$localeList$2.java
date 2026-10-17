package androidx.compose.ui.platform;

import androidx.compose.ui.text.intl.LocaleList;
import defpackage.a60;
import defpackage.b60;
import defpackage.f30;
import defpackage.iy;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$localeList$2 extends f30 implements iy {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$localeList$2(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.iy
    public final LocaleList invoke() {
        android.os.LocaleList locales = this.this$0.getConfiguration().getLocales();
        a60 a60Var = new a60(new b60(locales));
        if (locales.isEmpty()) {
            a60Var = new a60(new b60(android.os.LocaleList.getDefault()));
        }
        b60 b60Var = a60Var.a;
        int size = b60Var.a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Locale locale = b60Var.a.get(i);
            locale.getClass();
            arrayList.add(new androidx.compose.ui.text.intl.Locale(locale));
        }
        return new LocaleList(arrayList);
    }
}
