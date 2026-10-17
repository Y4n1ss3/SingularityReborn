package defpackage;

import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.intl.LocaleList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class p6 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ LocaleList e;

    public /* synthetic */ p6(int i, LocaleList localeList) {
        this.d = i;
        this.e = localeList;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String decapitalize$lambda$0;
        String capitalize$lambda$0;
        String upperCase$lambda$0;
        String lowerCase$lambda$0;
        int i = this.d;
        String str = (String) obj;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        LocaleList localeList = this.e;
        switch (i) {
            case 0:
                decapitalize$lambda$0 = AnnotatedStringKt.decapitalize$lambda$0(localeList, str, intValue, intValue2);
                return decapitalize$lambda$0;
            case 1:
                capitalize$lambda$0 = AnnotatedStringKt.capitalize$lambda$0(localeList, str, intValue, intValue2);
                return capitalize$lambda$0;
            case 2:
                upperCase$lambda$0 = AnnotatedStringKt.toUpperCase$lambda$0(localeList, str, intValue, intValue2);
                return upperCase$lambda$0;
            default:
                lowerCase$lambda$0 = AnnotatedStringKt.toLowerCase$lambda$0(localeList, str, intValue, intValue2);
                return lowerCase$lambda$0;
        }
    }
}
