package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materializeImpl$1 extends f30 implements ky {
    public static final ComposedModifierKt$materializeImpl$1 INSTANCE = new ComposedModifierKt$materializeImpl$1();

    public ComposedModifierKt$materializeImpl$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Boolean invoke(Modifier.Element element) {
        return Boolean.valueOf(!(element instanceof ComposedModifier));
    }
}
