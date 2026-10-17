package androidx.compose.ui.autofill;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import defpackage.fb0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidAutofillManager_androidKt {
    private static final String logTag = "ComposeAutofillManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        fb0 props$ui = semanticsConfiguration.getProps$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        return props$ui.a(semanticsActions.getOnAutofillText()) || semanticsConfiguration.getProps$ui().a(semanticsActions.getOnFillData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().a(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        fb0 props$ui = semanticsConfiguration.getProps$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (props$ui.a(semanticsActions.getOnAutofillText()) || semanticsConfiguration.getProps$ui().a(semanticsActions.getOnFillData())) {
            return true;
        }
        fb0 props$ui2 = semanticsConfiguration.getProps$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return props$ui2.a(semanticsProperties.getContentType()) || semanticsConfiguration.getProps$ui().a(semanticsProperties.getContentDataType());
    }
}
