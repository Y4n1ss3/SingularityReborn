package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import defpackage.er;
import defpackage.hl0;
import defpackage.x50;
import defpackage.y40;
import defpackage.z50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE, 1, null);
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
    private static final ProvidableCompositionLocal<Resources> LocalResources = CompositionLocalKt.compositionLocalWithComputedDefaultOf(AndroidCompositionLocals_androidKt$LocalResources$1.INSTANCE);
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
    private static final ProvidableCompositionLocal<ResourceIdCache> LocalResourceIdCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.INSTANCE);
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal<y40> getLocalLifecycleOwner() {
        return x50.a;
    }

    public static final ProvidableCompositionLocal<ResourceIdCache> getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    public static final ProvidableCompositionLocal<Resources> getLocalResources() {
        return LocalResources;
    }

    public static final ProvidableCompositionLocal<hl0> getLocalSavedStateRegistryOwner() {
        return z50.a;
    }

    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @er
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    @er
    public static /* synthetic */ void getLocalSavedStateRegistryOwner$annotations() {
    }
}
