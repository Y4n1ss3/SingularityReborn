package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ int f;

    public /* synthetic */ rc(int i, int i2, my myVar) {
        this.d = i2;
        this.e = myVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DisableCutCopy$lambda$1;
        w01 ProvideDefaultTextContextMenuDropdown$lambda$0;
        w01 LaunchedEffect$lambda$0;
        w01 DisableSelection$lambda$0;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                DisableCutCopy$lambda$1 = BasicSecureTextFieldKt.DisableCutCopy$lambda$1(this.e, this.f, composer, intValue);
                return DisableCutCopy$lambda$1;
            case 1:
                ProvideDefaultTextContextMenuDropdown$lambda$0 = DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown$lambda$0(this.e, this.f, composer, intValue);
                return ProvideDefaultTextContextMenuDropdown$lambda$0;
            case 2:
                LaunchedEffect$lambda$0 = EffectsKt.LaunchedEffect$lambda$0(this.e, this.f, composer, intValue);
                return LaunchedEffect$lambda$0;
            default:
                DisableSelection$lambda$0 = SelectionContainerKt.DisableSelection$lambda$0(this.e, this.f, composer, intValue);
                return DisableSelection$lambda$0;
        }
    }
}
