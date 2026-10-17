package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ky;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, ky kyVar, ny nyVar) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, kyVar, nyVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, ky kyVar, ny nyVar, int i, Object obj4) {
        if ((i & 16) != 0) {
            kyVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, kyVar, nyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(Composer composer, Modifier modifier) {
        if (modifier.all(ComposedModifierKt$materializeImpl$1.INSTANCE)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new ComposedModifierKt$materializeImpl$result$1(composer));
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final Modifier materializeModifier(Composer composer, Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier materializeImpl = materializeImpl(composer, modifier);
        composer.endReplaceGroup();
        return materializeImpl;
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer composer, Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, ky kyVar, ny nyVar) {
        return modifier.then(new KeyedComposedModifier1(str, obj, kyVar, nyVar));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, ky kyVar, ny nyVar) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, kyVar, nyVar));
    }

    public static final Modifier composed(Modifier modifier, ky kyVar, ny nyVar) {
        return modifier.then(new ComposedModifier(kyVar, nyVar));
    }

    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, ky kyVar, ny nyVar) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, kyVar, nyVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, ky kyVar, ny nyVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            kyVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, kyVar, nyVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, ky kyVar, ny nyVar, int i, Object obj3) {
        if ((i & 8) != 0) {
            kyVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, kyVar, nyVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, ky kyVar, ny nyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, kyVar, nyVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, ky kyVar, ny nyVar, int i, Object obj) {
        if ((i & 4) != 0) {
            kyVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, kyVar, nyVar);
    }
}
