package androidx.compose.ui;

import androidx.compose.runtime.State;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaQueryKt$derivedMediaQuery$1$1 extends f30 implements iy {
    final /* synthetic */ State<ky> $currentQuery$delegate;
    final /* synthetic */ UiMediaScope $mediaScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaQueryKt$derivedMediaQuery$1$1(UiMediaScope uiMediaScope, State<? extends ky> state) {
        super(0);
        this.$mediaScope = uiMediaScope;
        this.$currentQuery$delegate = state;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        ky derivedMediaQuery$lambda$0;
        derivedMediaQuery$lambda$0 = MediaQueryKt.derivedMediaQuery$lambda$0(this.$currentQuery$delegate);
        return (Boolean) derivedMediaQuery$lambda$0.invoke(this.$mediaScope);
    }
}
