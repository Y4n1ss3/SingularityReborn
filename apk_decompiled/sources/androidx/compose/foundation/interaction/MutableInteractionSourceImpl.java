package androidx.compose.foundation.interaction;

import defpackage.hm;
import defpackage.jb0;
import defpackage.mf;
import defpackage.p01;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final jb0 interactions = p01.a(1, mf.e);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, hm hmVar) {
        Object emit = getInteractions().emit(interaction, hmVar);
        return emit == vn.d ? emit : w01.a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        return getInteractions().b(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public jb0 getInteractions() {
        return this.interactions;
    }
}
