package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.intl.Locale;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputTransformationKt {
    public static final InputTransformation allCaps(InputTransformation inputTransformation, Locale locale) {
        return then(inputTransformation, new AllCapsTransformation(locale));
    }

    public static final InputTransformation byValue(InputTransformation inputTransformation, my myVar) {
        return then(inputTransformation, new InputTransformationByValue(myVar));
    }

    public static final InputTransformation maxLength(InputTransformation inputTransformation, int i) {
        return then(inputTransformation, new MaxLengthFilter(i));
    }

    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
