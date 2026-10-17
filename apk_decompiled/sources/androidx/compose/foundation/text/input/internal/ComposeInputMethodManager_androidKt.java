package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import defpackage.ed;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {
    private static ky ComposeInputMethodManagerFactory = new ed(21);

    public static final ComposeInputMethodManager ComposeInputMethodManager(View view) {
        return (ComposeInputMethodManager) ComposeInputMethodManagerFactory.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeInputMethodManager ComposeInputMethodManagerFactory$lambda$0(View view) {
        return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
    }

    public static final ky overrideComposeInputMethodManagerFactoryForTests(ky kyVar) {
        ky kyVar2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = kyVar;
        return kyVar2;
    }
}
