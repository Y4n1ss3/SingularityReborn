package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ r1(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$12$lambda$3$lambda$2$lambda$1;
        w01 invoke$lambda$12$lambda$9$lambda$8$lambda$7;
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$0;
        int i = this.d;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                invoke$lambda$12$lambda$3$lambda$2$lambda$1 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$3$lambda$2$lambda$1(mutableState, (TextFieldValue) obj);
                return invoke$lambda$12$lambda$3$lambda$2$lambda$1;
            case 1:
                invoke$lambda$12$lambda$9$lambda$8$lambda$7 = TimePickerKt$TimeInputImpl$2$1.invoke$lambda$12$lambda$9$lambda$8$lambda$7(mutableState, (TextFieldValue) obj);
                return invoke$lambda$12$lambda$9$lambda$8$lambda$7;
            case 2:
                invoke$lambda$1$lambda$0 = TooltipKt$TooltipBox$wrappedContent$1.invoke$lambda$1$lambda$0(mutableState, (LayoutCoordinates) obj);
                return invoke$lambda$1$lambda$0;
            default:
                invoke$lambda$0 = WideNavigationRailKt$Scrim$dismissModalRail$1$1.invoke$lambda$0(mutableState, (Offset) obj);
                return invoke$lambda$0;
        }
    }
}
