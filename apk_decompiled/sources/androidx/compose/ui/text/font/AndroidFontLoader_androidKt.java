package androidx.compose.ui.text.font;

import android.content.Context;
import android.util.TypedValue;
import defpackage.d41;
import defpackage.ej0;
import defpackage.fg;
import defpackage.fj0;
import defpackage.gg;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        int resId = resourceFont.getResId();
        ThreadLocal threadLocal = fj0.a;
        android.graphics.Typeface a = context.isRestricted() ? null : fj0.a(context, resId, new TypedValue(), 0, null, false);
        a.getClass();
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, hm hmVar) {
        final gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        int resId = resourceFont.getResId();
        ej0 ej0Var = new ej0() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // defpackage.ej0
            public void onFontRetrievalFailed(int i) {
                fg.this.l(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i + ')'));
            }

            @Override // defpackage.ej0
            public void onFontRetrieved(android.graphics.Typeface typeface) {
                fg.this.resumeWith(typeface);
            }
        };
        ThreadLocal threadLocal = fj0.a;
        if (context.isRestricted()) {
            ej0Var.callbackFailAsync(-4, null);
        } else {
            fj0.a(context, resId, new TypedValue(), 0, ej0Var, false);
        }
        return ggVar.s();
    }
}
