package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Alignment.Vertical e;

    public /* synthetic */ nb(Alignment.Vertical vertical, int i) {
        this.d = i;
        this.e = vertical;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int spacedBy_D5KLDUw$lambda$1;
        int aligned$lambda$1;
        int spacedBy_D5KLDUw$lambda$12;
        IntOffset height$lambda$0;
        int i = this.d;
        Alignment.Vertical vertical = this.e;
        switch (i) {
            case 0:
                spacedBy_D5KLDUw$lambda$1 = Arrangement.spacedBy_D5KLDUw$lambda$1(vertical, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(spacedBy_D5KLDUw$lambda$1);
            case 1:
                aligned$lambda$1 = Arrangement.aligned$lambda$1(vertical, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(aligned$lambda$1);
            case 2:
                spacedBy_D5KLDUw$lambda$12 = Arrangement.Absolute.spacedBy_D5KLDUw$lambda$1(vertical, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(spacedBy_D5KLDUw$lambda$12);
            default:
                height$lambda$0 = WrapContentElement.Companion.height$lambda$0(vertical, (IntSize) obj, (LayoutDirection) obj2);
                return height$lambda$0;
        }
    }
}
