package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materializeImpl$result$1 extends f30 implements my {
    final /* synthetic */ Composer $this_materializeImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materializeImpl$result$1(Composer composer) {
        super(2);
        this.$this_materializeImpl = composer;
    }

    @Override // defpackage.my
    public final Modifier invoke(Modifier modifier, Modifier.Element element) {
        Modifier materializeImpl;
        boolean z = element instanceof ComposedModifier;
        Modifier modifier2 = element;
        if (z) {
            ny factory = ((ComposedModifier) element).getFactory();
            factory.getClass();
            p01.f(3, factory);
            materializeImpl = ComposedModifierKt.materializeImpl(this.$this_materializeImpl, (Modifier) factory.invoke(Modifier.Companion, this.$this_materializeImpl, 0));
            modifier2 = materializeImpl;
        }
        return modifier.then(modifier2);
    }
}
