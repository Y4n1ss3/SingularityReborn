package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$2$1 extends f30 implements ky {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ iy $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2$1(boolean z, iy iyVar) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = iyVar;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setClip(!this.$disableClip && ((Boolean) this.$isEnabled.invoke()).booleanValue());
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return w01.a;
    }
}
