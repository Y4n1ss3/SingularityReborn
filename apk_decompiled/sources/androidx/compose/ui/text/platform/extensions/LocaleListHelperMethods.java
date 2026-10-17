package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LocaleListHelperMethods {
    public static final int $stable = 0;
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    public final Object localeSpan(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(zi.a0(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void setTextLocales(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(zi.a0(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
