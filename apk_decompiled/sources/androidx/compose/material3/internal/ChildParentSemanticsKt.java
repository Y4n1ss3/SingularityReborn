package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ed;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChildParentSemanticsKt {
    public static final Modifier childSemantics(Modifier modifier, ky kyVar) {
        return modifier.then(new ChildSemanticsNodeElement(kyVar));
    }

    public static /* synthetic */ Modifier childSemantics$default(Modifier modifier, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = new ed(16);
        }
        return childSemantics(modifier, kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 childSemantics$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    public static final Modifier parentSemantics(Modifier modifier, ky kyVar) {
        return modifier.then(new ParentSemanticsNodeElement(kyVar));
    }
}
