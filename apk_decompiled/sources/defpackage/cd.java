package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.ui.focus.FocusRequester;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class cd implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cd(int i, boolean z, Object obj) {
        this.d = i;
        this.e = z;
        this.f = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 BasicTextField$lambda$13$0;
        w01 ContextMenuItem$lambda$0$0;
        w01 CoreTextField$lambda$23$0;
        w01 ExposedDropdownMenuBox$lambda$20$lambda$19;
        switch (this.d) {
            case 0:
                BasicTextField$lambda$13$0 = BasicTextFieldKt.BasicTextField$lambda$13$0(this.e, (jb0) this.f);
                return BasicTextField$lambda$13$0;
            case 1:
                ContextMenuItem$lambda$0$0 = ContextMenuUiKt.ContextMenuItem$lambda$0$0(this.e, (iy) this.f);
                return ContextMenuItem$lambda$0$0;
            case 2:
                CoreTextField$lambda$23$0 = CoreTextFieldKt.CoreTextField$lambda$23$0(this.e, (LegacyPlatformTextInputServiceAdapter) this.f);
                return CoreTextField$lambda$23$0;
            default:
                ExposedDropdownMenuBox$lambda$20$lambda$19 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$20$lambda$19(this.e, (FocusRequester) this.f);
                return ExposedDropdownMenuBox$lambda$20$lambda$19;
        }
    }
}
