package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.compose.ui.text.intl.Locale;
import defpackage.o;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextClassifierHelperMethods {
    public static final int $stable = 0;
    public static final TextClassifierHelperMethods INSTANCE = new TextClassifierHelperMethods();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectedTextType.values().length];
            try {
                iArr[SelectedTextType.EditableText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedTextType.StaticText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextClassifierHelperMethods() {
    }

    public final TextClassifier createTextClassificationSession(Context context, SelectedTextType selectedTextType) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i = WhenMappings.$EnumSwitchMapping$0[selectedTextType.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                o.n();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public final boolean hasLegacyAssistItem$foundation(TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    public final LocaleList toAndroidLocaleList(androidx.compose.ui.text.intl.LocaleList localeList) {
        ArrayList arrayList = new ArrayList(zi.a0(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
