package androidx.compose.runtime;

import defpackage.er;
import defpackage.xe0;
import defpackage.zi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HotReloaderKt {
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors();
    }

    @er
    public static final List<xe0> currentCompositionErrors() {
        List<xe0> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        for (xe0 xe0Var : currentCompositionErrors) {
            Throwable th = (Throwable) xe0Var.d;
            Boolean bool = (Boolean) xe0Var.e;
            bool.booleanValue();
            Exception exc = th instanceof Exception ? (Exception) th : null;
            xe0 xe0Var2 = exc != null ? new xe0(exc, bool) : null;
            if (xe0Var2 != null) {
                arrayList.add(xe0Var2);
            }
        }
        return arrayList;
    }

    public static final void disableHotReloadMode() {
        Recomposer.Companion.setHotReloadEnabled$runtime(false);
    }

    public static final List<xe0> getCurrentCompositionErrors() {
        List<RecomposerErrorInformation> recomposerErrors = HotReloader.Companion.getRecomposerErrors();
        ArrayList arrayList = new ArrayList(zi.a0(recomposerErrors, 10));
        for (RecomposerErrorInformation recomposerErrorInformation : recomposerErrors) {
            arrayList.add(new xe0(recomposerErrorInformation.getCause(), Boolean.valueOf(recomposerErrorInformation.isRecoverable())));
        }
        return arrayList;
    }

    public static final void invalidateGroupsWithKey(int i) {
        HotReloader.Companion.invalidateGroupsWithKey(i);
    }

    public static final void simulateHotReload(Object obj) {
        HotReloader.Companion.simulateHotReload$runtime(obj);
    }
}
