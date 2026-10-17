package androidx.compose.ui.autofill;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutofillModifierKt$contentType$1 extends f30 implements ky {
    final /* synthetic */ ContentType $contentType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutofillModifierKt$contentType$1(ContentType contentType) {
        super(1);
        this.$contentType = contentType;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return w01.a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, this.$contentType);
    }
}
