package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.b40;
import defpackage.er;
import defpackage.hz;
import defpackage.ky;
import defpackage.lu0;
import defpackage.m30;
import defpackage.ny;
import defpackage.oy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyListScope {
    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, ny nyVar, int i, Object obj3) {
        if (obj3 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: item");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, nyVar);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, ky kyVar, ky kyVar2, oy oyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i2 & 2) != 0) {
            kyVar = null;
        }
        if ((i2 & 4) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }

                public final Void invoke(int i3) {
                    return null;
                }
            };
        }
        lazyListScope.items(i, kyVar, kyVar2, oyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Object items$lambda$0(int i) {
        return null;
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, ny nyVar, int i, Object obj3) {
        if (obj3 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: stickyHeader");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, nyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static w01 stickyHeader$lambda$0(ny nyVar, LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764088514, i2, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
            }
            nyVar.invoke(lazyItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static w01 stickyHeader$lambda$1(oy oyVar, LazyItemScope lazyItemScope, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(lazyItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1691919627, i, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
            }
            oyVar.invoke(lazyItemScope, 0, composer, Integer.valueOf((i & 14) | 48));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    default void item(Object obj, Object obj2, ny nyVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    @er
    /* synthetic */ default void items(int i, ky kyVar, oy oyVar) {
        items(i, kyVar, new hz(14), oyVar);
    }

    @er
    /* synthetic */ default void stickyHeader(Object obj, Object obj2, ny nyVar) {
        stickyHeader(obj, obj2, (oy) ComposableLambdaKt.composableLambdaInstance(-764088514, true, new m30(nyVar, 2)));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, ny nyVar) {
            LazyListScope.super.item(obj, obj2, nyVar);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i, ky kyVar, ky kyVar2, oy oyVar) {
            LazyListScope.super.items(i, kyVar, kyVar2, oyVar);
        }

        @Deprecated
        public static void stickyHeader(LazyListScope lazyListScope, Object obj, Object obj2, oy oyVar) {
            LazyListScope.super.stickyHeader(obj, obj2, oyVar);
        }
    }

    @er
    /* synthetic */ default void item(Object obj, ny nyVar) {
        item(obj, null, nyVar);
    }

    default void items(int i, ky kyVar, ky kyVar2, oy oyVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void stickyHeader(Object obj, Object obj2, oy oyVar) {
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(1691919627, true, new b40(oyVar, 0)));
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, ny nyVar, int i, Object obj2) {
        if (obj2 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: item");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, nyVar);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, ky kyVar, oy oyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i2 & 2) != 0) {
            kyVar = null;
        }
        lazyListScope.items(i, kyVar, oyVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, oy oyVar, int i, Object obj3) {
        if (obj3 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: stickyHeader");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, oyVar);
    }
}
