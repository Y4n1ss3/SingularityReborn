package androidx.compose.foundation.text;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldScroll_androidKt {
    public static final OverscrollEffect rememberTextFieldOverscrollEffect(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-73012098, i, -1, "androidx.compose.foundation.text.rememberTextFieldOverscrollEffect (TextFieldScroll.android.kt:37)");
        }
        if (!ComposerKt.isTraceInProgress()) {
            return null;
        }
        ComposerKt.traceEventEnd();
        return null;
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, iy iyVar) {
        return TextFieldScrollKt.defaultTextFieldScroll(modifier, textFieldScrollerPosition, textFieldValue, visualTransformation, iyVar);
    }
}
