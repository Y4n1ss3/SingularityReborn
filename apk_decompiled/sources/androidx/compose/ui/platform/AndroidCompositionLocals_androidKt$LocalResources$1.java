package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKt$LocalResources$1 extends f30 implements ky {
    public static final AndroidCompositionLocals_androidKt$LocalResources$1 INSTANCE = new AndroidCompositionLocals_androidKt$LocalResources$1();

    public AndroidCompositionLocals_androidKt$LocalResources$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Resources invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        return ((Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
    }
}
