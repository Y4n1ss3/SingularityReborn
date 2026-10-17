package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.text.input.TextFieldState;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        float invoke$lambda$1$lambda$0;
        w01 invoke$lambda$0;
        boolean invoke$lambda$12$lambda$6$lambda$5;
        w01 _init_$lambda$3;
        boolean invoke$lambda$7$lambda$6$lambda$5$lambda$2;
        CharSequence text;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = BottomSheetScaffoldKt$BottomSheetScaffold$1$1.invoke$lambda$1$lambda$0((BottomSheetScaffoldState) obj);
                return Float.valueOf(invoke$lambda$1$lambda$0);
            case 1:
                invoke$lambda$0 = ClockDialNode$pointerInputDragNode$1.invoke$lambda$0((ClockDialNode) obj);
                return invoke$lambda$0;
            case 2:
                invoke$lambda$12$lambda$6$lambda$5 = FloatingActionButtonKt$ExtendedFloatingActionButton$5.invoke$lambda$12$lambda$6$lambda$5((Transition) obj);
                return Boolean.valueOf(invoke$lambda$12$lambda$6$lambda$5);
            case 3:
                _init_$lambda$3 = ModalBottomSheetDialogWrapper._init_$lambda$3((ModalBottomSheetDialogWrapper) obj);
                return _init_$lambda$3;
            case 4:
                invoke$lambda$7$lambda$6$lambda$5$lambda$2 = ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.invoke$lambda$7$lambda$6$lambda$5$lambda$2((iy) obj);
                return Boolean.valueOf(invoke$lambda$7$lambda$6$lambda$5$lambda$2);
            default:
                text = ((TextFieldState) obj).getText();
                return text;
        }
    }
}
