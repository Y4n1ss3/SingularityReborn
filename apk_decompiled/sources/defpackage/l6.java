package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ my f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ l6(Modifier modifier, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = myVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvidePlatformTextContextMenuToolbar$lambda$0;
        w01 ProvideDefaultPlatformTextContextMenuProviders$lambda$1;
        w01 SelectionContainer$lambda$4;
        w01 SimpleLayout$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ProvidePlatformTextContextMenuToolbar$lambda$0 = AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$0(this.e, this.f, this.g, this.h, (Composer) obj, intValue);
                return ProvidePlatformTextContextMenuToolbar$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ProvideDefaultPlatformTextContextMenuProviders$lambda$1 = PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders$lambda$1(this.e, this.f, this.g, this.h, (Composer) obj, intValue2);
                return ProvideDefaultPlatformTextContextMenuProviders$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                SelectionContainer$lambda$4 = SelectionContainerKt.SelectionContainer$lambda$4(this.e, this.f, this.g, this.h, (Composer) obj, intValue3);
                return SelectionContainer$lambda$4;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                SimpleLayout$lambda$1 = SimpleLayoutKt.SimpleLayout$lambda$1(this.e, this.f, this.g, this.h, (Composer) obj, intValue4);
                return SimpleLayout$lambda$1;
        }
    }
}
