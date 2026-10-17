package androidx.compose.material3;

import androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$1;
        w01 invoke$lambda$1$lambda$0;
        w01 invokeSuspend$lambda$0;
        int i = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                invoke$lambda$1 = ClockDialNode$pointerInputDragNode$1.invoke$lambda$1((ClockDialNode) obj3, (PointerInputChange) obj, (Offset) obj2);
                return invoke$lambda$1;
            case 1:
                invoke$lambda$1$lambda$0 = DateRangePickerKt$DateRangePicker$6.invoke$lambda$1$lambda$0((DateRangePickerState) obj3, (Long) obj, (Long) obj2);
                return invoke$lambda$1$lambda$0;
            default:
                invokeSuspend$lambda$0 = NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2.invokeSuspend$lambda$0((DrawerPredictiveBackState) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return invokeSuspend$lambda$0;
        }
    }
}
