package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidDialog_androidKt$Dialog$2$1 extends f30 implements iy {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ iy $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2$1(DialogWrapper dialogWrapper, iy iyVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = iyVar;
        this.$properties = dialogProperties;
        this.$layoutDirection = layoutDirection;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7872invoke() {
        this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m7872invoke();
        return w01.a;
    }
}
