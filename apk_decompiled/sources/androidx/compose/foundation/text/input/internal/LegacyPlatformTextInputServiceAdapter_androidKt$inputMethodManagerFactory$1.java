package androidx.compose.foundation.text.input.internal;

import android.view.View;
import defpackage.ky;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends xy implements ky {
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 INSTANCE = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    public LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // defpackage.ky
    public final InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}
