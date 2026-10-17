package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sq implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ my f;
    public final /* synthetic */ int g;

    public /* synthetic */ sq(Modifier modifier, my myVar, int i, int i2) {
        this.d = i2;
        this.e = modifier;
        this.f = myVar;
        this.g = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvideDefaultTextContextMenuDropdown$lambda$1;
        w01 ProvideBothDefaultProviders$lambda$5;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ProvideDefaultTextContextMenuDropdown$lambda$1 = DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown$lambda$1(this.e, this.f, this.g, composer, intValue);
                return ProvideDefaultTextContextMenuDropdown$lambda$1;
            default:
                ProvideBothDefaultProviders$lambda$5 = PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$5(this.e, this.f, this.g, composer, intValue);
                return ProvideBothDefaultProviders$lambda$5;
        }
    }
}
