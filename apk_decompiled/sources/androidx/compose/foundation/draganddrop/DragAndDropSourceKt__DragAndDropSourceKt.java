package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier modifier, ky kyVar) {
        return modifier.then(new DragAndDropSourceWithDefaultShadowElement(DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), kyVar));
    }

    public static final Modifier dragAndDropSource(Modifier modifier, ky kyVar, ky kyVar2) {
        return modifier.then(new DragAndDropSourceElement(kyVar, DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), kyVar2));
    }
}
