package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ s(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        w01 invoke$lambda$1$lambda$03;
        w01 invoke$lambda$2$lambda$1$lambda$0;
        int i = this.d;
        String str = this.e;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = DatePickerKt$DatePickerContent$2$4$2.invoke$lambda$1$lambda$0(str, semanticsPropertyReceiver);
                return invoke$lambda$1$lambda$0;
            case 1:
                invoke$lambda$1$lambda$02 = DatePickerKt$MonthsNavigation$1$1.invoke$lambda$1$lambda$0(str, semanticsPropertyReceiver);
                return invoke$lambda$1$lambda$02;
            case 2:
                invoke$lambda$1$lambda$03 = DefaultBasicAlertDialogOverride$BasicAlertDialog$1.invoke$lambda$1$lambda$0(str, semanticsPropertyReceiver);
                return invoke$lambda$1$lambda$03;
            default:
                invoke$lambda$2$lambda$1$lambda$0 = TimePickerKt$TimeSelector$3.invoke$lambda$2$lambda$1$lambda$0(str, semanticsPropertyReceiver);
                return invoke$lambda$2$lambda$1$lambda$0;
        }
    }
}
